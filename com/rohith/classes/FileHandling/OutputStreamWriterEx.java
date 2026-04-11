package com.rohith.classes.FileHandling;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriterEx {
   public static void main(String[] args) throws IOException {
//        OutputStream os = System.out;
        //write()  → put data in box 📦
       //flush()  → send box to screen 🖥️
//        os.write('9');
//        os.flush();
//        os.write(  "Hello".getBytes(StandardCharsets.UTF_8));
        //        System.out.println(os.toString());


       try (  OutputStreamWriter osw  = new OutputStreamWriter(System.out)){
           osw.write("Hello World");
           osw.write("\n");
           osw.write(98);
           osw.write("\n");
           char arr[] = "Mass".toCharArray();
           osw.write(arr);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
