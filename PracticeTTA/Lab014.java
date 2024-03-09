package PracticeTTA;
//break - It will break the loop
public class Lab014 {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println(i);
            if(i==1){
                System.out.println("found 1 - Hence will break the loop");
                break;
            }
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println(i);
        }
    }
}
