import java.util.Scanner;

public class Print_hello {
    public static void main(String[] args) {
        String Your_Name;
        Scanner in = new Scanner(System.in);
        Your_Name = in.nextLine();
        in.close();
        System.out.println("Hello");
        System.out.println(Your_Name);
    }
}