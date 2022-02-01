import java.util.Scanner;

public class Count_letter_space_num_char_symbols {
    public static void main(String[] args) {
        int num_letter, num_space, num_num, num_symbol;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        input.close();
        num_letter = 0;
        num_space = 0;
        num_num = 0;
        num_symbol = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                num_letter++;
            } else if (Character.isSpaceChar(sentence.charAt(i))) {
                num_space++;
            } else if (Character.isDigit(sentence.charAt(i))) {
                num_num++;
            } else {
                num_symbol++;
            }
        }
        System.out.println("\nNumber of letters: " + num_letter);
        System.out.println("Number of spaces: " + num_space);
        System.out.println("Number of digits: " + num_num);
        System.out.println("Number of symbols: " + num_symbol);
    }
    
}
