
class Solution
{
	public static void main (String args[])
	{
		int a[]={1,2,3,4};
		int temp[]=new int[8];
		for(int i=0;i<a.length;i++)
		{
			temp[i]=a[i];
		}
		a=temp;
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}