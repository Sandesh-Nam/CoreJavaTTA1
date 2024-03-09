package PracticeTTA;
//From JDK 11, multiple cases in single statement
public class Lab009 {
    public static void main(String[] args) {
        int item = 007;
        switch (item){
            //JDK > 11
            case 001, 002, 003 :
                System.out.println("From 1 to 3");
                break;
            case 004, 005, 007 :
                System.out.println("From 4 to 7");
                break;
            default:
                System.out.println("Not found");
        }

    }
}
