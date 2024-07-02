public class Human{
    int age;
    String name;
    int salary;
    boolean married;
    //long population; // it is printing 1 & 1 for raj and rahul respectively;

    static long population; // NOW IT IS PRINTING 2 & 2 FOR RAJ AND RAHUL RESPECTIVELY WHICH IS A TRUE STATEMENT ALSO

    static void message(){
        System.out.println("Hello World!");
        // System.out.println(this.age); -> can't use this over here because it is not static we have create object to access it
    }

    public Human(int _age, String _name, int _salary, boolean _married){
        this.age=_age;
        this.name=_name;
        this.salary=_salary;
        this.married=_married;

        Human.population+=1; // independent property common to all objects
    }
}