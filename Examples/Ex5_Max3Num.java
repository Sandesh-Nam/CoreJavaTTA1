package Examples;

import java.util.Scanner;

public class Ex5_Max3Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 3 numbers ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int max = (num1>num2) ? (num1>num3 ? num1 : num3) : (num2>num3 ? num2 : num3);
        System.out.println("The max of "+num1+", "+num2+", "+num3+" is : " + max);
    }
}
