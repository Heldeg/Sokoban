package sokoban;

import  processing.core.*;
import java.util.*;

public class Sokoban extends PApplet {


    SokobanProblem sokobanProblem =  new SokobanProblem(this);
    public void settings(){
        size(600,600);

    }

    public PImage wallImg;
    public PImage boxImg;
    public PImage playerImg;
    public PImage gboxImg;
    
    private Byte[][] getAMap(){
        byte[][] aux;
        Byte[][]myByteAux;  
        int n,m;
        //Insertar directorio
        Reader read = new Reader("maps\\prueba.txt");
        //inserta cadena obtenida y tamaño de la matriz
        MapMaker myMap = new MapMaker(read.readedStructure,8,9);
        //obtengo matriz de bytes
        aux = myMap.getMapMatrix();
        n=aux.length;
        m=aux[0].length;
        myByteAux = new Byte[n][m];
        //transformo a Bytes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myByteAux[i][j]=aux[i][j];
            }
        }
        return myByteAux;
    }
        private Byte[][] getAMap(int mapNumber){
        byte[][] aux;
        Byte[][]myByteAux;  
        int n,m;
        //Crear mapa predefinido 1-15
        MapMaker myMap = new MapMaker(mapNumber);
        //obtengo matriz de bytes
        aux = myMap.getMapMatrix();
        n=aux.length;
        m=aux[0].length;
        myByteAux = new Byte[n][m];
        //transformo a Bytes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myByteAux[i][j]=aux[i][j];
            }
        }
        return myByteAux;
    }
        
    public void setup(){
        rectMode(CORNER);
        ellipseMode(CENTER);

        strokeWeight(4);
        strokeCap(ROUND);
        textAlign(CENTER,CENTER);
        noStroke();
        wallImg = loadImage("/img/wall.png");
        playerImg =loadImage("/img/player.png");
        boxImg = loadImage("/img/box.png");
        gboxImg = loadImage("/img/gbox.png");




        /*ACAAAAAAAAAAA. PASA POR PARÁMETRO LA MATRIZZZZZZZ*/
        //utilizo el metodo
        SokobanNode solution =  sokobanProblem.solve(getAMap(1));


        System.out.println();
        for(SokobanNode nodo: sokobanProblem.camino){
            System.out.print("\tCajas");
            for(Short s: nodo.cajas) System.out.print("\t" + s);
            System.out.println("\n\tJugador: " + nodo.jugador);
        }
        frameRate(10);

    }


    public void mousePressed(){

        SokobanNode solution =  sokobanProblem.solve(SokobanProblem.test_state);

    }
    public void draw(){

        if(!sokobanProblem.camino.isEmpty())   drawState(sokobanProblem, sokobanProblem.camino.removeFirst());
        //drawState(sokobanProblem, sokobanProblem.inicio);


    }

    public void drawState(SokobanProblem estado_global, SokobanNode estado){
        int h_size = estado_global.n;
        int v_size = estado_global.m;
        int box_size = h_size >= v_size ? width/h_size: height/v_size;
        background(0);
        fill(56,135,0);
        rect(0,0, box_size* h_size, box_size * v_size  );
        for (int i = 0; i < h_size; i++) {
            for (int j = 0; j < v_size; j++) {

                if(estado_global.mapa[i][j] == null){
                    image(wallImg,i*box_size, j * box_size, box_size, box_size );

                }
                if(estado_global.es_meta[i + j* estado_global.n]){

                    stroke(0,162,232);
                    line(i*box_size + box_size/4, j * box_size + box_size/4, i* box_size + box_size - box_size/4, j * box_size + box_size - box_size/4);
                    line(i*box_size + box_size/4,   j * box_size + box_size - box_size/4, i* box_size + box_size - box_size/4, j * box_size + box_size/4);
                    noStroke();

                }
            }
        }


        for(Short s: estado.cajas){
            short[] pos = sokobanProblem.IdToPos(s);
            if(estado_global.es_meta[s]){

                image(gboxImg,pos[0]*box_size, pos[1] * box_size, box_size, box_size );
            }
            else{

                image(boxImg,pos[0]*box_size, pos[1] * box_size, box_size, box_size );

            }
        }

        short[] playerPos = sokobanProblem.IdToPos(estado.jugador);
        image(playerImg,playerPos[0]*box_size, playerPos[1] * box_size, box_size, box_size );




    }


    public void drawSokoban(Byte[][] state){
        int h_size = state.length;
        int v_size = state[0].length;
        int box_size = h_size >= v_size ? width/h_size: height/v_size;

        background(0);
        fill(56,135,0);

        rect(0,0, box_size* h_size, box_size * v_size  );

        for (int  i = 0; i < h_size; i++){
            for(int j = 0; j  < v_size; j++ ){


                switch(state[i][j]){
                    case SokobanProblem.FLOOR:
                    default:

                        break;

                    case SokobanProblem.WALL:

                        fill(0);
                        image(wallImg,i*box_size, j * box_size, box_size, box_size );

                        break;

                    case SokobanProblem.BOX:

                        fill(50,50,155);
                        image(boxImg,i*box_size, j * box_size, box_size, box_size );

                        break;

                    case SokobanProblem.GOAL:

                        fill(0,162,232);
                        stroke(0,162,232);
                        //ellipse(i*box_size + box_size/2, j * box_size + box_size/2, (int)(box_size/2.5), (int)(box_size/2.5));
                        line(i*box_size + box_size/4, j * box_size + box_size/4, i* box_size + box_size - box_size/4, j * box_size + box_size - box_size/4);
                        line(i*box_size + box_size/4,   j * box_size + box_size - box_size/4, i* box_size + box_size - box_size/4, j * box_size + box_size/4);
                        noStroke();
                        break;

                    case SokobanProblem.GBOX:

                        fill(100,255,100);
                        image(gboxImg,i*box_size, j * box_size, box_size, box_size );

                        break;
                    case SokobanProblem.PLAYER:
                    case SokobanProblem.GPLAYER:

                        image(playerImg,i*box_size, j * box_size, box_size, box_size );
                        break;

                }


                fill(0,180);
                ellipse(i*box_size + box_size/2, j * box_size + box_size/2, box_size, box_size);
                fill(255);


                if(sokobanProblem.mapa[i][j] !=null) text( sokobanProblem.posToId(new short[]{(short)i,(short)j}) + "\n " + i + " , " + j +"\n"+ sokobanProblem.mapa[i][j].heuristica ,i*box_size + box_size/2, j * box_size + box_size/2 );



            }

        }



    }
    static public void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "sokoban.Sokoban" };
        if (passedArgs != null) {
            PApplet.main(concat(appletArgs, passedArgs));
        } else {
            PApplet.main(appletArgs);
        }
    }

}
