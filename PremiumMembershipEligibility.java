import java.util.Scanner;

public class PremiumMembershipEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly income: ");
        double monthlyIncome = scanner.nextDouble();

        System.out.print("Do you have pending dues (true/false): ");
        boolean hasPendingDues = scanner.nextBoolean();

        String eligibility = (age >= 18 && monthlyIncome >= 30000 && !hasPendingDues)
                ? "You are eligible for premium membership."
                : "You are not eligible for premium membership.";

        System.out.println(eligibility);

        scanner.close();
    }
}
