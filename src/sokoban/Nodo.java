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
public class Nodo {
     /*
        *tieneCaja   -> booleano que indica si tiene una caja
        *esMeta      -> booleano que indica si es una meta
        *coordenadas -> arreglo de tamaño 2 que contiene las coordenadas de un nodo
        */
        private boolean tieneCaja;
        private boolean esMeta;
        final Nodo [] caminos;
        private final int [] coordenadas;
        
        public Nodo(int x, int y){
            this.coordenadas = new int[2];
            this.coordenadas[0] = x;
            this.coordenadas[1] = y;
            this.caminos = new Nodo[4];
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
