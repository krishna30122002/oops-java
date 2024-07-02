//In generic code, the question mark (?), called the wildcard, represents an unknown type. The wildcard can be used in a variety of situations: as the type of a parameter, field, or local variable; sometimes as a return type (though it is better programming practice to be more specific).


// Here T should either be Number or its subclasses

import java.util.List;

public class wildCards<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public wildCards(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        // here you can only pass number types
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
        
        wildCards<Number> w = new wildCards<>();
        w.add(5);
        w.add(6);
        w.add(7);

        for(int i=0; i<w.size(); i++){
            System.out.print(w.get(i)+" ");
        }
        System.out.println();
        
        // w.add("some string");
        
        for(int i=0; i<16; i++){
            w.add(i*2);
        }

        for(int i=0; i<w.size(); i++){
            System.out.print(w.get(i)+" ");
        }
        System.out.println();
    }
}