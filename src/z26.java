import java.util.Scanner;

public class z26 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int x = s.nextInt();
        int b= x<0 ? x*(-1) : x;
        System.out.println(b + " " + b/2 + " " + b%5);
    }

}
