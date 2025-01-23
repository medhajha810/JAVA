import java.util.Scanner;
public class discount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the total cart amount: ");
        double totalCart = sc.nextDouble();
        double discount;
        double finalAmount =0;
        if(totalCart>5000){
            discount = 0.2*totalCart;
            finalAmount = totalCart-discount;
            System.out.printf("Discount: %.1f\n",discount);
            System.out.printf("Final Amount: %.1f",finalAmount);
        }
        else if(totalCart>=3000 && totalCart<=5000){
            discount = 0.1*totalCart;
            finalAmount = totalCart-discount;
            System.out.printf("Discount: %.1f\n",discount);
            System.out.printf("Final Amount: %.1f",finalAmount);
        }
        else{
            System.out.printf("No discount is applied\n");
            System.out.printf("Final Amount: %.2f",totalCart);

        }
    }
}