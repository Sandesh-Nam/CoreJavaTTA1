package PracticeTTA;

import java.util.Scanner;

public class Lab007 {
    public static void main(String[] args) {
        char c1 = 'p'; //112
        char c2 = 'k'; //107
        System.out.println(c1 + c2); //219
        //Even or odd
        int a = 10;
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //Lab
        boolean a1 = true;
        a1 = !a1;
        if(a1){
            System.out.println("1");
        }else{
            System.out.println("2");  //2
        }
        //Lab
        Scanner scan = new Scanner(System.in);
        //This syntax we need to remember
        //System.in is use to take inputs.
        //int a2 = scan.nextInt(); //Next Integer
        //System.out.println("Your input is "+a2); //Your input is 10
        //Max of 3
        System.out.println("Enter the value of d, e, f\nI will give max of 3 numbers");
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        System.out.println("Your inputs are "+d+" "+e+" "+f);
        if (d>e && d>f){
            System.out.println("Max value is "+d);
        }
        else if(e>d && e>f){
            System.out.println("Max value is "+e);
        }
        else{
            System.out.println("Max value is "+f);
        }
        //lab
        if(true){
            System.out.println("1");
            if(true){
                System.out.println("2");
                if(false){
                    System.out.println("3");
                }
                else{
                    System.out.println("4");
                } //1 2 4
            }
        }
    }
}
