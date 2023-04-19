package Week11.IOTheory;

import java.io.*;
import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        // This line is only to refer a file
        File fisrtFile = new File("theFirst.txt");

        if (!fisrtFile.exists()) {
            try {
                // here we create the file if it is not already present.
                fisrtFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Please contact to help desk about Theory:14");
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(fisrtFile);
            String output = "Hello World. \n";
            //fos.write(output.getBytes());
            output += "From Java.\n";
            // fos.write(output.getBytes());
            output += "04/ 18 / 2023 ";
            fos.write(output.getBytes());
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Please contact to help desk about Theory:24 " + e);
        } catch (IOException e) {
            System.out.println("Please contact to help desk about Theory:26 " + e);
        }

        String content = "";

        try {
            FileInputStream fis = new FileInputStream(fisrtFile);
            System.out.println((char) fis.read());  // 72-> H
            System.out.println((char) fis.read()); // 101-> e
            System.out.println((char) fis.read()); // 108 ->l


            System.out.println("___________________");



            fis = new FileInputStream(fisrtFile);
            int i = fis.read();
            while (i != -1){
                System.out.print((char)i);
                i = fis.read();
            }


            System.out.println();
            System.out.println("--------------------------");
            Scanner scan = new Scanner(fisrtFile);
            while (scan.hasNextLine()){
               content += scan.nextLine() + "\n";
            }

        } catch (FileNotFoundException e) {
            System.out.println("Please contact to help desk about Theory:37 " + e);
        } catch (IOException e) {
            System.out.println("Please contact to help desk about Theory:39 " + e);
        }

        File location = new File("/Users/mustafaonat/Documents/intel project/ClaruswayProject/b");
        File copyFromFirst = new File("/Users/mustafaonat/Documents/intel project/ClaruswayProject/b/theCopy.txt");

        if (!copyFromFirst.exists()) {
            try {
                if (!location.exists()){
                    location.mkdirs();
                }
                // here we create the file if it is not already present.
                copyFromFirst.createNewFile();
            } catch (IOException e) {
                System.out.println("Please contact to help desk about Theory:75" + e);
            }
        }

        try {
            FileOutputStream fos =new FileOutputStream(copyFromFirst);
            fos.write(content.getBytes());
            fos.flush();
            fos.close();
        }catch (FileNotFoundException e){
            System.out.println("Please contact to help desk about Theory:90" + e);
        }catch (IOException e){
            System.out.println("Please contact to help desk about Theory:92" + e);
        }
    }
}