package Examples;

import java.util.Scanner;

//WAP whether given character is Vowel or not
//Vowels - 5(a,e,i,o,u)
public class Ex9_Vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scan.next().charAt(0); //// Use next() to get a string, then charAt(0) to get the first character
        ch = Character.toLowerCase(ch); //It will convert caps alphabet to small alphabet
        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("Given character is vowel");
                break;
            default:
                System.out.println("Given character is not vowel");

        }
    }
}
