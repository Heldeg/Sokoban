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
  Todo lo necesario para hacer mapas
====================================
*/
public class Mapa {
    /*
    *suelo   -> Matriz
    ** -1 -> pared
    **  0 -> suelo
    **  1 -> Meta
    **  2 -> caja
    **  3 -> caja y meta
    **  4 -> jugador
    **  5 ->jugador y meta
    */
    private byte [][] suelo;
    private final int n;
    private final int m;
    private Scanner scanner;
    private final String estructura;
    public Mapa(String estructura,int n,int m){
        this.suelo = new byte[n][m];
        this.m = m;
        this.n = n;
        this.estructura=estructura;
       
    }
    private byte obtenerNumero(int index){
        this.scanner = new Scanner(this.estructura);
        byte valor=-2;
        String aux;
        char caracter = scanner.nextLine().charAt(index);
        if(caracter=='-'){
            valor=-1;
        }else if(Character.isDigit(caracter)){
            aux= Character.toString(caracter);
            valor = Byte.parseByte(aux);
        }
        return valor;
    }
    
    public void insertarNumeros(){
        int j=0,k=0;
        byte valor;
        for (int i = 0; i < this.estructura.length(); i++) {  
            valor = obtenerNumero(i);
            if (valor!=-2) {
                if(!(k<m)){
                    k=0;
                    j+=1;
                }
                this.suelo[j][k] = valor;
                if(valor==-1){
                    i+=1;
                }
                k+=1;
            }
        }
    }
    
    
    public void imprimeMatriz(){
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (this.suelo[i][j]==-1) {
                    System.out.print(this.suelo[i][j]+" ");
                }else{
                    System.out.print(this.suelo[i][j]+"  ");
                }              
            }
            System.out.println("");
        }
    }
    
        
}
