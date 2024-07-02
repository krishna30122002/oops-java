// An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behavior. A Java interface contains static constants and abstract methods.

// static methods or properties are not dependent on the objects.

// the variables are static and final by default in interfaces

//***IMPORTANT*** */
// Be careful not to use interfaces in a performance critical code because it happens at runtime and develops an overhead;

class Car implements Engine, Brakes{
    @Override
    public void brakes() {
        System.out.println("I brake like a normal car");
    }
    
    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }
    
    @Override
    public void stop(){
        System.out.println("I stop engine like a normal car");
    }
    
    @Override
    public void accelerate(){
        System.out.println("I accelerate like a normal car");
    }
}

public class MainInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.start();
        car.stop();
        car.brakes();

        Car music = new Car();
        music.start();
    }
}
