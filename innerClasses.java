// outside classes cannot be static it will throw an error
// here innerClass is the outer class and it should not be static

public class innerClasses {
    static class test{
        // test class is dependent on class innerClasses

        // when we made this class static it is not dependent on the objects of the innerClasses but it can have their own objects in the main method and they can depend on each other

        String name;

        public test(String _name){
            this.name=_name;
        }

        void print(){
            System.out.println(this.name);
        }
    }

    // outputs the same name "rahul" for both the objects 

    // static class test{
    //     // test class i s dependent on class innerClasses

    //     static String name; // since static variables do not depend on the object and they resolved during compile-time because they are class variables

    //     public test(String _name){
    //         test.name=_name;
    //     }

    //     void print(){
    //         System.out.println(this.name);
    //     }
    // }

    public static void main(String[] args) {
        test a = new test("Raj"); // no error becuse the test class is static
        test b = new test("Rahul"); // no error becuse the test class is static
        a.print();
        b.print();
    }
}

// will throw an error as it cannot be static because it is not itself dependent on other class
// static class A{

// }