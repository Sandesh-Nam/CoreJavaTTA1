package PracticeTTA; //session-operators
public class Lab004 {
    public static void main(String[] args) {
        System.out.println(2147483647+1); //-2147483648
        //Int range is -2147483648 to 2147483647 since above is exceeding
        //it is reversed back(circle), it is rotated
        byte b = 127;
        System.out.println(b+1); //128
        //Here it doesn't reversed back because byte+int=int and 128 fits in int range
        float f = -0.0f;
        System.out.println(f); //-0.0
        float f1 = 13/3.0f;
        System.out.println(f1); //4.3333335
        System.out.println(10/3); //3
        System.out.println(10/3.0f); //3.3333333
        byte b1 = 10;
        int a1 = b1;
        System.out.println(a1); //smaller value into bigger bucket value
        int a2 = 90;
        byte b2 =(byte)a2;
        System.out.println(b2); //90
        int course = 10;
        float gst = 1.18f;
        int total = course + (int)gst;
        System.out.println(total); //11 Here 0.18 loss happening
        //Hence Narrowing will lead to loss
        int a4 = 10;
        a4+=10; //a4 = a4+10
        System.out.println(a4); //20
        a4/=10;
        System.out.println(a4); //2




    }
}
