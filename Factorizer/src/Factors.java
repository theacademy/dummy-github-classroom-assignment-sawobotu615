import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //ask the user for an input
        System.out.println("Pls input a number");
        //creates a scanner object for the user to input
        Scanner scan  = new Scanner(System.in);
        int input = scan.nextInt();
        //this is an integer used to check if the number is perfect
        int sum = 0;
        //this is a count variable set at 1 (the number itself) used to find the number of factors
        int counter = 1;


        //outputs the number you put in.
        System.out.println("The number you put in was " + input);

        // for loop to find the factors in the number, count how many there are and add the all together to check if the number is perfect
        for (int i = 1; i < input; i++) {
            if (input % i == 0){
                System.out.println("A Factor of " + input + " is: " + i);
                sum += i;
                counter++;
            }

        }
        //prints out the number alongside the other factors
        System.out.println("A Factor of " + input + " is: " + input);

        //prints out the number of factors
        System.out.println("The number " + input + " has " + counter + " factors");

        //check to see if the number is perfect of not.
        if(sum == input){
            System.out.println(input + " is a perfect number");
        } else {
            System.out.println(input + " is not a perfect number");
        }

        //to find the prime number all you have to do is check if count is 2 because prime
        //numbers can only be divisible by 1 and themselves so if the number you put in has only 2
        //factors then it is a prime number
        if (counter == 2){
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not prime number");
        }




    }
}
