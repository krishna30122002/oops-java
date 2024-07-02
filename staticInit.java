public class staticInit {
    static int a=4;
    static int b;

    // static block
    // will only run once when the first object is created or when the class is loaded for the first time
    static{
        System.out.println("I am in a static block");
        b=a*5;
    }

    public static void main(String[] args) {
        staticInit obj=new staticInit();
        System.out.println(staticInit.a+" "+staticInit.b);
        
        staticInit.b+=5;
        
        staticInit obj2=new staticInit();
        System.out.println(staticInit.a+" "+staticInit.b);
        
    }
}
