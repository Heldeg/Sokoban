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
public class Reader {
     private File file;
     private FileReader fileReder;
     private BufferedReader buffer;
     private String directory;
     String readedStructure;
     public Reader(String directorio){
         this.readedStructure = "";
         this.directory = directorio;
         openAndRead();
     }
     private void openAndRead(){
         try{
             this.file = new File(this.directory);
             this.fileReder = new FileReader(this.file);
             this.buffer = new BufferedReader(this.fileReder);
             
             String line;
             while((line=buffer.readLine())!=null){
                 this.readedStructure+=line;
                 this.readedStructure+="-";
                // System.out.println(linea);
             }
         }catch(Exception e){
             System.out.println("Error abriendo archivo");
         }
     }
}
