package com.rohith.classes.Generics;

import java.util.Arrays;

public class CustomGenArrraylist<T> {
    private Object [] data;
    private int size;
    private static int DEFAULT_SIZE = 10;

    public CustomGenArrraylist(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size==data.length;
    }

    public void resize(){
        Object [] temp  = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i]; // Casting is not recomended because object adding new ones
        }
        data = temp;
    }
    public T get (int index){
        return (T) data[index]; // smaller type more restrictive type add a bigger type so this way we need to caste it
    }
    public void set(int  index , T value){
        data[index] = value;
    }
    public T remove(int index){
        if(index>=size || index<0){
            throw new IndexOutOfBoundsException();
        }
        T removed = (T) data[index];
        for (int  i = index; i < size-1; i++) {
            data[i] = data[i+1]; // Bigfer = smallertype Casting is not requied
        }
        size--;
        return removed;

    }

    @Override
    public String toString(){
        Object[] temp = Arrays.copyOf(data, size);
        return "Custom ArrayList: " +
                Arrays.toString(temp) +
                " Size: " + size;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    static void main() {
//        CustomGenArrraylist list = new CustomGenArrraylist();
//        list.add(532);
//        list.add(534);
//        list.add(536);
//        list.add(537);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println("Here Removing the 0 index position " + list.remove(0));
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.isEmpty());
//        System.out.println(list.getSize());
//        list.set(1,5);
//        System.out.println(list);

//        WildChar<String> list = new WildChar<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        System.out.println(list);
        WildChar<Integer> list2 = new WildChar<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2);
    }
}
