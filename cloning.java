import java.util.Arrays;

class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] { 3, 4, 5, 6, 7 };
    }

    public Human(Human h) {
        this.age = h.age;
        this.name = h.name;
    }

    // for shallow copy
    // public Object clone() throws CloneNotSupportedException{
    // return super.clone();
    // }

    // for deep copy
    public Object clone() throws CloneNotSupportedException {
        // this is deep copy
        Human twin = (Human) super.clone(); // this is actually shallow copy

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}

public class cloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        // copy of raj
        // problem is that we are using much more overhead in creating a twin because of
        // new keyword
        Human raj = new Human(22, "Raj");
        // Human twin = new Human(raj);

        // another best method
        Human twin = (Human) raj.clone();

        // It actually does the shallow copy of the object

        // In Shallow copy, a copy of the original object is stored and only the
        // reference address is finally copied.

        System.out.println(twin.name + " " + twin.age);

        // In Deep copy, the copy of the original object and the repetitive copies both
        // are stored.

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(raj.arr));
        twin.arr[0] = 3; // change again

        // Above is the example of the shallow copy

        // How to create deep copy?
        // You have to check the above 'Human' class
        System.out.println(Arrays.toString(raj.arr));
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        // this arr will not CHANGE
        System.out.println(Arrays.toString(raj.arr));
        // this arr will CHANGE
        System.out.println(Arrays.toString(twin.arr));
    }
}
