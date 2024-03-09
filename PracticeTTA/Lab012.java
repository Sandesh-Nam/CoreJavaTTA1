package PracticeTTA;
//loops
public class Lab012 {
    public static void main(String[] args) {
        for (int i=1 ; i <=5 ; i++ ){
            System.out.println(i);
        }
        //WAP, go from 1 to 10,
        // if you find i = 5 then break
        for (int j=1; j<=10; j++) {
            if(j==5){
                System.out.println("Found 5");
                break;
            }
        }
        //break will help you to come out from loop.
        //if there is no break, then it will print 6,7,8,9,10,End
        System.out.println("End");
    }
}
