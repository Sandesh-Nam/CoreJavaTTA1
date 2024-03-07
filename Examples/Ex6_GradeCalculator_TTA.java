package Examples;
//Grade Calculator
/*WAP that calculates and displays the letter grade for a given numerical
  score (e.g A,B,C,D or F) based on the following grade scale :
   A: 90-100
   B: 80-89
   C: 70-79
   D: 60-69
   F: 0-59*/

import java.util.Scanner;

public class Ex6_GradeCalculator_TTA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scan.nextInt();
        if(score>=90 && score<=100){
            System.out.println("Your Grade is A");
        }
        else if(score>=80 && score<=89){
            System.out.println("Your Grade is B");
        }
        else if(score>=70 && score<=79){
            System.out.println("Your Grade is C");
        }
        else if(score>=60 && score<=69){
            System.out.println("Your Grade is D");
        }
        else{
            if(score>=0 && score<=59){
                System.out.println("Your Grade is F");
            }}
        }
        }



