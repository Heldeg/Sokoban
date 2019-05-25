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
    
    public void creaMapa2(){
        Nodo aux1,aux2,aux3,aux4;
        this.mapa = new Mapa(3, 3, 2);
        
        aux1= mapa.hacerNodo(3, 1);
        
        mapa.suelo.hacerConexionVer(aux1, mapa.suelo.inicio);
        
        aux2= mapa.hacerNodo(2, 1);
        aux3= mapa.hacerNodo(1, 1);
        
        mapa.suelo.hacerConexionHor(aux2, aux1);
        mapa.suelo.hacerConexionHor(aux3, aux2);
        
        aux1= mapa.hacerNodoConCaja(2, 2);
        
        mapa.suelo.hacerConexionHor(aux1, mapa.suelo.inicio);
        mapa.suelo.hacerConexionVer(aux2, aux1);
        
        aux2= mapa.hacerNodo(1, 2);
        
        mapa.suelo.hacerConexionHor(aux2, aux1);
        mapa.suelo.hacerConexionVer(aux3, aux2);
        
        aux3= mapa.hacerNodo(1, 3);
        
        mapa.suelo.hacerConexionVer(aux2, aux3);
        
        aux2= mapa.hacerNodoConCaja(2, 3);
        
        mapa.suelo.hacerConexionHor(aux3, aux2);
        mapa.suelo.hacerConexionVer(aux1, aux2);
        
        aux1= mapa.hacerNodoConCaja(3, 3);
        aux3= mapa.hacerNodo(3, 4);
        
        mapa.suelo.hacerConexionHor(aux2, aux1);
        mapa.suelo.hacerConexionVer(mapa.suelo.inicio, aux1);
        mapa.suelo.hacerConexionVer(aux1, aux3);
        
        aux1= mapa.hacerNodo(3, 5);
        aux2= mapa.hacerNodo(4, 5);
        
        mapa.suelo.hacerConexionVer(aux3, aux1);
        mapa.suelo.hacerConexionHor(aux1, aux2);
        
        aux3= mapa.hacerNodo(4, 6);
        aux4= mapa.hacerNodo(3, 6);
        
        mapa.suelo.hacerConexionVer(aux2, aux3);
        mapa.suelo.hacerConexionVer(aux1, aux4);
        mapa.suelo.hacerConexionHor(aux4, aux3);
        
        aux1= mapa.hacerNodo(4, 7);
        
        mapa.suelo.hacerConexionVer(aux3, aux1);
        
        aux3= mapa.hacerNodo(3, 7);
        
        mapa.suelo.hacerConexionVer(aux4, aux3);
        mapa.suelo.hacerConexionHor(aux3, aux1);
        
        aux1= mapa.hacerNodo(2, 7);
        
        mapa.suelo.hacerConexionHor(aux1, aux3);
        
        aux3= mapa.hacerNodo(2, 6);
        
        mapa.suelo.hacerConexionVer(aux3, aux1);
        mapa.suelo.hacerConexionHor(aux3, aux4);
        
        aux3= mapa.hacerNodo(5, 5);
        aux4= mapa.hacerNodo(6, 5);
        aux1= mapa.hacerNodo(6, 6);
        
        mapa.suelo.hacerConexionHor(aux2, aux3);
        mapa.suelo.hacerConexionHor(aux3, aux4);
        mapa.suelo.hacerConexionVer(aux4, aux1);
        
        aux2= mapa.hacerNodo(7, 6);
        aux3= mapa.hacerNodoMeta(7, 5);
        
        mapa.suelo.hacerConexionHor(aux4, aux3);
        mapa.suelo.hacerConexionHor(aux1, aux2);
        mapa.suelo.hacerConexionVer(aux3, aux2);
        
        aux4= mapa.hacerNodoMeta(7, 4);
        aux1= mapa.hacerNodoMeta(7, 3);
        
        mapa.suelo.hacerConexionVer(aux4, aux3);
        mapa.suelo.hacerConexionVer(aux1, aux4);
    }
    
    public void creaMapa3(){
      Nodo aux1,aux2,aux3,aux4,aux5,aux6;
      
      this.mapa = new Mapa(5, 2, 2);
      aux1= mapa.hacerNodo(1, 2);
      aux2= mapa.hacerNodo(2, 1);
      aux3= mapa.hacerNodo(3, 1);
      aux4= mapa.hacerNodoConCaja(3, 2);
      
      mapa.suelo.hacerConexionHor(aux1, mapa.suelo.inicio);
      mapa.suelo.hacerConexionHor(aux4, mapa.suelo.inicio);
      mapa.suelo.hacerConexionVer(aux2, mapa.suelo.inicio);
      mapa.suelo.hacerConexionHor(aux2, aux3);
      mapa.suelo.hacerConexionVer(aux3, aux4);
      
      aux1= mapa.hacerNodoConCaja(2, 3);
      aux2= mapa.hacerNodo(3, 3);
      aux3= mapa.hacerNodo(2, 4);
      
      mapa.suelo.hacerConexionVer(mapa.suelo.inicio, aux1);
      mapa.suelo.hacerConexionVer(aux4, aux2);
      mapa.suelo.hacerConexionVer(aux1, aux3);
      mapa.suelo.hacerConexionHor(aux1, aux2);
      
      aux4= mapa.hacerNodoConCaja(3, 4);
      aux1= mapa.hacerNodo(4, 4);
      
      mapa.suelo.hacerConexionHor(aux3, aux4);
      mapa.suelo.hacerConexionHor(aux4, aux1);
      mapa.suelo.hacerConexionVer(aux2, aux4);
      
      aux2= mapa.hacerNodo(4, 5);
      aux5= mapa.hacerNodo(3, 5);
      aux6= mapa.hacerNodo(2, 5);
      
      mapa.suelo.hacerConexionVer(aux1, aux2);
      mapa.suelo.hacerConexionVer(aux4, aux5);
      mapa.suelo.hacerConexionVer(aux3, aux6);
      mapa.suelo.hacerConexionHor(aux6, aux5);
      mapa.suelo.hacerConexionHor(aux5, aux2);
      
      aux1= mapa.hacerNodoMeta(4, 6);
      aux4= mapa.hacerNodoMetaConCaja(3, 6);
      aux3= mapa.hacerNodoMeta(2, 6);
      
      mapa.suelo.hacerConexionVer(aux2, aux1);
      mapa.suelo.hacerConexionVer(aux5, aux4);
      mapa.suelo.hacerConexionVer(aux6, aux3);
      mapa.suelo.hacerConexionHor(aux4, aux1);
      mapa.suelo.hacerConexionHor(aux3, aux4);
      
      aux5= mapa.hacerNodoMeta(1, 5);
      aux4= mapa.hacerNodoMeta(1, 6);
      
      mapa.suelo.hacerConexionHor(aux5, aux6);
      mapa.suelo.hacerConexionHor(aux4, aux3);
      mapa.suelo.hacerConexionVer(aux5, aux4);
    }
    
    public void creaMapa4(){
        Nodo aux1,aux2,aux3,aux4,aux5,aux6;
        
        this.mapa = new Mapa(3, 2, 1);
        aux1= mapa.hacerNodo(3, 1);
        aux2= mapa.hacerNodo(2, 2);
        aux3= mapa.hacerNodoConCaja(3, 2);
        aux4= mapa.hacerNodo(4, 2);
        aux5= mapa.hacerNodo(5, 2);
        aux6= mapa.hacerNodo(3, 3);
        
        mapa.suelo.hacerConexionHor(mapa.suelo.inicio, aux1);
        mapa.suelo.hacerConexionVer(mapa.suelo.inicio, aux2);
        mapa.suelo.hacerConexionVer(aux1, aux3);
        mapa.suelo.hacerConexionHor(aux2, aux3);
        
    }
}
    
