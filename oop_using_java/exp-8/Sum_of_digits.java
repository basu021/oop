import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        int num, remainder, sum = 0, num_value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        num = input.nextInt();
        num_value = num;
        input.close();
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            sum = sum + remainder;
        }
        System.out.println("Sum of digits of " + num_value + " is " + sum);
    }
}
