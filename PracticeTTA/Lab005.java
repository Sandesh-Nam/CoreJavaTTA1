package PracticeTTA; //Session - operator
public class Lab005 {
    public static void main(String[] args) {
        int b = 1;
        System.out.println(b + ++b + ++b + b); //9
        System.out.println(b); //3
        //Post
        int c = 1;
        System.out.println(c++ + c + c++ + c); //8
        //1,2 + 2 + 2,3 + 3
        System.out.println(c); //3
        //dec
        int d = 10;
        System.out.println(d-- + --d); //18
        // 9,9 + 9,8
        System.out.println(d);//8
        int e = 101;
        System.out.println(--e); //100
        System.out.println(e--); //100
        System.out.println(e); //99
        final int pie = 100;
        System.out.println(pie);

        int f = 20 ,g = 90;
        System.out.println(f>g); //false
        System.out.println(f<g); //true
        System.out.println(f==g);//fale
        System.out.println(f>=g);//false
        System.out.println(f<=g);//true
        System.out.println(f!=g);//true
        System.out.println(f=g); //90





    }
}
