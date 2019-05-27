/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;
import java.io.*;
/**
 *
 * @author EDDER
 */
/*
====================================
        LECTURA ARCHIVOS
====================================
*/
public class Lectura {
     private File archivo;
     private FileReader fileReder;
     private BufferedReader buffer;
     private String direcctorio;
     String estructuraLeida;
     public Lectura(String directorio){
         this.estructuraLeida = "";
         this.direcctorio = directorio;
         abreYLee();
     }
     private void abreYLee(){
         try{
             this.archivo = new File(this.direcctorio);
             this.fileReder = new FileReader(this.archivo);
             this.buffer = new BufferedReader(this.fileReder);
             
             String linea;
             while((linea=buffer.readLine())!=null){
                 this.estructuraLeida+=linea;
                 this.estructuraLeida+=" ";
                // System.out.println(linea);
             }
         }catch(Exception e){
             System.out.println("Error abriendo archivo");
         }
     }
}
