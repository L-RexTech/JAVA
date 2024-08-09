public class DUTCHFLAG {
    static void swap(int a,int b,int[] nums)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        
    }

    static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

    static void DFS(int[] arr)
    {
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==1)
            mid++;

            if(arr[mid]==0)
            {   
                swap(mid,low,arr);
                low++;
                mid++;
            }

            if(arr[mid]==2)
            {
                swap(mid,high,arr);
                high--;
            }
        }


    }
    public static void main(String args[])
    {
        int[] ar={0,1,1,1,2,2,2,2,0,0,0,1,1,1,2};
        DFS(ar);
        printArray(ar);

    }
    
}
