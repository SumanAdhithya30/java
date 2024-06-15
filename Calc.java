import java.util.Scanner;

public class Calc
{
    void even(int n)
    {
        if (n % 2 == 0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
    }

}
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        Calc obj = new Calc();
        obj.even(n);

    }
}