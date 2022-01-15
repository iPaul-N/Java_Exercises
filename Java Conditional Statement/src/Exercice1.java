import java.util.Scanner;
/*1. Write a Java program to get a number from the user and print whether it is positive or negative.*/
public class Exercice1 {
    public static void main(String[] args) 
    {
        Scanner clavier = new Scanner(System.in);
        int number;

        System.out.println("Enter a number : ");
        number = clavier.nextInt();
        
        if (number >= 0) 
        {
            System.out.println("The number is positive.");
        } 
        else 
        {
         System.out.println("The number is negative.");   
        }
    }
}
