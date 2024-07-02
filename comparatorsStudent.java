import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);

        // if diff == zero then means both are equal
        // if diff < 0 then means o is bigger
        // else it then means o is smaller

        return diff;
    }
}

public class comparatorsStudent {
    public static void main(String[] args) {
        Student raj = new Student(12, 95.8f);
        Student rahul = new Student(18, 92.3f);

        // if(raj > rahul){ // we use camparable class to make this work
        if (raj.compareTo(rahul) < 0) {
            System.out.println("Raj has more marks");
        } else {
            System.out.println("Rahul has more marks");
        }

        Student arpit = new Student(19, 96.3f);
        Student sachin = new Student(13, 91.3f);
        Student karan = new Student(11, 99.3f);

        Student[] list = { raj, rahul, arpit, karan, sachin };

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
        
        // for sorting in ascending order
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks - o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));
        
        // for sorting in descending order
        // Arrays.sort(list, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return -(int) (o1.marks - o2.marks);
        //     }
        // });

        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));
    }
}
