
// import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class frameworks {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(15);
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(34);
        list2.add(78);
        list2.add(55);
        System.out.println(list2);

        // Arraylist is not synchronized as multiple threads can access the same object.
        // It is faster

        // vector synchronization - Only one thread at a time and if other thread wants
        // to access it will have to wait until the execution of thread1 is finished

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(103);
        vector.add(98);
        vector.add(55);
        System.out.println(vector);

        // Enum in Java is a special class that represents a group of constants.
        // Constants are unchanging variables, like final variables. Enums are often
        // used in switch statements to check for corresponding values.

        Week week;
        week = Week.Monday;

        for (Week day : Week.values()) {
            System.out.print(day + " ");
        }
        System.out.println();

        System.out.println(week);
        System.out.println(week.ordinal()); // it shows the position of the enum declaration

        week.hello();

        System.out.println(Week.valueOf("Monday"));
    }

    enum Week implements A {
        // these are enum constants
        // these are basically public, static and final and hence they cannot be
        // inherited by the child
        // type is Week

        // All the enums explicitly extends java.lang.enum class
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " + this.toString());
        } // constructor will run run for all of days
          // this is nor public not protected but rather private or default because we do
          // no twant to create new objects as creating new objects is out of context in
          // the concept of enums

        // internally -> public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("Hey! how are you?");
        }
    }
}

/**
 * Innerframeworks
 */
interface A {
    void hello();
}