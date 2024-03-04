package PracticeTTA;

public class Lab002 {
    public static void main(String[] args) {
       int a, b, c ;
       a = 10;
       b= 20;
       c = 30;
        System.out.println(a+b+c);
        int d = 0, e = 0, f = 90;
        System.out.println(d+e+f);
        int h, i , j, g;
        g = h = i = j = 99;
        System.out.println(g + h + i + j); //396
        int k = k = k = k = 100;
        System.out.println(k); //100
        char c1 = 'a';
        System.out.println(c1); //a
        char c2 = '5';
        System.out.println(c2); //5
        char c3 = '*';
        System.out.println(c3); //*
        System.out.println(c3 + c3); //84
        //+ operator in Java converts in ascii during process.
        // + operator behaves differently in Java.
        char c4 = '/';
        System.out.println(c4); // /
        int b0 = 101;
        System.out.println(b0); //101
        //If starts with nothing then it takes as normal integer values
        int b1 = 0101;
        System.out.println(b1); //65
        //if starts with zero, then it takes as octal integer
        int b2 = 0xface;
        System.out.println(b2); //64206
        //if starts with 0x then it takes as hexadecimal
        int b3 = 0b101;
        System.out.println(b3);
        //if starts with 0b then it takes as binary numbers
        String str2 = null;
        System.out.println(str2);



    }
}
