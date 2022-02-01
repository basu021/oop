import java.util.Scanner;
public class Print_area_and_perimeter_of_rect {
    public static void main(String[] args) {
        int length, width, area, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextInt();
        System.out.print("Enter width: ");
        width = input.nextInt();
        input.close();
        area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("Area of rectangle is " + area + " Sq. units");
        System.out.println("Perimeter of rectangle is " + perimeter + " units");
    }
}
