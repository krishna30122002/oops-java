// when object class is inherited by all classes by default then if we inherit some other class. Does it do not signify the multiple inheritance. -> Answer is it is internally and indirectly inheriting object class

public class objectClass {

    int num;
    float val;

    public objectClass(int num, float val){
        this.num=num;
        this.val=val;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        // super.finalize(); // -> giving warning
    }

    @Override
    public int hashCode() {
 
        // we will go in details of how to create it in hashmap lecture
        
        // one misconception among people is that hashcode return address of value but it is not it just returns the random integer value to identify that the object is same object or different object(uniqueness of the object)

        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        objectClass obj1 = new objectClass(33, 45.5f);
        objectClass obj2 = new objectClass(33, 59.4f);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        // both answers are different
        
        if(obj1==obj2){
            System.out.println("obj1 is equal to obj2(==)");
        }
        
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2(equals)");
        }

        // instanceOf Operator

        // System.out.println(obj1 instanceof A); // can be used in the concept of inheritance when there are subclasses

        // getClass()
        // getClass() is 'final' hence we cannot override it
        // it has many methods to try it out, you can try any of them
        
        System.out.println(obj1.getClass().getName());
    }
}
