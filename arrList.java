import java.util.*;
class arrList
{
    public static void main(String args[])
    {
        //arraylist size is variable
        //stored non contiguously
        //can store only objects
        //are made in heap()
        //2 types of memory storssge of variables-heap/stack
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<String>();
        ArrayList<Boolean> list3=new ArrayList<>();
        ArrayList<ArrayList<Integer>> listoflist=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> lis1=new ArrayList<Integer>();
        ArrayList<Integer> lis2=new ArrayList<Integer>();
        ArrayList<Integer> lis3=new ArrayList<Integer>();
        
        list.add(0);
        list.add(2);
        list.add(3);

        //add elements
        lis1.add(1);
        lis1.add(2);
        lis1.add(3);

        lis2.add(4);
        lis2.add(5);
        lis2.add(6);

        lis3.add(7);
        lis3.add(8);
        lis3.add(9);

        listoflist.add(lis1);
        listoflist.add(lis2);
        listoflist.add(lis3);

        System.out.println(list);
        list2.add("Shani");
        list2.add("Nitin");
        list2.add("Satyam");
        list2.add("Jyoti");
        list2.add("Gagan");
        list2.add("Lakhan");
        System.out.println(list2);
        list3.add(true);
        list3.add(true);
        list3.add(false);
        list3.add(true);
        list3.add(true);
        list3.add(false);
        System.out.println(list3);
        
        //get element
        int e=list.get(0);
        System.out.println(e);

        //add e in between
        list.add(1,1);
        list.add(4,5);//add 5 to 4th index
        System.out.println(list);
        
        //change/set element on index
        list.set(0,100);
        System.out.println(list);

        //delete/remove an index
        list.remove(0);
        System.out.println(list);
        
        //size of list
        int s=list.size();
        System.out.println(s);

        //iterate ex
        for(int i=0;i<list.size();i++)
        {
            System.out.println("Index"+i+"=="+list.get(i));
            
        }
        
        
        ArrayList<Integer> list4=new ArrayList<Integer>();
        list4.add(89);
        list4.add(78);
        list4.add(90);
        list4.add(1);
        list4.add(-87);
        
        //sorting Ascending
        Collections.sort(list4);
        System.out.println(list4);
        
        System.out.println(listoflist);
        System.out.println(listoflist.size());
        

    }
}