public class Circle extends Shapes {
    // @Override



    //  this will run when object of Circle is created hence it is overriding the parent method

    @Override  // this is called annotation used for overridden check purposes
    void area(){
        System.out.println("I am in Circle");
    }
}
