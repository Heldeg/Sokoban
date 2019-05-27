package sokoban;

import java.util.LinkedList;

public class GraphNode {

    short x;
    short y;

    LinkedList<GraphNode> vecinos;
    short heuristica;
    short costo;


    GraphNode(short x, short y){


        this.x = x;
        this.y = y;
        vecinos = new LinkedList<>();
        this.costo = 0;

    }



    int manhattan(short x, short y){

        return Math.abs(this.x - x) + Math.abs(this.y - y);

    }

    int manhattan(GraphNode p){
        return manhattan(p.x, p.y);
    }





}
