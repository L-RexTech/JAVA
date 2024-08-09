import java.util.*;
class ARRAY
{
    static void input(int ar[],Scanner sc)
    {
           for(int i=0;i<ar.length;i++)
        {
            System.out.println("Enter the value of "+i+" index of array");
            ar[i]=sc.nextInt();
        }
    }
    static void prntar(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    static void add(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            ar[i]+=1;
        }
    }
    static void update(int ar[],Scanner sc)
    {
        
        System.out.println("Enter the index");
        int i=sc.nextInt();
        System.out.println("Enter the value to be replaced");
        int v=sc.nextInt();
        ar[i]=v;
    }
    static void rmeven(int ar[])
    {
        int n=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2!=0)
            {
                n++;
            }
        }
        int arr[]=new int[n];
        for(int j=0;j<ar.length;j++)
        {
            if(ar[j]%2!=0)
            {
                arr[n-1]=ar[j];
                n--;
            }
        }
        prntar(arr);

    }
    static void swap(int array[],int a,int b)
    {
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    static int[] reverse(int ar[],int s,int e)
    {
        while(e>s)
        {
            swap(ar,s,e);
            e--;
            s++;
        }
        return ar;
    }
    static int min(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        return min;
    }
    static int secmax(int[] arr)  //REVISE
    {
        int secmax,max;
        secmax=Integer.MIN_VALUE;
        max=secmax;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }
            else if (arr[i]>secmax && arr[i] != max)
            {
                secmax=arr[i];
            }
        }
        return secmax;
    } 
    static int[] shift0(int arr[]) //REVISE
    {
        int count =0;
        int arrr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arrr[count]=arr[i];
                count++;
            }
        }
        while(count<arr.length)
        {
            arrr[count]=0;
            count++;
        }
        return arrr;

    
    }
    static int[] shift0two(int[] arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0&&arr[j]==0)    //i and j will be togethere till 0 is found
            {
                swap(arr, j, i);
            }
            if(arr[j]!=0)               //arr[j] can be non zero after swapping -> if is used
            {
                j++;
            }
        }
        return arr;
    }
     static int[] resize(int[] array,int cap)
    {
        int temp[]=new int[cap];
        for(int i=0;i<array.length;i++)
        {
            temp[i]=array[i];
        }
        array=temp;
        return array; //when method gets terminated evrything 
                      //becomes garbage collected and array again points to the intial one
                        //thats y return the array
    }
    static int checkMissin(int[] araa,int n)
    {
        int s=0,x;
        for(int i=0;i<araa.length;i++)
        s=s+araa[i];
        x=(n*(n+1))/2;
        x=x-s;
        return x;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ara[]= new int[n];
        System.out.println("Hello");
       
        input(ara,sc);
        //rmeven(ara);
        //prntar(ara);
         
         /*System.out.println("Enter start");
        int s=sc.nextInt();
        System.out.println("Enter end");
        int e=sc.nextInt();
        
        int arr[]=reverse(ara,s,e);;
        prntar(arr);*/

        
       // System.out.println("Minimum is = " + min(ara));
        //System.out.println("Second Max is = "+ secmax(ara) );
        
        //prntar(shift0two(ara));


       /*  System.out.println("Size of orig array="+ara.length+" and its members are=");
        prntar(ara);
        System.out.println();
        ara=resize(ara,8);
        System.out.println("Size of new array="+ara.length+" and its members are=");
        prntar(ara);*/ 
        System.out.println("Enter the n for the natural number");
        int nos=sc.nextInt();
        int x=checkMissin(ara,nos);
        System.out.println(x);
                
        
        
        

        
        
    }

}