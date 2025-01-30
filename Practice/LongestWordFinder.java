import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");  
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println(longestWord);  
        
        scanner.close();
    }
}
