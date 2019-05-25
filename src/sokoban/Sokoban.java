/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.util.Scanner;

/**
 *
 * @author EDDER
 */
/*
====================================
              MAIN
====================================
*/
public class Sokoban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HacerMapa mapa = new HacerMapa(15);
        mapa.mapa.imprimeMatriz();

    }
    
}
