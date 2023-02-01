import java.util.*;

/*

Spy Number

A positive integer is called a spy number if the sum and product of its digits are equal.
In other words, a number whose sum and product of all digits are equal is called a spy number.

*/

public class Main{
    private static boolean isSpyNumber(int number){

        int sum = 0;
        int product = 1;

        while(number != 0){

           int lastDigit = number % 10;

            sum += lastDigit;

            product *= lastDigit;

            number /= 10;
        }
        return sum == product;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int lowerLimit = sc.nextInt();

        System.out.print("Enter upper limit: ");
        int upperLimit = sc.nextInt();

        System.out.println("The Spy numbers between " + lowerLimit + " and " + upperLimit + " are: ");
        for(int i=lowerLimit; i<=upperLimit; i++){
            if(isSpyNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
}