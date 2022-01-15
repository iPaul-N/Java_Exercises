import java.util.Scanner;

public class Test2 {
    /*
 Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers). Go to the editor

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5  */
  public static void main(String[] args) {
    int n1, n2;
    Scanner clavier = new Scanner(System.in);
    System.out.println("Enter a first number : ");
    n1 = clavier.nextInt();
    System.out.println("Enter a second number");
    n2 = clavier.nextInt();

    System.out.println("The sum is : " + (n1 + n2));
    System.out.println("The difference is : " + (n1- n2));
    System.out.println("The product is : " + n1*n2);
    System.out.println("The average is : " + (n1+n2)/2);
    System.out.println("The maximum is : " + Math.max(n1, n2));
    System.out.println("The minimum is : " + Math.min(n1, n2));
    }
}

