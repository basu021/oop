import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        // if num is even print 1 else print 0
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        if (num % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
