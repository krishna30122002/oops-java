public class Box{
    double l;
    // private double l; -> only accessible to Box class only
    double h;
    double w;

    Box(){

        super(); // not giving any error because it refers to the object superclass because every class we create has 'object' as a superclass

        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    
    Box(double l, double h, double w){
        System.out.println("Box class constructor");
        this.l=l;
        this.h=h;
        this.w=w;
    }

    Box(Box old){
        this.l=old.h;
        this.h=old.h;
        this.w=old.w;
    }

    public void print(){
        System.out.println("Printing the box's dimensions");
    }
}
