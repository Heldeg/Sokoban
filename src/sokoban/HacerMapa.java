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
public final class HacerMapa {
    Mapa mapa;
    int numMapa;
    public HacerMapa(int numMapa){
        this.numMapa=numMapa;
        switch(numMapa){
            case 1:
                creaMapa1();
            break;
            case 2:
                creaMapa2();
            break;
            case 3:
                creaMapa3();
            break;
            case 4:
                creaMapa4();
            break;
            case 5:
                creaMapa5();
            break;
            case 6:
                creaMapa6();
            break;
            case 7:
                creaMapa7();
            break;
            case 8:
                creaMapa8();
            break;
            case 9:
                creaMapa9();
            break;
            case 10:
                creaMapa10();
            break;
            case 11:
                creaMapa11();
            break;
            case 12:
                creaMapa12();
            break;
            case 13:
                creaMapa13();
            break;
            case 14:
                creaMapa14();
            break;
            case 15:
                creaMapa15();
            break;
            default:
                System.out.println("Nivel inexistente");
        }
    }
    public HacerMapa(String cadena,int x,int y){
        this.mapa = new Mapa(cadena, x, y);
        this.mapa.insertarNumeros();
    }
    public void reiniciar(){
        
    }
    public void creaMapa1(){
        String cadena= "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,3 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,2 ,0 ,2 ,3 ,1 ,1 "
               +       "1 ,3 ,0 ,2 ,5 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,2 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,3 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa2(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,5 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,2 ,1 ,1 ,1 ,3 ,1 "
               +        "1 ,1 ,1 ,0 ,1 ,1 ,1 ,3 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,0 ,3 ,1 "
               +        "1 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,1 "
               +        "1 ,1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa3(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,5 ,2 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,2 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,2 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,3 ,2 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,3 ,3 ,4 ,3 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa4(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,5 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,2 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,1 ,0 ,1 ,1 ,1 "
               +        "1 ,3 ,1 ,0 ,1 ,0 ,0 ,1 ,1 "
               +        "1 ,3 ,2 ,0 ,0 ,1 ,0 ,1 ,1 "
               +        "1 ,3 ,0 ,0 ,0 ,2 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa5(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,2 ,2 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,3 ,3 ,0 ,1 ,1 "
               +        "1 ,5 ,2 ,3 ,3 ,3 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
        public void creaMapa6(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,5 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,3 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,3 ,2 ,3 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,4 ,2 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa7(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,3 ,3 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,3 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,0 ,2 ,3 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,2 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,2 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,5 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa8(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,2 ,3 ,3 ,2 ,0 ,1 ,1 "
               +        "1 ,5 ,2 ,3 ,4 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,3 ,3 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa9(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "-1,0 ,0 ,0 ,0 ,-1,-1,-1,-1"
               +        "-1,0 ,2 ,2 ,2 ,-1,-1,-1,-1"
               +        "-1,0 ,0 ,-1,3 ,3 ,-1,-1,-1"
               +        "-1,-1,0 ,0 ,3 ,3 ,2 ,0 ,-1"
               +        "-1,-1,0 ,5 ,0 ,0 ,0 ,0 ,-1"
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa10(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,3 ,3 ,2 ,3 ,3 ,1 ,1 ,1 "
               +        "1 ,3 ,3 ,1 ,3 ,3 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,2 ,2 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,2 ,2 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,5 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa11(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,5 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,1 ,2 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,4 ,3 ,0 ,3 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,2 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,1 ,3 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa12(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,0 ,5 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,4 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,4 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,4 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,4 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,3 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa13(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,2 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,4 ,0 ,5 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,4 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,4 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,4 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,3 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa14(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 "
               +        "1 ,0 ,2 ,0 ,0 ,0 ,2 ,0 ,1 "
               +        "1 ,3 ,3 ,1 ,2 ,1 ,2 ,1 ,1 "
               +        "1 ,3 ,5 ,2 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,3 ,3 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
    public void creaMapa15(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,0 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,3 ,1 ,1 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,3 ,3 ,2 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,2 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,5 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.mapa = new Mapa(cadena, 9, 9);
        this.mapa.insertarNumeros();
    }
}
    
