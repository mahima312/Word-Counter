import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WORD COUNTER");
        System.out.println("Enter '1' to input text or '2' to provide a file:");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        String inputText = "";

        if (choice == 1) {
            System.out.println("Enter your text:");
            inputText = scanner.nextLine();
        } else if (choice == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            inputText = readTextFromFile(filePath);
        } else {
            System.out.println("Invalid choice. Please enter '1' or '2'.");
            scanner.close();
            return;
        }

        int wordCount = countWords(inputText);
        System.out.println("Total number of words: " + wordCount);

        scanner.close();
    }

    private static String readTextFromFile(String filePath) {
        return "";
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+|\\p{Punct}"); // Split by whitespace or punctuation
        return words.length;
    }
}
