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
       String cadena = "-1,-1,-1,-1,-1,-1,-1,-1,-1"
               +       "-1,-1,-1,1 ,-1,-1,-1,-1,-1"
               +       "-1,-1,-1,0 ,-1,-1,-1,-1,-1"
               +       "-1,-1,-1,0 ,0 ,0 ,1 ,-1,-1"
               +       "-1,1 ,0 ,0 ,0 ,-1,-1,-1,-1"
               +       "-1,-1,-1,-1,0 ,-1,-1,-1,-1"
               +       "-1,-1,-1,-1,1 ,-1,-1,-1,-1"
               +       "-1,-1,-1,-1,-1,-1,-1,-1,-1"
               +       "-1,-1,-1,-1,-1,-1,-1,-1,-1";
        System.out.println(cadena);
        /*
        Scanner s = new Scanner(cadena);
        char v = s.nextLine().charAt(1);
        System.out.println(v);
        System.out.println(Character.isDigit(v));
        */
        Mapa mapa = new Mapa(cadena, 9, 9);
        System.out.println("");
        mapa.insertarNumeros();
        mapa.imprimeMatriz();
    }
    
}
