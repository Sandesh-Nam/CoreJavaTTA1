package PracticeTTA;
public class Lab006 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1 instanceof String);//true
        Lab006 l = new Lab006();
        System.out.println(l instanceof Lab006);//true
        //condn or ternary operator
        int a = true ? 10 : 20;
        System.out.println(a); //10
        int b = false ? 10 : 20;
        System.out.println(b); //20
        int age = 18;
        boolean canIWatchMovie = age>18 ? true : false;
        System.out.println(canIWatchMovie); //false
        int age1 = 19;
        String canIWatchMovie1 = age1>18 ? "Yes you can" : "No sorry";
        System.out.println(canIWatchMovie1); //Yes you can
        float a1 = 20>19 ? 10.3f : 20.11f;
        System.out.println(a1); //10.3
        String str = 10>20 ? "10" : "TWENTY";
        System.out.println(str); //TWENTY
        //Max & min of two Number
        int c1 = 10;
        int d1 = 20;
        int max = c1>d1 ? c1 : d1;
        System.out.println(max); //20
        int min = c1<d1 ? c1 : d1;
        System.out.println(min); //10
        int ab = 10;
        System.out.println("Result is "+(ab == ab));
        int a4 = 10;
        int b4 = a4++ + ++a4;
        //10 , 11 + 12, 12
        System.out.println(a4); //12
        System.out.println(b4); //22

    }
}
