package Examples;
//Simple Interest Calculation:
//Write a Java program to calculate the simple interest given the
// principal amount, rate of interest, and time period.
public class Ex2_simpleInterest {
    public static void main(String[] args) {
        int principal_Amt = 100000;
        float interest_Rate = 7.5f;
        int time = 2;
        int simple_Interest;
        simple_Interest = (int) (principal_Amt * interest_Rate * time)/100;
        System.out.println("Simple Interest is"+" "+simple_Interest);
        int final_Amt = principal_Amt + simple_Interest;
        System.out.println("Final Amount is"+" "+final_Amt);
    }
}
