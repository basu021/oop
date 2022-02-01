import java.util.Scanner;

public class Swap_two_variables {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        input.close();
        System.out.println("\nBefore swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("\nAfter swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
