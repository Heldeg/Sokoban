package sokoban;

import processing.core.PApplet;


import java.util.*;
import java.util.function.ToDoubleBiFunction;

public class SokobanProblem {

    PApplet parent;

    GraphNode[][] mapa;
    short playerStart;

    boolean[] es_meta;
    SokobanNode inicio;
    SokobanNode solucion;
    LinkedList<SokobanNode> camino;

    short n, m;

    public static final byte FLOOR = 0;
    public static final byte WALL  = 1;
    public static final byte BOX   = 2;
    public static final byte GOAL  = 3;
    public static final byte GBOX  = 4;
    public static final byte PLAYER = 5;
    public static final byte GPLAYER = 6;


    public static final Byte[][] test_state2 = new Byte[][]{
            {FLOOR,  WALL,  WALL,   WALL,   WALL,   WALL,   WALL,   WALL,   WALL},
            {FLOOR,  WALL,  GOAL,   WALL,   GOAL,   FLOOR,  BOX,    FLOOR,  WALL},
            {WALL,   WALL,  PLAYER, WALL,   WALL,   WALL,   FLOOR,  FLOOR,  WALL},
            {WALL,  FLOOR,  BOX,    FLOOR,  WALL,   FLOOR,  GBOX,   FLOOR,  WALL},
            {WALL,  FLOOR,  FLOOR,  BOX,    BOX,    GOAL,   BOX,    GOAL,   WALL},
            {WALL,  FLOOR,  FLOOR,  GOAL,   FLOOR,  FLOOR,  BOX,    FLOOR,  WALL},
            {WALL,   WALL,  WALL,   WALL,   WALL,   WALL,  GOAL,   FLOOR,  WALL},
            {WALL,   WALL,  WALL,   WALL,   WALL,   WALL,   WALL,   WALL,   WALL}
    };


    public static final Byte[][] test_state = new Byte[][]{
            {WALL,      WALL,       WALL,       WALL,       WALL,       WALL,       WALL},
            {WALL,      GOAL,       PLAYER,       FLOOR,      WALL,      FLOOR,       WALL},
            {WALL,      BOX,       GBOX,         FLOOR,       BOX,      FLOOR,      WALL},
            {WALL,      FLOOR,      FLOOR,      FLOOR,        BOX,        FLOOR,      WALL},
            {WALL,      FLOOR,       GOAL,       GOAL,        FLOOR,      FLOOR,       WALL},
            {WALL,      FLOOR,       FLOOR,       GBOX,      FLOOR,      FLOOR,       WALL},
            {WALL,       WALL,      WALL,       WALL,       WALL,       WALL,       WALL}
    };



