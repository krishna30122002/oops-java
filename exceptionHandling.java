// Errors are usually caused by serious problems that are outside the control of the program, such as running out of memory or a system crash. Errors are represented by the Error class and its subclasses. Some common examples of errors in Java include:

// OutOfMemoryError: Thrown when the Java Virtual Machine (JVM) runs out of memory.
// StackOverflowError: Thrown when the call stack overflows due to too many method invocations.
// NoClassDefFoundError: Thrown when a required class cannot be found.
// Since errors are generally caused by problems that cannot be recovered.


// Exceptions, on the other hand, are used to handle errors that can be recovered from within the program. Exceptions are represented by the Exception class and its subclasses. Some common examples of exceptions in Java include:

// NullPointerException: Thrown when a null reference is accessed.
// IllegalArgumentException: Thrown when an illegal argument is passed to a method.
// IOException: Thrown when an I/O operation fails.
// Since exceptions can be caught and handled within a program, it’s common to include code to catch and handle exceptions in Java programs.


// In Java, Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. 

// In Java, there are two types of exceptions:

// Checked exceptions
// Unchecked exceptions


// Checked Exceptions in Java
// These are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword.


// Unchecked Exceptions in Java
// These are the exceptions that are not checked at compile time. In C++, all exceptions are unchecked, so it is not forced by the compiler’s to either handle or specify the exception. It is up to the programmers to be civilized and specify or catch the exceptions. In Java, exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked. 

public class exceptionHandling {
    public static void main(String[] args) {
        int a=4;
        int b=0;

        try {
            String name="Raj";

            // myy own exception handling
            if(name.equals("Raj")){
                throw new myException("Name is Raj");
            }
            System.out.println(divide(a, b));
            
        } catch (myException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            // no matter what happens it will always execute
            System.out.println("Finally Block");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero"); // explicitly thrown error
        }
        return a/b;
    }
}
