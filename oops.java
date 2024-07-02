package oops;
// import java.util.*;

// a class is a blueprint of an object and an object is an instance of a class

// import static com.raj.packages.Message.message;

class Student {
    int rollNo;
    String name;
    float marks;

    // Student(){
    //     rollNo=33;
    //     name="Raj";
    //     marks=93.5f;
    // }    
    
    Student(){
        //this is how you can call a constructor from another constructor

        this(45, "Ankur", 95.5f);
    }    

    Student(int _rollNo, String _name, float _marks){
        this.rollNo=_rollNo;
        this.name=_name;
        this.marks=_marks;
    }    

    void greeting(){
        System.out.println("Hello, My name is " + this.name);
    }

    // issue: it is getting the same answer by using or not using the this keyword -> answer is this that it is refencing to the current variable & also when you have the same variable name just as the parameterized input taken btw JAVA is Intelligent!

    void changeName(String newName){
        this.name=newName;
    }

    Student(Student other){
        this.rollNo=other.rollNo;
        this.name=other.name;
        this.marks=other.marks;
    }
}

public class oops {
    public static void main(String[] args) {

        Student raj;

        // 'new' keyword does the dynamic memory allocation

        // raj=new Student();// -> dynamically allocates memory and returns a reference to it

        // one liner -> Student raj = new Student()

        // important -> 'raj' here is the reference variable pointing to an object which
        // is already in the heap so that we cannot access and manipulate the referneces
        // because of the security

        // raj.rollNo=33;
        // raj.name="Raj";
        // raj.marks=95.5f;

        // a constructor basically defines what happens when your object will be created

        // a constructor is a special function that runs when you create a object and it allocates some variables as you like

        // Student() -> By default constructor

        raj = new Student(33, "Raj", 93.5f); // parameterized constructor

        //the constructor is automatically called when the object is created

        System.out.println(raj.rollNo);
        System.out.println(raj.name);
        System.out.println(raj.marks);

        raj.greeting();
        // raj.changeName("Krishna");
        // raj.greeting();
        
        // Student random=new Student(raj);
        // random.greeting();

        Student arpit=new Student(34, "Arpit", 99.5f);

        arpit.greeting();
        
        Student ankur = new Student();
        ankur.greeting();

        // java uses primitive data types as the primitive only in a stack space(to increase efficiency) while python uses primitive data types as objects in the heap

        //both objects are referring to the same memory location
        Student one = new Student();
        Student two = one;

        one.name="One";
        two.greeting();

        Student random=new Student(1,"Random",55.0f);
        System.out.println(random); // this will print you some random hashcode as println() calls the toString() method if the string not found then it returns some particular hashcode 

        //read packages from the notes i think i am unable to create a package in VS Code
        // message(); -> the public method that can be accessed but private can't
    }
}