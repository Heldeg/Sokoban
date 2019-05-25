/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import sobras.Nodo;
import sobras.Grafo;

/**
 *
 * @author EDDER
 */
/*
====================================
  Todo lo necesario para hacer mapas
====================================
*/
public class Mapa {
    /*
    *cajas   -> arreglo de nodos que tienen una caja
    *jugador -> posicion del jugador
    *metas   -> arreglo de nodos que son metas
    *suelo   -> grafo que representa un nivel
    */
    Nodo [] cajas;
    Nodo jugador;
    Nodo [] metas;
    Grafo suelo;
    public Mapa(int numCajas,int x,int y){
        this.cajas = new Nodo[numCajas];
        this.metas = new Nodo[numCajas];
        this.suelo = new Grafo(x, y);
        this.jugador = suelo.getInicio(); //Nodo inicial donde empieza el jugador
    }
        
    public void cambiarPosCaja(){
    }
    public void cambiarPosJugador(){
        
    }
}
