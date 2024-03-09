package Examples;
//Right Pyramid
//TTA
//* -> 1 star
//** -> 2 star
//*** -> 3 star
//**** -> 4 star
//***** -> 5 star
public class Ex12_Pattern_RP {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
