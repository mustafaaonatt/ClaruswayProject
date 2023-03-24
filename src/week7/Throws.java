package week7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("c:/textfile.txt");
        int k;


        while ((k = fis.read()) != -1){
            System.out.println((char) k);
        }
        fis.close();
    }
}
