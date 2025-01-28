import java.util.Scanner;

public class MaxSumRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        int[][] array = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        int rowWithMaxSum = -1;
        
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j : array[i]) {  
                rowSum += j;
            }
            
            if (rowSum > maxSum) {
                maxSum = rowSum;
                rowWithMaxSum = i + 1; 
            }
        }
        
        System.out.println("Row with the maximum sum: " + rowWithMaxSum);
        System.out.println("Maximum sum: " + maxSum);
        
        scanner.close();
    }
}
