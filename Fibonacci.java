// 3. To generate Fibonacci series up to the given input number using recursion.


import java.util.Scanner;


public class Fibonacci
{
    static int a =0;
    static int b =1;


    static void print_fibonacci(int n)
    {
        if(n>2)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

            print_fibonacci(n-1);
        }     
        
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();

        System.out.println();
        System.out.println(a);
        System.out.println(b);
        print_fibonacci(limit);

    }
    
}
