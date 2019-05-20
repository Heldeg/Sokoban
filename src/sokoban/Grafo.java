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
=====================================
Todo lo necesario para crear un grafo
=====================================
*/
public class Grafo {
    public class Nodo {
        private boolean tieneCaja;
        private boolean esMeta;
        private final Nodo [] caminos;
        private final int [] coordenadas;
        public Nodo(int x, int y){
            this.coordenadas = new int[2];
            this.coordenadas[0] = x;
            this.coordenadas[1] = y;
            this.caminos = new Nodo[4];
        }
        public Nodo(int x, int y,boolean meta){
            this.coordenadas = new int[2];
            this.coordenadas[0] = x;
            this.coordenadas[1] = y;
            this.caminos = new Nodo[4];
            this.esMeta = meta;
        }
        /*Caminos
          0->izq
          1->der
          2->arr
          3->abj
        */

        public boolean isTieneCaja() {
            return tieneCaja;
        }

        public void setTieneCaja(boolean tieneCaja) {
            this.tieneCaja = tieneCaja;
        }

        public boolean isEsMeta() {
            return esMeta;
        }

        public void setEsMeta(boolean esMeta) {
            this.esMeta = esMeta;
        }

        public Nodo[] getCaminos() {
            return caminos;
        }

        public int[] getCoordenadas() {
            return coordenadas;
        }
        
    }
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
    public Nodo hacerNodo(int x, int y,boolean meta){
        Nodo ans= new Nodo(x,y);
        ans.setEsMeta(meta);
        return ans;
    }
}
