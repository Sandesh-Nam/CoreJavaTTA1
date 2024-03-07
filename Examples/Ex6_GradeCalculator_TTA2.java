package Examples;

import java.util.Scanner;

public class Ex6_GradeCalculator_TTA2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scan.nextInt();
        char grade = '0';
        if(score>=90 && score<=100){
            grade = 'A';
        }
        else if(score>=80 && score<=89){
            grade = 'B';
        }
        else if(score>=70 && score<=79){
            grade = 'C';
        }
        else if(score>=60 && score<=69){
            grade = 'D';
        }
        else{
            grade = 'F';

            }
        System.out.println("Your Grade is "+grade);
    }
    }

