/*
 * 2. Program to generate a Triangle. eg:
        1
        22
        333
        4 4 4 4 
 */

import java.util.Scanner;

public class NummberTriangle 
{
  static void print_triangle(int n)
  {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
  } 

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();

    print_triangle(num);
     
  }
}
