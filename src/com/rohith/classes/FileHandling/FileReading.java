package com.rohith.classes.FileHandling;
import java.io.InputStreamReader;
import java.io.*;
public class FileReading {
   public static void main(String[] args) throws IOException {
        try(FileReader fr = new FileReader("New_file.txt")){
            int data = fr.read(); // .read() => it returns always an int only
            while(data != -1){
                System.out.print((char)data);
                data = fr.read();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
