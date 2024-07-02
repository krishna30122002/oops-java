public class singleton {
    public static void singletonMain(String[] args) {
        // singletonClass obj = new singletonClass(); -> gives error because the constructor is private
        // System.out.println(obj.num); -> gives error because the variable is private


        // all three refernece variables are pointing to just one object because it is SINGLETON CLASS
        singletonClass obj=singletonClass.getInstance();

        singletonClass obj1=singletonClass.getInstance();

        singletonClass obj2=singletonClass.getInstance();

    }
}
