package com.rohith.classes.FileHandling;
import java.io.*;
public class FileCreation {
    public static void main(String [] args) throws IOException{
        try{
            File f = new File("New_file.txt");
            if(!f.exists()){
                f.createNewFile();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
