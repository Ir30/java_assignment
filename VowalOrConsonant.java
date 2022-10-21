// 6. Find whether the given character is vowel or consonant using switch control.
import java.util.Scanner;

public class VowalOrConsonant 
{
    static String Check_char(char c)
    {   
        boolean flag;
        char s = java. lang. Character. toLowerCase(c);
        switch(s)
            {
                case 'a':
                    flag = true;
                    break;
                case 'e':
                    flag = true;
                    break;
                case 'i':
                    flag = true;
                    break;
                case 'o':
                    flag = true;
                    break;
                case 'u':
                    flag = true;
                    break;
                default:
                    flag = false;
            }
        if(flag)
        {
            return "Vowel";
        }
        else
        {
            return "Consonant";
        }
    }  
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charecter to check: ");
        char c = sc.next().charAt(0);
        
        System.out.println("-------------------");
        System.out.println(Check_char(c));
    }
    
}
