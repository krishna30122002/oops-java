// GENERICS

// import java.util.ArrayList;

public class customArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public customArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize(){
        int[] temp=new int[data.length*2];

        for(int i=0; i<data.length; i++){
            temp[i]=data[i];
        }

        data=temp;
    }

    private int remove(){
        int removed=data[--size];
        return removed;
    }

    private boolean isFull(){
        return size==data.length;
    }

    private int get(int index){
        return data[index];
    }

    private int size(){
        return size;
    }

    private void set(int index, int value){
        data[index]=value;
    }

    public static void main(String[] args) {
        // ArrayList list=new ArrayList();
        customArrayList cl=new customArrayList();
        cl.add(5);
        cl.add(6);
        cl.add(7);
        System.out.println(cl.size());
        for(int i=0; i<cl.size(); i++){
            System.out.println(cl.get(i));
        }
        for(int i=0; i<18; i++){
            cl.add(i*2);
        }
        for(int i=0; i<cl.size(); i++){
            System.out.println(cl.get(i));
        }
    }
}