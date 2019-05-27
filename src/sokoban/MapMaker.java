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
public final class MapMaker {
    Map map;
    int numMap;
    public MapMaker(int numMapa){
        this.numMap=numMapa;
        switch(numMapa){
            case 1:
                createMap1();
            break;
            case 2:
                createMap2();
            break;
            case 3:
                createMap3();
            break;
            case 4:
                createMap4();
            break;
            case 5:
                createMap5();
            break;
            case 6:
                createMap6();
            break;
            case 7:
                createMap7();
            break;
            case 8:
                createMap8();
            break;
            case 9:
                createMap9();
            break;
            case 10:
                createMap10();
            break;
            case 11:
                createMap11();
            break;
            case 12:
                createMap12();
            break;
            case 13:
                createMap13();
            break;
            case 14:
                createMap14();
            break;
            case 15:
                createMap15();
            break;
            default:
                System.out.println("Nivel inexistente");
        }
    }
    public MapMaker(String cadena,int x,int y){
        this.map = new Map(cadena, x, y);
        this.map.insertNumbers();
    }
    private void createMap1(){
        String cadena= "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,3 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,2 ,0 ,2 ,3 ,1 ,1 "
               +       "1 ,3 ,0 ,2 ,5 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,2 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,3 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +       "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap2(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,5 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,2 ,1 ,1 ,1 ,3 ,1 "
               +        "1 ,1 ,1 ,0 ,1 ,1 ,1 ,3 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,0 ,3 ,1 "
               +        "1 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,1 "
               +        "1 ,1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap3(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,5 ,2 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,2 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,2 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,3 ,2 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,3 ,3 ,4 ,3 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap4(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,5 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,2 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,1 ,0 ,1 ,1 ,1 "
               +        "1 ,3 ,1 ,0 ,1 ,0 ,0 ,1 ,1 "
               +        "1 ,3 ,2 ,0 ,0 ,1 ,0 ,1 ,1 "
               +        "1 ,3 ,0 ,0 ,0 ,2 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap5(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,2 ,2 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,3 ,3 ,0 ,1 ,1 "
               +        "1 ,5 ,2 ,3 ,3 ,3 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap6(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,5 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,3 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,3 ,2 ,3 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,4 ,2 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap7(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,3 ,3 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,3 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,0 ,2 ,3 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,2 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,2 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,5 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap8(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,2 ,3 ,3 ,2 ,0 ,1 ,1 "
               +        "1 ,5 ,2 ,3 ,4 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,3 ,3 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap9(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "-1,0 ,0 ,0 ,0 ,-1,-1,-1,-1"
               +        "-1,0 ,2 ,2 ,2 ,-1,-1,-1,-1"
               +        "-1,0 ,0 ,-1,3 ,3 ,-1,-1,-1"
               +        "-1,-1,0 ,0 ,3 ,3 ,2 ,0 ,-1"
               +        "-1,-1,0 ,5 ,0 ,0 ,0 ,0 ,-1"
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap10(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,3 ,3 ,2 ,3 ,3 ,1 ,1 ,1 "
               +        "1 ,3 ,3 ,1 ,3 ,3 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,2 ,2 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,2 ,2 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,5 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap11(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,5 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,1 ,2 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,4 ,3 ,0 ,3 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,2 ,2 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,1 ,3 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap12(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,2 ,0 ,5 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,4 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,4 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,4 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,4 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,3 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap13(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,2 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,4 ,0 ,5 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,4 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,4 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,4 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,3 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap14(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 "
               +        "1 ,0 ,2 ,0 ,0 ,0 ,2 ,0 ,1 "
               +        "1 ,3 ,3 ,1 ,2 ,1 ,2 ,1 ,1 "
               +        "1 ,3 ,5 ,2 ,0 ,0 ,0 ,1 ,1 "
               +        "1 ,3 ,3 ,0 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    private void createMap15(){
        String cadena = "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,0 ,0 ,0 ,0 ,1 ,1 ,1 "
               +        "1 ,1 ,3 ,1 ,1 ,2 ,0 ,1 ,1 "
               +        "1 ,0 ,3 ,3 ,2 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,1 ,2 ,0 ,0 ,1 ,1 "
               +        "1 ,0 ,0 ,5 ,0 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 "
               +        "1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ";
        this.map = new Map(cadena, 9, 9);
        this.map.insertNumbers();
    }
    public byte[][] getMapMatrix(){
        return this.map.getFloor();
    }
}
    
