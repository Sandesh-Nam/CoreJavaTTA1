package Examples;
import java.util.Scanner;

import static java.lang.Math.round;

//Student Grade Calculation:
//Write a Java program to calculate the grade of a student based on his/her
//marks in three subjects.The average mark should be used to determine the
// grade. If Avg marks is in decimal then round off to next integer
public class Ex4_gradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the markes of three subjects");
        float sub1 = scan.nextFloat();
        float sub2 = scan.nextFloat();
        float sub3 = scan.nextFloat();
        float avg = (sub1 + sub2 + sub3/2);
        System.out.println("Average before round off is "+avg);
        int roundOffAverage = round(avg);
        System.out.println("Average after round off is "+roundOffAverage);
        //how to take input in java which should not be negative and not
        // more than 100, this we will solve later

}}
