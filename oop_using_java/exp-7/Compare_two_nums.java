import java.util.Scanner;

public class Compare_two_nums {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        input.close();
        if (num1 > num2) {
            System.out.println("\n" + num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println("\n" + num1 + " is less than " + num2);
        } else {
            System.out.println("\n" + num1 + " is equal to " + num2);
        }
    }
}
