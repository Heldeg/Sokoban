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
public class Map {
    /*
    *floor   -> Matrix
    **  0 -> Floor
    **  1 -> Wall
    **  2 -> Box
    **  3 -> Goal
    **  4 -> Box and Goal
    **  5 -> Player
    **  6 -> Plater and Goal
    */
    private byte [][] floor;
    private final int n;
    private final int m;
    private Scanner scanner;
    private final String structure;
    public Map(String estructura,int n,int m){
        this.floor = new byte[n][m];
        this.m = m;
        this.n = n;
        this.structure=estructura;
       
    }
    private byte getNumbersOfString(int index){
        this.scanner = new Scanner(this.structure);
        byte value=-2;
        String aux;
        char character = scanner.nextLine().charAt(index);
        if(Character.isDigit(character)){
            aux= Character.toString(character);
            value = Byte.parseByte(aux);
        }
        return value;
    }
    
    private byte getNumbersOfString(int index,char floor, char wall, char box,
    char goal, char boxGoal,char player, char playerGoal){
        this.scanner = new Scanner(this.structure);
        byte value =-2;
        String aux;
        char character = scanner.nextLine().charAt(index);
        if(character == floor){
            character = '0';
        }else if(character == wall){
            character = '1';
        }else if (character == box){
            character = '2';
        }else if (character == goal){
            character = '3';
        }else if(character ==boxGoal){
            character = '4';
        }else if(character == player){
            character = '5';
        }else if(character == playerGoal){
            character = '6';
        }
        if(Character.isDigit(character)){
            aux= Character.toString(character);
            value = Byte.parseByte(aux);
        }
        return value;
    }
    
    public void insertNumbers(){
        int j=0,k=0;
        byte value;
        try{
        for (int i = 0; i < this.structure.length(); i++) {  
            value = getNumbersOfString(i);
            if (value!=-2) {
                if(!(k<m)){
                    k=0;
                    j+=1;
                }
                this.floor[j][k] = value;
                if(value==-1){
                    i+=1;
                }
                k+=1;
            }
        }
        }catch(Exception e){
            System.out.println("Error al ingresar numeros");
        }
    }
    public void insertNumbers(char floor, char wall, char box,
    char goal, char boxGoal,char player, char playerGoal){
        int j=0,k=0;
        byte value;
        try{
        for (int i = 0; i < this.structure.length(); i++) {  
            value = getNumbersOfString(i,floor,wall,box,goal,boxGoal,player,
                    playerGoal);
            if (value!=-2) {
                if(!(k<m)){
                    k=0;
                    j+=1;
                }
                this.floor[j][k] = value;
                if(value==-1){
                    i+=1;
                }
                k+=1;
            }
        }
        }catch(Exception e){
            System.out.println("Error al ingresar numeros");
        }
    }
    
    
    public void printMatrix(){
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (this.floor[i][j]==-1) {
                    System.out.print(this.floor[i][j]+" ");
                }else{
                    System.out.print(this.floor[i][j]+"  ");
                }              
            }
            System.out.println("");
        }
    }

    public byte[][] getFloor() {
        return floor;
    }
    
        
}
