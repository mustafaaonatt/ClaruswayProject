package week2;

public class ForLoop1 {
    public static void main(String[] args) {
        for (int i = 4; i>1; i--){
            System.out.println(i);
        }
        System.out.println("when i is less than or equal to 1 the code will continue from this line. ");
        for(int i = 1; i<=100; i++){
            System.out.println(i + "-");
        }

        for (int i = 1; i<=10; i++){
            System.out.println("The value i is " + i);
            System.out.println("Welcome to Clarusway SDET Course.");
            System.out.println("We will win. ");
        }


        //print the even numbers until 50.
        System.out.print("Even numbers : ");
        for(int i = 0; i < 51; i++){
           if(i%2==00) System.out.print( i + "-" );

        }
        System.out.println();
        //print the time from 0 until 24 and add the morning(0-12), noon(12), afternoon(12-5), night(5-24)

        for(int time = 0; time <= 24; time++){

            if(time < 12) {
                System.out.println(time + " Morning");
            }else if (time == 12) {
                System.out.println(time + " Noon");
            }else if (time <= 17){
                System.out.println(time + " Afternoon");
            } else
                System.out.println(time + " Night");

            }


        }
        }




