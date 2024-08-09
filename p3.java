public class p3 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();


        int a=5;
        int b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
        long endTime   = System.nanoTime();
long totalTime = endTime - startTime;
System.out.println(totalTime);
    }
}
