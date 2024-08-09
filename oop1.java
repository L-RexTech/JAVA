
class oop1
{
    public static void main(String args[])
    {
    Student raj=new Student();
    Student prajjwal=new Student(13,"Prajjwal",100.1f);
    /*raj.rno=27;
    raj.name="raj";
    raj.marks=77.00f;*/   // made a constructor
  

    System.out.println(raj);
    System.out.println(raj.rno);
    System.out.println(raj.name);
    System.out.println(raj.marks);
    //System.out.println(raj.phno); error as phone number does not exist in the template
    
    raj.greet();//whenever u try to access any particular item of the class by its object
                //then every value will be specific to that object
       
    raj.changeName("shoeLover");
    raj.greet();

    Student random=new Student(prajjwal);
    System.out.println(random.name);
    
 

    }
    

}
class Student
{
    int rno;
     String name;
    float marks;
    void greet()
    {
        System.out.println("Hello my name is="+this.name);
      }
      void changeName(String s)
      {
        name=s;
      }
    Student() //constructor
    {
        this.rno=27;
        this.name="raj";
        this.marks=77.00f;
    }
    Student(int r,String s,float mar) //constructor
    {
        rno=r;
        name=s;
        marks=mar;
    }
   Student(Student other)
   {
    this.rno=other.rno;
    this.name=other.name;
    this.marks=other.marks;
   }

    
}