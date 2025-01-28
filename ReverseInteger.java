import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int n) {
        int reversed = 0;
        int sign = (n < 0) ? -1 : 1; 
        
        n = Math.abs(n); 
        
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0; 
            }
            
            reversed = reversed * 10 + digit;
        }
        
        return sign * reversed; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N =");
        int n = scanner.nextInt();
        
        int reversed = reverse(n);
        System.out.println(reversed);
        
        scanner.close();
    }
}
