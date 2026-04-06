package com.rohith.classes.FileHandling;
import java.io.InputStreamReader;
import java.io.IOException;
public class Reading {
    static void main() throws IOException {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter some character");
            int letter = isr.read(); // .read()

            while(letter!=-1){ //* ready() means it means is there is any input to print means it say yes = "true" otherwise no = "false"
                System.out.println((char) letter);
                letter = isr.read(); //*
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
