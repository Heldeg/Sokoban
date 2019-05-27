package sokoban;

import java.nio.file.attribute.PosixFileAttributes;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class SokobanNode {

    SokobanNode padre;
    Short[] cajas;
    short jugador;
    short jugador_previo;
    int g;
    int h;
    HashSet<Short> puntos_accesibles;


    SokobanNode(Short[] cajas, short jugador, int h){

        this.cajas = cajas;
        this.jugador = jugador;
        this.padre = null;
        this.g = 0;
        this.h = h;
        puntos_accesibles =  new HashSet<>();


    }

    SokobanNode(Short[] cajas, short jugador, short jugador_previo, int h, SokobanNode padre){


        this.cajas = cajas;
        this.jugador = jugador;
        this.jugador_previo = jugador_previo;
        this.padre = padre;
        this.g = padre.g + 1;
        this.h = h;
        puntos_accesibles =  new HashSet<>();


    }

    LinkedList<SokobanNode> expand(SokobanProblem sokoban){

        buscar_area(sokoban);
        LinkedList<SokobanNode> hijos = new LinkedList<>();
        LinkedList<short[]> opciones = sokoban.moves(this);


        for(short[] s: opciones){
            //System.out.println("x: "+ s[0] + ", y: " + s[1] + "  --> to: " + "x: " + s[2] + ", " + s[3]);
            short nuevo_jugador = sokoban.posToId(new short[]{s[2],s[3]});
            short jugador_previo = sokoban.posToId(new short[]{s[0],s[1]});
            Short[] nuevas_cajas = new Short[this.cajas.length];
            short nueva_heuristica = 0;
            for(short i = 0; i< this.cajas.length; i++){
                short id = this.cajas[i];
                short[] pos = sokoban.IdToPos(id);

                if(pos[0] == s[2] && pos[1] == s[3]){

                   nuevas_cajas[i] = sokoban.posToId( new short[]{ s[4], s[5]});
                   nueva_heuristica+= sokoban.mapa[s[4]][s[5]].heuristica;
                }
                else{
                    nuevas_cajas[i] = cajas[i];
                    nueva_heuristica+= sokoban.mapa[pos[0]][pos[1]].heuristica;
                }

            }

            //System.out.println("\tNueva posición de jugador: " + nuevo_jugador[0] + "," +nuevo_jugador[1]);
/*
            for(short caja: cajas){
                System.out.print("\t" + caja);

            }
            System.out.println();
            for(short caja: nuevas_cajas){
                System.out.print("\t" + caja);

            }
            System.out.println();

            System.out.println("\tHeurística--> " + nueva_heuristica);
*/
            Arrays.sort(nuevas_cajas);
            hijos.add(new SokobanNode(nuevas_cajas, nuevo_jugador,jugador_previo, nueva_heuristica, this));


        }






        return hijos;
    }


    void buscar_area(SokobanProblem sokoban){
        //System.out.println("Puntos accesibles desde:" + jugador[0] + " , "+ jugador[1]);

        short [] jug = sokoban.IdToPos(jugador);
        GraphNode raiz = sokoban.mapa[jug[0]][jug[1]];

        LinkedList<GraphNode> cola = new LinkedList<>();
        HashSet<Short> visitados = new HashSet<>();
        boolean[][] hay_caja = new boolean[sokoban.n][sokoban.m];
        for(short id: cajas){
            short[] pos  =sokoban.IdToPos(id);
            hay_caja[pos[0]][pos[1]] = true;

        }
        cola.addLast(raiz);
        short id = sokoban.posToId(new short[]{raiz.x, raiz.y});
        puntos_accesibles.add(id);
        visitados.add(id);

        while(!cola.isEmpty()){
            GraphNode nodo =  cola.removeLast();
            id = sokoban.posToId(new short[]{nodo.x, nodo.y});
            puntos_accesibles.add(id);
            // System.out.println(id);

            for(GraphNode vecino: nodo.vecinos)
            {
                id = sokoban.posToId(new short[]{vecino.x, vecino.y});
                if(!hay_caja[vecino.x][vecino.y]){
                    if(!visitados.contains(id)) {

                        cola.addLast(vecino);
                        visitados.add(id);

                    }
                }
            }
        }

    }
}
