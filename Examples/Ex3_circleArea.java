package Examples;

import java.util.Scanner;

//Circle Area Calculation:
//Write a Java program to calculate the area of a circle given its radius.
//The radius should be provided by the user as input.
public class Ex3_circleArea {
    public static void main(String[] args) {
        final float pie = 3.14f;
        float radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide input for Radius");
        radius = scan.nextFloat();
        float circleArea = pie * radius * radius;
        System.out.println("Area of Circle is "+circleArea);
    }

}
