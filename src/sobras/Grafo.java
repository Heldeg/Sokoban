/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobras;

/**
 *
 * @author EDDER
 */

/*
=====================================
Todo lo necesario para crear un grafo
=====================================
*/
public class Grafo {
 
    Nodo inicio;

    public Grafo(int x, int y) {
        this.inicio = new Nodo(x,y);
    }
    public void hacerConexionHor(Nodo izq,Nodo der){
        izq.caminos[1] = der;
        der.caminos[0] = izq;
    }
    public void hacerConexionVer(Nodo arr,Nodo abj){
        arr.caminos[3] = abj;
        abj.caminos[2] = arr;
    }
    public Nodo hacerNodo(int x, int y){
        Nodo ans= new Nodo(x,y);
        return ans;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
}
