// A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaExpressions {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        list.forEach((item) -> {
            {
                System.out.println(item * 2);
            }
        });

        // Important

        Consumer<Integer> fun = (item)->System.out.println(item);
        list.forEach(fun);

        Operation sum=(a, b)->a+b;
        Operation minus=(a, b)->a-b;
        Operation prod=(a, b)->a*b;

        lambdaExpressions calc = new lambdaExpressions();
        
        System.out.println(calc.operate(5, 3, sum));
        System.out.println(calc.operate(5, 3, minus));
        System.out.println(calc.operate(5, 3, prod));
    }

    private int operate(int a, int b, Operation o){
        return o.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}
