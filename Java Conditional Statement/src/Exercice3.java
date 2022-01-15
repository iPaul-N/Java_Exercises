import java.util.Scanner;
/*Take three numbers from the user and print the greatest number.*/
public class Exercice3
{
    public static void main(String[] args) 
    {
        Scanner clavier = new Scanner(System.in);
        double number1,number2, number3;

        System.out.println("Enter the first number : ");
        number1 = clavier.nextDouble();

        System.out.println("Enter the second number : ");
        number2 = clavier.nextDouble();

        System.out.println("Enter the third number : ");
        number3 = clavier.nextDouble();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The greatest number is : " + number1);
        } 
        else if (number2 > number1 && number2 > number3)
        {
            System.out.println("The greatest number is : " + number2);
        }
        else 
        {
            System.out.println("The greatest number is : " + number3);
        }
    }
}
