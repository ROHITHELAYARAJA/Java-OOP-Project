package com.rohith.classes.FileHandling;
import java.io.*;
public class FileWriterEx {
    static void main() throws IOException{
        try(FileWriter fw =new FileWriter("New_file.txt",true)){
            fw.write("Hi My name is not Fun");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
