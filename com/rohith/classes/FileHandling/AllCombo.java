package com.rohith.classes.FileHandling;
import java.io.*;
public class AllCombo {
    public static void main(String [] args) throws IOException{
        try{
            File f = new File("JAVA.txt");
            if(!f.exists()){
                f.createNewFile();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("JAVA.txt");
            fw.write("Hii I am JAVA");
            fw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            FileReader fr = new FileReader("JAVA.txt");
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char) ch);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
