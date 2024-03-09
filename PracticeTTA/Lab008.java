package PracticeTTA; //switch

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        //Take a user input from 1 to 7,
        //1 -> mon, 2-> tues, .....7-> sunday
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scan.nextInt();
        switch (day){
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tues");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thurs");
                break;
            case 5 :
                System.out.println("Fri");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;
            default :
                System.out.println("Invalid day");

        }
        System.out.println("Outside the Loop = End");
    }
}
