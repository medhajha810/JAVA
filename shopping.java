import java.util.Scanner;
public class shopping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        System.out.print("What item would you like to purchase?: ");
        item = sc.nextLine();
        System.out.print("What is the price of that item?: ");
        price = sc.nextDouble();
        System.out.print("How many would you like to have?: ");
        quantity = sc.nextInt();
        

        total = price * quantity;
        System.out.println("You have purchased " + quantity+" " + item +"/s");
        System.out.println("You have to pay "+currency+total);


        sc.close();
    }
}