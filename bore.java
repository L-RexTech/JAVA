import java.util.*;
class bore {
    public static void main(String args[])
    {
        long startTime = System.nanoTime();
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        int c=0;char flag='\0';int sum=0;
        for(int i=0;i<ch.length-1;i++)
        {
            c++;
            if(ch[i]!=ch[i+1])
            {
                System.out.println(ch[i]+"="+c);
                flag=ch[i+1];
                sum=sum+c;
                c=0;

            }
            
        }
        System.out.println(flag + "="+ (ch.length-sum));
        
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime+" nanosec");
        sc.close();

    
        

    }
}
