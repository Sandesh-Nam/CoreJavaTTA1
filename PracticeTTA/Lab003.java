package PracticeTTA; //session - operators
public class Lab003 {
    public static void main(String[] args) {
        //Binary Operations
        int a = 10, b = 20;
        System.out.print(a+b); //30
        System.out.print(a-b); //-10
        System.out.print(a*b); //200
        System.out.print(b/a); //2
        System.out.println(b%a); //0
        //Unary operators - part1
        int c = 10;
        boolean d = true;
        System.out.print(+c); //10
        System.out.print(-c); //-10
        System.out.print(!d); //false
        System.out.println(~c); //-11
        //Part 2 - Increment - Post and Pre

        //Resultant type
        byte b1 = 10, b2 = 11;
        System.out.println(b1+b2); //21
        char c1 = 'A', c2 = 'B';
        System.out.println(c1 + c2); //65+66=131
        float f1 = 10.22f ;
        double d1 = 100.22;
        System.out.println(f1 + d1); //double

        //String concatenation operator (+)
        String s1 = "Sandesh", s2 = "Namani";
        System.out.println(s1 + s2); //SandeshNamani
        int a1 = 10, b3 = 20;
        System.out.println(a1+b3+s1+s2); //30SandeshNamani
        //left to right
        //String + int = String(bigger basket)
        System.out.println(s1+s2+a1+b3); //SandeshNamani1020
        System.out.println(s1+s2+(a1+b3)); //SandeshNamani30
        // (As per bodmass-addition will happen)
        //SN+(int+int=int) //SNint
        System.out.println('A'+'B'); //131 //char+char=int
        String name1 = "Sandesh";
        String name2 = "10";
        System.out.println(name1 + name2); //Sandesh10
        System.out.println(name1 +10+34); //Sandesh1034
        System.out.println(10+34+name2+name1); //4410Sandesh




    }
}
