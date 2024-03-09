package PracticeTTA;
//In jdk 11, it will work, we can return value from switch
public class Lab010 {
    public static void main(String[] args) {
        String code = "w";
        String msg = switch (code){
            case "w" :
                System.out.println("Hi");
                yield "Yes";
            default:
                System.out.println("Bye");
                yield  "Default";
        };
        System.out.println(msg);

    }
}
