import java.util.Scanner;

import java.lang.Math;

public class z25 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        double x = s.nextDouble();

        System.out.println((x+(1/x)) + " " + (Math.sin(2*x)+Math.pow(Math.cos(x), 2)) + " " + Math.sqrt(Math.pow(x, 2) + 3*x - 8));
    }
}
