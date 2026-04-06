package com.rohith.classes.FileHandling;
import java.io.*;
public class BufferedWriterEx {
    static void main() throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter ("C:\\Users\\erohi\\IdeaProjects\\Java_oops\\src\\com\\rohith\\classes\\FileHandling\\fun.txt"))){
            bw.write("Hi My name is not Fun I am super fun");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
