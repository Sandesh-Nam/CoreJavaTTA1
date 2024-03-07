package Examples;

import java.util.Scanner;

/*Create a Program that determines whether a given year is leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by
400, Use an if else statement to make this determination.
 */
public class Ex7_LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year to check it is leap year or not");
        int year = scan.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("It is leap year");
        }
        else {
            System.out.println("It is not leap year");
        }
    }
}
