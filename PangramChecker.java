import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        System.out.println("Is it a pangram? " + isPangram);
        scanner.close();
    }
}
