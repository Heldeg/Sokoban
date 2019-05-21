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
        this.mapa = new Mapa(4, 4, 4);
        Nodo aux1,aux2,aux3;
        aux1 = mapa.hacerNodoConCaja(3, 4);
        aux2 = mapa.hacerNodo(2, 4);
        
        mapa.suelo.hacerConexionHor(aux1, mapa.suelo.inicio);
        mapa.suelo.hacerConexionHor(aux2, aux1);
        
        aux1= mapa.hacerNodoMeta(1, 4);
        mapa.suelo.hacerConexionHor(aux1, aux2);
        
        aux2= mapa.hacerNodoConCaja(4, 5);
        aux1= mapa.hacerNodoMeta(4, 6);
    
        mapa.suelo.hacerConexionVer(mapa.suelo.inicio, aux2);
        mapa.suelo.hacerConexionVer(aux2, aux1);
        
        aux3= mapa.hacerNodo(4, 3);
        mapa.suelo.hacerConexionVer(aux3, mapa.suelo.inicio);
        
        aux1=mapa.hacerNodoConCaja(5, 3);
        aux2=mapa.hacerNodoMeta(6, 3);
        
        mapa.suelo.hacerConexionHor(aux3, aux1);
        mapa.suelo.hacerConexionHor(aux1, aux2);
        
        aux1=mapa.hacerNodoConCaja(3, 3);
        
        mapa.suelo.hacerConexionHor(aux1, aux3);
        
        aux2=mapa.hacerNodo(3, 2);
        
        mapa.suelo.hacerConexionVer(aux2, aux1);
        
        aux1=mapa.hacerNodoMeta(3, 1);
        
        mapa.suelo.hacerConexionVer(aux1, aux2);
    }
    
}
