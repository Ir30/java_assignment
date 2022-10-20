//4. To check whether the given input string is Palindrome or not (without string functions).

import java.util.Scanner;

public class Palindrome 
{
    static boolean check_palindrome(String s)
    {
        int size = s.length();
        char[] word = s.toCharArray();

        int count = word.length;
        char[] rev = new char[count];

        for(char c:word)
        {
            rev[count-1]=c;
            count--;
        }

        String reversed="";
        for(char c:rev)
        {
            reversed = reversed+c;
        }

        // System.out.println(reversed);
        // System.out.println(reversed.length());

        if(s.equals(reversed))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check Palindrome: ");
        String w = sc.nextLine();

        System.out.println(check_palindrome(w));
    }
    
}
