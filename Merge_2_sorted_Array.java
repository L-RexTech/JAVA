class Merge_2_sorted_Array {
    static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int[] arr=new int[m+n]; 
        int count=0;
        int min=Math.min(m,n)-1;//max index of shortest array
        int first=0,second=0;
        while(count<=min)
        {
            if(nums1[first]<=nums2[second])
            {
                arr[count]=nums1[first];
                count++;
                first++;
            }
            else
            {
                 arr[count]=nums2[second];
                count++;
                second++;
            }
        }
        return arr; 

    }
              
    
      public static void main(String args[])
    {
        int[] nums1={1,2,3,4,5};
        int[] nums2={2,3,4,5};
        printArray(merge(nums1,5,nums2,4));
    }
}
