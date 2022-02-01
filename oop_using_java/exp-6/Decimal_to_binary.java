import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        int num, remainder, binary = 0, base = 1,num_value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        num = input.nextInt();
        num_value = num;
        input.close();
        while (num != 0) {
            remainder = num % 2;
            num = num / 2;
            binary = binary + remainder * base;
            base = base * 10;
        }
        System.out.println("Binary equivalent of " + num_value + " is " + binary);
    }
}
