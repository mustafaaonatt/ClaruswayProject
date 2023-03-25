package week7;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListOfNumbers {
    private  int [] list = {5,6,8,9,2};

    public void writeList(){
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");


            // creating a new file OutputFile.txt.
            out = new PrintWriter(new FileWriter("/Users/mustafaonat/Documents/intel project/ClaruswayProject/src/week7/OutputFile.txt"));

            // Writing value from List array to OutputFile.txt
            for (int i = 0; i < list.length; i++) {
                out.println("value at: " + i + " = " + list[i]);

            }

        }catch (IOException e){
            System.out.println("Exception => " + e.getMessage());
        }finally {
            // checking if PrintWriter has been opened
            if (out != null) {
                System.out.println("Closing PrintWriting");
                // close PrintWriter
                out.close();
            }else {
                System.out.println("Print Writer class not open");
            }



        }
    }

    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();

    }
}
