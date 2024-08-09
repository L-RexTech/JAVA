public class p1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int a=5,b=6;
   a=a+b;
 b=a-b;
a=a-b;
System.out.println(a+"/n"+b);
long endTime   = System.nanoTime();
long totalTime = endTime - startTime;
System.out.println(totalTime);
    
}
}
