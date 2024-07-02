public class BoxPrice extends BoxWeight{
    
    double cost;

    BoxPrice(){
        super();
        this.cost=-1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    BoxPrice(double side, double wt, double cost){
        super(side, wt);
        this.cost=cost;
    }

    public BoxPrice(double l, double h, double w, double wt, double cost){
        super(l, h, w, wt); // this calls the parent class constructor

        System.out.println(super.wt); // if this keyword can be used instead of super then why we use super because super directly refers to superclass if this is used and if the variables is same in both superclass and subclass so their will be a mismatch. To avoid this we use 'super' keyword

        this.cost=cost;
    }
}