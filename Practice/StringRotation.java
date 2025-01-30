import java.util.Scanner;

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("S1: ");
        String s1 = scanner.nextLine();
        
        System.out.print("S2: ");
        String s2 = scanner.nextLine();
        
        boolean result = isRotation(s1, s2);
        
        System.out.println(result);  
        
        scanner.close();
    }
}
