// import java.util.ArrayList;

class A{
    private int num;
    public String name;
    protected int[] arr;

    public A(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }

    public void setNum(int num){
        this.num=num;
    }

    public int getNum(){
        return num;
    }
}
public class accessModifier{
    public static void main(String[] args) {
        A obj=new A(10, "Raj");
        
        //need to do a few things
        //access the data members
        //modify the data members

        // ArrayList<Integer> list=new ArrayList<>();
        // System.out.println(list.DEFAULT_CAPACITY); -> will not access this because it is private

        //if access modifier is public then we can access it anywhere we want

        //if no access modifier is there then the access modifier is 'default' by default 

        // System.out.println(obj.num); -> num is private

        // protected is used when we are talking about inheritance 
        
        System.out.println(obj.getNum()); // accessed via getter and setter


        // protected

        // in different packages with protected, you will only able to access it in subclasses
    }
}