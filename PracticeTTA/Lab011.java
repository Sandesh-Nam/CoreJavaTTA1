package PracticeTTA;
//Lamba expression in switch
public class Lab011 {
    public static void main(String[] args) {
        int item = 005;
        switch (item){
            //After JDK 13,
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 005 -> System.out.println("005");
            default -> System.out.println("Default");
        }
    }
}
