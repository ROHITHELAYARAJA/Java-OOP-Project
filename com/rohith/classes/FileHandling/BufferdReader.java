package com.rohith.classes.FileHandling;
import java.io.*;
public class BufferdReader {
    public static void main() throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter a string  : " + br.readLine());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
