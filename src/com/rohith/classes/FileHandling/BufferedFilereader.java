package com.rohith.classes.FileHandling;
import java.io.*;
public class BufferedFilereader {
    static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\erohi\\IdeaProjects\\Java_oops\\src\\com\\rohith\\classes\\FileHandling\\fun.txt"))) {
            String line;
            while(((line=br.readLine()) != null)){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
