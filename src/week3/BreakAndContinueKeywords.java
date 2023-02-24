package week3;

public class BreakAndContinueKeywords {

    public static void main(String[] args) {











        int a = 5;
        while (a>0){
            a--;
            System.out.println("Count # " + (a));
            System.out.println("hi, I am infinite. ");
            if (a==3){
                continue;

                // After the continue  keyword the cod execution will end in this line
                // and then it's going to beginning og the LOOP
            }

            System.out.println("Test");
            System.out.println("Test2");
            System.out.println("Test");
            System.out.println("Test2");
            System.out.println("Test");
        }


        // sum of 1 to 10 without 5.

        int sum = 0;
        int num = 1;
        while (num<=10){
            num++;
            if(num-1==5) continue;
                sum+= num-1;
            System.out.println(num-1);



        }
        System.out.println(sum);
    }
}
