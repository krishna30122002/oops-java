// Abstract methods are methods that only have a declaration and no implementation means they only have a method definition but not he body


// A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods

//  Abstract class is a restricted class that cannot be used to create objects

abstract class Parent{
    int age;
    final int value;

    public Parent(int age){
        this.age=age;
        value=30000;
    }

    // can we create abstract constructors? -> abstract constructors are NOT allowed

    abstract void career();
    abstract void partner();

    // abstract static methods are also NOT allowed in abstract classes beacuse they cannot be overridden so what's the point in creating abstract methods

    static void hello(){
        System.out.println("Hello!");
    }
    // static methods can be created in the abstract classes

    void normal(){
        System.out.println("This is a normal method");
    }
    //yes they behave the same way as a normal method
}

// every child class have to inherit all the abstract methods in the parent class

class Son extends Parent{

    public Son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a Coder");
    }

    @Override
    void partner() {
        System.out.println("I Love Chilli Flakes");
    }
}

class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I Love Oregano");
    }
}

public class abstraction{
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(25);
        daughter.career();

        // Parent mom = new Parent(40);
        // We cannot create objects of an abstract classes

        Parent.hello();

        son.normal();
    }
}

// we do not have final abstract class because we want it to be inherited