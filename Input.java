// My Name is Nich Fegley
// This code was made 8/10/24
//The purpose is to modifiy the value of the input number
import java.util.Scanner;

public class Input
{
    public static void main (String [] args)
    {
        System.out.print("Please enter an integer ");
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        System.out.print("Please enter a second integer");
        int int2 = sc.nextInt();
         
        System.out.println("My ingeter is " + int1);
        System.out.println("My second integer is " + int2);
        System.out.println("The sum of the integers is " + (int1+int2));
        System.out.println("The difference of the integers is " + (int1-int2));
        System.out.println("The product of the integers is " + (int1*int2));
        System.out.println("The quotient of the integers is " + (int1/int2));
        System.out.println("The remander of the integers is " + (int1%int2));
    }
}