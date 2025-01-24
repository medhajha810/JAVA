public class printf {
    public static void main(String[] args){
        String name = "Medha";
        char letter ='M';
        int age = 20;
        double height = 60.4;
        boolean isStudent = true;
        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with %c\n",letter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("your height is %.3f inches\n",height);
        System.out.printf("Student: %b\n",isStudent);
    }
    
}
