public class inheritance{
    public static void main(String[] args) {
        // Box box1=new Box();
        // System.out.println(box1.l+"   "+box1.h+"   "+box1.w);
        
        // Box box2=new Box(15);
        // System.out.println(box2.l+"   "+box2.h+"   "+box2.w);

        // Box box3=new Box(4,5,6);
        // System.out.println(box3.l+"   "+box3.h+"   "+box3.w); 

        //single inheritance
        BoxWeight boxWeight=new BoxWeight(11, 12, 13, 14);
        System.out.println(boxWeight.l+"   "+boxWeight.h+"   "+boxWeight.w+"   "+boxWeight.wt);

        Box box5 = new BoxWeight(1, 2, 3, 4); // this is a reference type of Box(parent) and it is referencing to the object of type BoxWeight(child)

        System.out.println(box5.l); // -> accessible properties of superclass only
        // System.out.println(box5.wt); -> not accessible
        
        // there are many variable in both parent and child classes
        // you are given access to variable that are in the refernce type i.e. BoxWeight
        // hence you should have access to 'wt' variable
        // this also means that the ones you are trying to access should be initialised
        // but here when the object itself is of type parent class, how will you call the constructor of child class
        // that's why it is giving error

        // BoxWeight box6 = new Box(1, 2, 3, 4); // this is a reference type of BoxWeight(child) and it is referencing to the object of type Box(parent)

        // System.out.println(box5.l); // -> accessible properties of superclass only
        // System.out.println(box5.wt); -> not accessible

        // multilevel inheritance
        BoxPrice boxPrice = new BoxPrice();
        System.out.println(boxPrice.cost);

        // JAVA does not support multiple inheritance because of the ambiguity error i.e. suppose two parent classes have the same variable name 'n' and then the object tries to access the variable 'n' then it is confusible situation which class variable it will access that's why it does not support multiple inheritance.

        // Though we can implement it throught the concept of interfaces, will surely do it later...

        //Heirarchical Inheritance -> One classes is inherited by many subclasses

        //Hybrid Inheritance - Combination of single and multiple inheritance - ( NOT IN JAVA ) - taught later in concept of Interface

        // static methods depends on objects hence they cannot be inherited
    }
}