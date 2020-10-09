package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a=");
        double a = input.nextInt();
        System.out.print("b=");
        double b = input.nextInt();
        System.out.print("c=");
        double c = input.nextInt();

        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.print("Many values");
                }else{
                    System.out.print("No values");
                }
            }else{
                double x = -c/b;
                System.out.print(x);
            }
        }else{
            double d = b*b - 4*a*c;
             if(d<0){
                 System.out.print("Imaginary values");
             }else{
                 double firstx = (-b + Math.sqrt(d))/(2*a);
                 double secondx = (-b - Math.sqrt(d))/(2*a);

                 System.out.print(firstx + ", " + secondx);
             }
        }
    }
}

