import java.util.*;

class LinkedList {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = cnvtArrToLL(arr);
        
        
        /*System.out.println("Enter the element to be searched ");
        int x = sc.nextInt();
        System.out.println("Count of members=" + countLL(head));
        if (findInLL(head,x))
         {
            System.out.println("present");
        }

        else
         {
            System.out.println("Absent");
         }*/

         /*  head=deleteHead(head);
         print(head);*/

        /*  head=KthElementDelete(head,6);
         print(head);*/

         /*head=ElementDelete(head,4);
         print(head);*/
         
         /*head=insertTail(head,8);
         print(head);*/

         System.out.println("Enter the element");
         int e=sc.nextInt();
         System.out.println("Enetr the position nefore u wanna insert the element");
         int n=sc.nextInt();
         head=insertBefKth(head, n, e);
         print(head);
         

         sc.close();

    }
    static Node insertHead(Node head,int e)
    {
        /*Node temp=new Node(e);
        temp.next=head;
        return temp;*/

        return new Node(e,head);

    }
    static Node insertTail(Node head,int e)

    {
        if(head==null)
        return new Node(e);

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new Node(e);
        return head;
    }
    static Node insertBefKth(Node head,int k,int e)
    {
        if(head==null)
        head=new Node(e);

        if(k==1)
        {
            Node temp=new Node(e,head);
            head=temp;
        }
        int c=0;
        Node temp1=head;
        while(temp1!=null)
        {
            c++;
            if(c == k-1)
            {
                Node x=new Node(e,temp1.next);
                temp1.next=x;
            }
            temp1=temp1.next;
        }
        
        return head;
    }

    static Node KthElementDelete(Node head,int n)
    {
        Node temp=head;
        if(head==null)
        return head;
        if(n==1)
        {
            head=head.next;
        }
        else if(n==countLL(head))
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        else if(countLL(head)<n)
        {
            System.out.println("Invalid input");
            head=null;
            
        }
        else{
            for(int i=1;i<n-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        return head;
    } 
    static Node ElementDelete(Node head,int e)
    {
        Node temp=head;
        if(head==null)
        return head;
        if(head.data==e)
        {
            head=head.next;
        }
        else{
            Node prev=null;
            while(temp!=null)
            {
                if(temp.data==e)
                {
                    prev.next=prev.next.next;
                }
                prev=temp;
                temp=temp.next;
            }
            return head;

        }
        return head;
    } 
    static boolean findInLL(Node head,int x)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==x)
            return true;

            temp=temp.next;
        }
        return false;

    }
    @SuppressWarnings("unused")
    private static Node deleteTail(Node head)
    {
        if(head==null||head.next==null)
        return null;

        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    @SuppressWarnings("unused")
    private static Node deleteHead(Node head)
    {
        if(head==null||head.next==null)
        return null;
        head=head.next;
        return head;
    }

    private static int countLL(Node head) {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    static Node cnvtArrToLL(int ar[]) {
        Node head = new Node(ar[0]);
        Node mover = head;
        for (int i = 1; i < ar.length; i++) {
            Node temp = new Node(ar[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
