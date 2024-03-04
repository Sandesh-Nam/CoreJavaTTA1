package Examples;

public class Ex1_printVariables {
    public static void main(String[] args) {
        //Declare variables
        int num = 2050;
        byte num1 = -122;
        long num2 = 987654321L;
        float num3 = 23.5f;
        double num4 = 2224.223;
        char num5 = 'J';
        boolean num6 = true;
        //Print Variables
        System.out.println("integer Variable is"+" "+num);
        System.out.println("byte Variable is"+" "+num1);
        System.out.println("long Variable is"+" "+num2);
        System.out.println("float Variable is"+" "+num3);
        System.out.println("double Variable is"+" "+num4);
        System.out.println("char Variable is"+" "+num5);
        System.out.println("boolean Variable is"+" "+num6);
        //perform arithmetic operations
        int sum = num + num1;
        System.out.println("Sum is"+" "+sum);
        long difference = num - num2;
        System.out.println("Difference is"+" "+difference);
        float product = num3 * num5;
        System.out.println("Product is"+" "+product);
        int quotient = num / num1;
        System.out.println("Quotient is"+" "+quotient);
        String firstName = "Sandesh";
        String lastName = "Namani";
        String fullName = firstName+" "+lastName;
        //Print full name
        System.out.println("Full name is"+" "+fullName);
    }
}
