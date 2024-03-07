package Examples;

import java.util.Scanner;

/* WAP that classifies a triangle based on its side lengths.
   Given 3 input values representing the lengths of the sides,
   determine if the triangle is equilateral (all sides are equal),
   isosceles(exactly two sides are equal), or scalene(no sides are equal)
   use an if else statement to classify the triangle.
   */
public class Ex8_TriangleClassifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 3 lengths of the sides");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        if(side1==side2 && side2==side3){
            System.out.println("Triangle is Equilateral");
        }
        else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("Triangle is Isosceles");
        }
        else {
            System.out.println("Triangle is Scalene");
        }

    }
}
