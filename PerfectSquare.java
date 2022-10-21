// 5. To display all the perfect square numbers between two input numbers interval.


import java.util.Scanner;

public class PerfectSquare
{
    static void print_perfect_square(int start,int end)
    {
        float s=(float)start;
        float e=(float)end;
        for(float i=s;i<=e;i++)
        {
            for(float j =1;j<=i;j++)
            {
                if((i/j)==j)
                {
                    // System.out.println(i/j+" - "+j);
                    System.out.println((int)i);
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending point: ");    
        int end = sc.nextInt();
        System.out.println("------------------------");

        print_perfect_square(start, end);


    }
}
