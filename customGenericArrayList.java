// GENERICS

// Generics were introduced to the Java language to provide tighter type checks at compile time and to support generic programming.

// import java.util.ArrayList;

// We cannot instantiate Generic Types with Primitive types

public class customGenericArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public customGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize(){
        Object[] temp=new Object[data.length*2];

        for(int i=0; i<data.length; i++){
            temp[i]=data[i];
        }

        data=temp;
    }

    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }

    public boolean isFull(){
        return size==data.length;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index]=value;
    }

    public static void main(String[] args) {
        // ArrayList list=new ArrayList();
        
        customGenericArrayList<Integer> cgl = new customGenericArrayList<>();
        cgl.add(5);
        cgl.add(6);
        cgl.add(7);

        for(int i=0; i<cgl.size(); i++){
            System.out.print(cgl.get(i)+" ");
        }
        System.out.println();
        
        // cgl.add("some string");
        
        for(int i=0; i<16; i++){
            cgl.add(i*2);
        }

        for(int i=0; i<cgl.size(); i++){
            System.out.print(cgl.get(i)+" ");
        }
        System.out.println();
    }
}