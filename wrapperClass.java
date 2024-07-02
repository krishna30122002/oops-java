public class wrapperClass {
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    
    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;

        swap(a, b);
        System.out.println(a+" "+b); // value will not change because pass by value

        // now we will perform pass by reference by using wrapper class

        Integer x=a;
        Integer y=b;
        swap(x, y);
        System.out.println(x+" "+y); // values will still not change because the wrapper class itself a final class

        // final class must be initialised while declaring

        // if the reference variable is now pointing to the new object then the old object is destroyed by the Garbage Collector 
        
        // We can even use object.finalize() that is now deprecated so that when the old objects is destroyed by the Garbage Collector it can send us the message specified by us in the finalize() function.
    }
}