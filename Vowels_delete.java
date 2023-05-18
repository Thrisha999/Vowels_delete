import java.util.*;
import java.util.Scanner;
class Vowels_delete
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        s=sc.nextLine();
        int n = s.length();
        System.out.println("string after removing the vowels:");
        for(int i=0;i<n;i++)
        {
            if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||(s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
            {
                continue;
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}