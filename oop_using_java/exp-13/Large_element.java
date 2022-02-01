// Write a Java program to get the larger value between first and last
// element of an array (length 3) of integers .
import java.util.Scanner;

public class Large_element {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        int first = arr[0];
        int last = arr[2];
        if (first > last) {
            System.out.println(first);
        } else {
            System.out.println(last);
        }
    }
}
