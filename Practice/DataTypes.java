public class DataTypes{
    public static void main(String[] args) {
        int intVar = 40;
        double doubleVar = 3.14;
        char charVar = 'A';
        boolean boolVar = true;

        System.out.println("Initial values:");
        System.out.println("Integer value: " + intVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Char value: " + charVar);
        System.out.println("Boolean value: " + boolVar);

        
        double intToDouble = intVar;
        int charToInt = charVar;
        System.out.println("\nAfter conversions:");
        System.out.println("Integer to Double: " + intToDouble);
        System.out.println("Char to Integer: " + charToInt);

        double anotherDouble = 55.99;
        int doubleToInt = (int) anotherDouble; 

        System.out.println("\nExplicit casting example:");
        System.out.println("Double to Integer: " + doubleToInt);
    }
}
