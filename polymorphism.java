public class polymorphism {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        // Square square = new Square();
        Shapes square = new Square();

        shape.area();
        circle.area();
        triangle.area();
        square.area();

        // Here, area() is showing the concept of Polymorphism because it the representing the same thing in multiple ways

        //compile-time or static polymorphism
        //This is achieved via method overloading -> Same name but types, arguments, return types, ordering can be different. E xample -> multiple constructors

        //runtime or dynamic polymorphism
        //This is achieved via method overriding -> When the child class method is same as the parent class

        // When the reference variable of the superclass is referencing to the child class and which method will be called depends on is known as upcasting

        // Dynamic Method Dispatch -> It is just a mechanism by which a call to an overridden method is resolved at run-time rather at compile time

        // final keyword can be used to prevent overriding; a final method cannot be overridden

        //Early binding and late binding are terms used in programming to describe when methods are called during compilation or run-time. 
        //Early binding, also known as static binding, occurs when the compiler resolves binding at compile time.  
        //Late binding, also known as dynamic binding, occurs when the compiler doesn't decide which method to call.
        // Also used to prevent inheritance

        // If a certain class is final then it's all methods are also final

        //static methods can be inherited but cannot be overridden

        //overriding depends on object, static does not depend on objects hence you it cannot be overridden

        // Concept of Polymorphism does not apply to instance variables

        // abstraction - external stuff
        // encapsulation - internal working
        //Abstraction is the process of gaining informationa nd encapsulation is the process of containing the information

        // abstraction is at design level
        // encapsulation is at implementation level
    }
}