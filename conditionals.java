import java.util.Scanner;
public class conditionals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print
        ("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        

        if(name.isEmpty()){
            System.out.println("You didn't enter your name!!");

        }
        else{
            System.out.println("Hello "+ name);
        }
        if(age>=18){
            System.out.println("You are an adult.");
        }
        else if(age<18 && age>0){
            System.out.println("You are a kid.");
        }
        else if(age==0){
            System.out.println("You are a small baby.");
        }
        else{
            System.out.println("You are not born yet.");
        }
        sc.close();
    }
    
}