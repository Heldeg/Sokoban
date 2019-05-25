/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

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
    
    public Nodo hacerNodoConCaja(int x,int y){
        Nodo nuevo;
        nuevo = new Nodo(x, y);
        nuevo.setTieneCaja(true);
        for (int i = 0; i < this.cajas.length; i++) {
            if (this.cajas[i]==null) {
                this.cajas[i]=nuevo;
                return nuevo;
            }
        }
        return nuevo;
    }
    
    public Nodo hacerNodoMeta(int x,int y){
        Nodo nuevo;
        nuevo = new Nodo(x,y);
        nuevo.setEsMeta(true);
        for (int i = 0; i < this.metas.length; i++) {
            if (this.metas[i]==null) {
                this.metas[i]=nuevo;
                return nuevo;
            }
        }
        return nuevo;
    }
    
    public Nodo hacerNodoMetaConCaja(int x,int y){
        Nodo nuevo;
        nuevo = new Nodo(x,y);
        nuevo.setEsMeta(true);
        nuevo.setTieneCaja(true);
       for (int i = 0; i < this.cajas.length; i++) {
            if (this.cajas[i]==null) {
                this.cajas[i]=nuevo;
                break;
            }
       }
        for (int i = 0; i < this.metas.length; i++) {
            if (this.metas[i]==null) {
                this.metas[i]=nuevo;
                return nuevo;
            }
        }
        return nuevo;
    }
    
    public Nodo hacerNodo(int x,int y){
        Nodo nuevo = new Nodo(x,y);
        return nuevo;
    }
    public void cambiarPosCaja(int nodoActual,Nodo destino){
        this.cajas[nodoActual].setTieneCaja(false);
        destino.setTieneCaja(true);
        this.cajas[nodoActual] = destino;   
    }
    public void cambiarPosJugador(Nodo destino){
        this.jugador = destino;
    }
}
