public class staticConcept {
    // this is dependent on object and belongs to an instance
    void greeting(){
        //fun(); // static methods can be used in non-static methods
        System.out.println("Hello!");
    }

    // this is not dependent on object and does not belongs to an instance
    static void fun(){
        // greeting(); -> we cannot access non-static methods without referencing their instance in a static context 

        // but we can do this by creating object
        staticConcept obj=new staticConcept();
        obj.greeting();

        System.out.println("Fun");
    }
    public static void main(String[] args) {
        Human raj = new Human(22, "Raj", 50000, false);
        Human rahul = new Human(26, "Rahul", 100000, true);

        // such properties that are not directly related to the objects are called
        // static that means it is independent and applied to all

        // best example to learn about static
        // System.out.println(raj.population); // print 1
        // System.out.println(rahul.population); // print 2

        // because of static answer will be true for all objects
        System.out.println(Human.population); // the convention we should use

        // why static is used in the main method -> we can use the main method without creating an object of the class
        // -> main method is the very first method that runs when we execute the file
        //The main() method is declared static so that JVM can call it without creating an instance of the class containing the main() method.

        //greeting(); // will throw error because in static method we cannot call anything which are non-static

        //we know that something which is not static belongs to an object

        fun(); // run easily run as it is static method
    }
}
