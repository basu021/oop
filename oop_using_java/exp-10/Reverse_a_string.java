import java.util.Scanner;
import java.lang.StringBuffer;

public class Reverse_a_string {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = input.nextLine();
        input.close();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse of the string is: " + sb.reverse());
    }    
}