    SokobanProblem(PApplet parent){

        //PROCESSING
        this.parent = parent;




    }
    void iniciarProblema(Byte[][] matriz) {
        n = (short)matriz.length;
        m = (short)matriz[0].length;

        if(n*m > Short.MAX_VALUE) {
            System.out.println("Tamaño del problema muy grande.");
            return;
        }
        mapa = new GraphNode[n][m];
        LinkedList<short[]> boxes = new LinkedList<>();
        LinkedList<short[]>  metas = new LinkedList<>();
        es_meta = new boolean[n*m];
        camino = new LinkedList<>();
        LinkedList<GraphNode> cola = new LinkedList<>();
        boolean[][] seen = new boolean[n][m];
        short jstart;
        short istart;

        outerloop:
        for (istart = 0; istart < n; istart++) {
            for (jstart = 0; jstart < m; jstart++) {

                if(matriz[istart][jstart] != WALL && !seen[istart][jstart]){

                    GraphNode current = new GraphNode(istart, jstart);
                    mapa[istart][jstart] = current;
                    cola.add(mapa[istart][jstart]);
                    seen[istart][jstart] = true;
                    break outerloop;

                }
            }
        }


        while(!cola.isEmpty()){

            GraphNode current = cola.removeLast();


            short x = current.x;
            short y = current.y;
            if(matriz[x][y] == PLAYER  || matriz[x][y] == GPLAYER ){
            playerStart = posToId(new short[]{x,y});

            }

            short[] pos = new short[2];

            pos[0] = x;
            pos[1] = y;

            if(matriz[x][y] == BOX  || matriz[x][y] == GBOX )boxes.add(pos);
            if(matriz[x][y] == GPLAYER  || matriz[x][y] == GBOX || matriz[x][y] == GOAL ){
                metas.add(pos);
                es_meta[pos[0] + n * pos[1]] = true;
            }




            seen[x][y] = true;



            //Revisar cada lado. Derecha, Arriba, Izquierda, Abajo
            if(x < n-1){
                if(matriz[x + 1][y] != WALL ) {

                        //System.out.println("\tDERECHA" + (x+1) + " " + y);
                        if(mapa[x + 1][y] == null ) mapa[x + 1][y] = new GraphNode((short)(x + 1), y);





                        current.vecinos.add(mapa[x + 1][y]);
                        if(!seen[x+1][y]){


                            cola.add(mapa[x + 1][y]);
                            seen[x+1][y] = true;




                        }
                    }

                }
            if(y > 0){
                if(matriz[x][y-1] != WALL){

                    //System.out.println("\tARRIBA" + (x) + " " + (y-1));

                    if(mapa[x][y - 1] == null ) mapa[x ][y - 1] = new GraphNode(x, (short)(y - 1));





                    current.vecinos.add(mapa[x][y - 1]);
                    if(!seen[x][y-1]){

                        cola.add(mapa[x][y - 1]);
                        seen[x][y-1] = true;

                    }




                }
            }
            if(x > 0){
                if(matriz[x -1][y] != WALL){


                    // System.out.println("\tIZQUIERDA" + (x-1) + " " + y);

                    if(mapa[x - 1][y] == null ) mapa[x - 1 ][y] =  new GraphNode((short)(x - 1), y);




                    current.vecinos.add(mapa[x - 1][y]);
                    if(!seen[x - 1][y]) {


                        cola.add(mapa[x - 1][y]);
                        seen[x - 1][y] = true;
                    }



                }
            }
            if(y < m-1){
                if(matriz[x][y + 1] != WALL) {

                    //System.out.println("\tABAJO" + x + " " + (y + 1));
                    if (mapa[x][y + 1] == null) mapa[x][y + 1] = new GraphNode(x, (short)(y + 1));




                    current.vecinos.add(mapa[x][y + 1]);
                    if(!seen[x][y + 1]){


                        cola.add(mapa[x][y + 1]);
                        seen[x][y + 1] = true;

                    }



                }
            }

            //Buscar si existen más zonas excluidas.
            if(cola.isEmpty()){
                outerloop:

                for (; istart < n; istart++) {
                    for ( jstart = 0; jstart < m; jstart++) {
                        if(matriz[istart][jstart] != WALL && !seen[istart][jstart]){

                            GraphNode temp = new GraphNode(istart, jstart);
                            mapa[istart][jstart] = temp;
                            cola.add(mapa[istart][jstart]);
                            seen[istart][jstart] = true;
                            break outerloop;

                        }
                    }
                }

            }


        }

        //Inicializar valor de la heurística para cada nodo.
        for (short i = 0; i < n; i++) {
            for (short j = 0; j < m; j++) {
                if(mapa[i][j]!= null){
                    short min = Short.MAX_VALUE;
                    for(short[] pos: metas){
                        int temp = Math.abs(pos[0] - mapa[i][j].x) + Math.abs(pos[1] - mapa[i][j].y);
                        min = temp < min ? (short)temp: min;

                    }
                    mapa[i][j].heuristica = min;
                }
            }
        }
        Short[] cajas = new Short[boxes.size()];
        int heuristica_inicial = 0;

        for (int i = 0; i < cajas.length; i++) {

            cajas[i] = posToId(boxes.get(i));
            heuristica_inicial+= mapa[boxes.get(i)[0]][boxes.get(i)[1]].heuristica;


        }

        //System.out.println(playerStart[0] +","+ playerStart[1]);
        Arrays.sort(cajas);
        inicio = new SokobanNode(cajas, playerStart, heuristica_inicial);


    }
    short posToId(short[] pos){

        return (short)(pos[0] + pos[1]*n);

    }
    short[] IdToPos(short s){
        short[] pos = new short[2];
        pos[0] = (short)(s % n);
        pos[1] = (short)(s /n);
        return  pos;
    }

