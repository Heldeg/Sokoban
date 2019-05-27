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
        /*
        for (int i = 1; i < 16; i++) {
            System.out.println("----------------------------"+i);
            HacerMapa mapa = new HacerMapa(i);
            mapa.mapa.imprimeMatriz();
        }
        */
        System.out.println("lectura");
        Lectura l = new Lectura("maps\\prueba.txt");
        System.out.println(l.estructuraLeida);
        System.out.println("");
        HacerMapa mapa = new HacerMapa(l.estructuraLeida,8,9);
        mapa.mapa.imprimeMatriz();

    }
    
}
