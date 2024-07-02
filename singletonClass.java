public class singletonClass {

    // in order to someone not create the object of the singletonClass we can make the constructor of that class -> private

    // private int num=0;

    private singletonClass(){

    }

    private static singletonClass instance;

    public static singletonClass getInstance(){
        // check one object only is created or not

        if(instance==null){ // runs for one time only
            instance=new singletonClass();
        }

        return instance;
    }
}
