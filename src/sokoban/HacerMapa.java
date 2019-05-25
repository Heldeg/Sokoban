/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import sobras.Nodo;

/**
 *
 * @author EDDER
 */
/*
=========================================
Coleccion de mapas. Van a ser los niveles
=========================================
*/
public class HacerMapa {
    Mapa mapa;
    int numMapa;
    public HacerMapa(int numMapa){
        this.numMapa=numMapa;
        switch(numMapa){
            case 1:
                creaMapa1();
            break;
        }
    }
    public void reiniciar(){
        
    }
    public void creaMapa1(){
        
    }
    
   
}
    