    public LinkedList<short[]> moves(SokobanNode nodo) {
        LinkedList<short[]> moves = new LinkedList<>();

        short[] pos;
        GraphNode casilla;
        boolean[][] casilla_ocupada = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if(mapa[i][j] == null){

                    casilla_ocupada[i][j] = true;

                }
            }
        }
        for (short id: nodo.cajas){

            pos = IdToPos(id);
            casilla_ocupada[pos[0]][pos[1]] = true;

        }
        for(short id: nodo.cajas){

            pos = IdToPos(id);
            casilla = mapa[pos[0]][pos[1]];

            for(GraphNode v: casilla.vecinos){
                short[] p = new short[]{ v.x , v.y };
                if(nodo.puntos_accesibles.contains(posToId( p ))){

                    if( !casilla_ocupada[pos[0]-(p[0]-pos[0])][pos[1]-(p[1]-pos[1])])
                    {

                        moves.add(new short[]{p[0], p[1], pos[0], pos[1], (short) (pos[0]-(p[0]-pos[0])), (short) (pos[1]-(p[1]-pos[1]))});


                    }
                }
            }

        }
        return moves;
    }

    public SokobanNode solve(Byte[][] matriz){

        iniciarProblema(matriz);

        SokobanNode current = inicio;
        HashMap<String, ArrayList<Short>> estados_visitados = new HashMap<>();

        PriorityQueue<SokobanNode> fringe =  new PriorityQueue<>(new ASSokobanComparator() );

        fringe.add(current);
        estados_visitados.put(stateToString(current.cajas), (new ArrayList<Short>(Arrays.asList( new Short[]{current.jugador}     )    )    ) );




        while(!fringe.isEmpty()){

            current = fringe.poll();

            if(goalTest(current)) break;


            for(SokobanNode nodo: current.expand(this))
            {


                boolean equivalente = false;
                String key = stateToString(nodo.cajas);
                if(estados_visitados.containsKey(key)){
                    for(Short jugador_viejo: estados_visitados.get(key)){

                        if(puedeLlegar(nodo.jugador, jugador_viejo,nodo)) equivalente = true;

                    }

                }else{
                    estados_visitados.put(key, new ArrayList<Short>());

                }
                if(!equivalente){

                    fringe.add(nodo);
                    estados_visitados.get(key).add(nodo.jugador);


                }

            }






        }
        solucion = current;
        construirCamino(solucion);
        return current;



    }

    private void construirCamino(SokobanNode solucion) {
        camino = new LinkedList<>();
        while(solucion.padre != null){
            camino.addFirst(solucion);

            LinkedList<Short> caminoEntreCajas = camino_mas_corto(solucion.padre.jugador, solucion.jugador_previo, solucion.padre);

            if(!caminoEntreCajas.isEmpty())
                for(Short pos: caminoEntreCajas )
                {
                    camino.addFirst(new SokobanNode(solucion.padre.cajas,pos, 0));

                }
            solucion = solucion.padre;


        }
    }

    private boolean puedeLlegar(Short inicio, Short fin, SokobanNode estado){
        LinkedList<Short> camino = camino_mas_corto(inicio, fin, estado);
        return !camino.isEmpty();
    }

    private LinkedList<Short> camino_mas_corto(Short inicio, Short fin, SokobanNode estado) {
        //Inspirado en el pseudocódigo descrito en: https://en.wikipedia.org/wiki/A*_search_algorithm

        LinkedList<Short> camino= new LinkedList<>();
        short[] initial_pos = IdToPos(inicio);


        Short[] nodo_previo = new Short[n * m];
        int[] gscore = new int[n * m];
        int[] fscore = new int[n * m];

        for (int i = 0; i < n * m; i++) {
            nodo_previo[i] = -1;
            fscore[i] = Integer.MAX_VALUE;

        }

        PriorityQueue<GraphNode> fringe = new PriorityQueue<>(new ASPathComparator());
        HashSet<Short> seen = new HashSet<>();
        fringe.add(mapa[initial_pos[0]][initial_pos[1]]);
        boolean[] hay_caja = new boolean[n*m];
        for(Short s: estado.cajas){

         hay_caja[s] = true;

        }
        nodo_previo[inicio] = inicio;
        gscore[inicio] = 0;
        fscore[inicio] = manhattan(inicio, fin);

        while (!fringe.isEmpty()){
            GraphNode current = fringe.poll();
            short current_id = (short) (current.x + current.y * n);
            if(current_id  == fin){
                /*RECONSTRUIR CAMINO*/
                short id = current_id;
                camino.addLast(id);
                while(id != inicio ){
                    id = nodo_previo[id];
                    camino.addLast(id);
                }
                camino.removeLast();

                break;
            }
            seen.add(current_id);

            for(GraphNode vecino: current.vecinos ){

                short vecino_id = (short) (vecino.x + vecino.y * n);
                if (seen.contains(vecino_id) || hay_caja[vecino_id]) {
                    continue;
                }

                short new_gscore = (short) (gscore[current_id] + manhattan(current_id, vecino_id));


                if(!fringe.contains(vecino_id)){
                    fringe.add(vecino);
                } else if (new_gscore >= gscore[vecino_id]) continue;

                nodo_previo[vecino_id] = current_id;
                gscore[vecino_id] = new_gscore;
                fscore[vecino_id] = gscore[vecino_id] + manhattan(vecino_id, fin);



            }


        }


        return camino;
    }

    private int manhattan(Short inicio, Short fin) {

        short[] apos = IdToPos(inicio);
        short[] bpos = IdToPos(fin);
        return Math.abs(apos[0] - bpos[0]) + Math.abs(apos[1] - bpos[1]);

    }

    private String stateToString(Short[] cajas) {
        String code = "";

        for(Short s: cajas) code += s + "/";




        return code;
    }

    private boolean goalTest(SokobanNode current) {

        for ( Short s: current.cajas) {
            if(!es_meta[s]) return false;
        }
        return true;

    }


    public class ASPathComparator implements Comparator<GraphNode> {


        @Override
        public int compare(GraphNode a, GraphNode b) {

            if(a.heuristica + a.costo > b.heuristica + b.costo) return 1;
            else if (a.heuristica + a.costo < b.heuristica + b.costo) return -1;
            return 0;
        }

    }

    public class ASSokobanComparator implements Comparator<SokobanNode>{
        @Override
        public int compare(SokobanNode a, SokobanNode b) {

            if(a.h + a.g > b.h + b.g) return 1;
            else if (a.h + a.g < b.h + b.g) return -1;
            return 0;


        }
    }
}
