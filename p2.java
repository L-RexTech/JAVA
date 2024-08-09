import java.util.*;
public class p2 {
    static boolean palindrome(String s)
    {
        char ch[]=s.toCharArray();
        int start=0, end=ch.length-1;
        while(start<end)
        {
            if(ch[start]!=ch[end])
            return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.next();
        if(palindrome(str))
        {
            System.out.println("Palindrome");
            
        }
        else
        {
            System.out.println("NOT PALINDROME");
            
        }
        sc.close();
        
    }
    
}
