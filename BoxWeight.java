public class BoxWeight extends Box {
    double wt;

    public BoxWeight(){
        this.wt=-1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        wt=other.wt;
    }

    BoxWeight(double side, double wt){
        super(side);
        this.wt=wt;
    }

    public BoxWeight(double l, double h, double w, double wt){
        super(l, h, w); // this calls the parent class constructor

        System.out.println(super.w); // if this keyword can be used instead of super then why we use super because super directly refers to superclass if this is used and if the variables is same in both superclass and subclass so their will be a mismatch. To avoid this we use 'super' keyword

        this.wt=wt;
    }
}
