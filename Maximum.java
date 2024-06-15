import java.io.*;
import java.util.Scanner;
public class Maximum {
    void max(int a,int b,int c)
    {
        if ( a>b && a>c)
        {
            System.out.println(a+" is maximum");
        }
        else if (b>a && b>c)
        {
            System.out.println(b+" is maximum");
        }
        else
            System.out.println(c+" is maximum");

    }
    public static void main(String[] args)
    {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        num1 = sc.nextInt();
        System.out.println("enter second number");
        num2 = sc.nextInt();
        System.out.println("enter third number");
        num3 = sc.nextInt();
        Maximum obj = new Maximum();
        obj.max(num1,num2 ,num3);

    }

}
