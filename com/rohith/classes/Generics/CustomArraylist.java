package com.rohith.classes.Generics;

import java.util.Arrays;

public class CustomArraylist {
    private int [] data;
    private int size;
    private static int DEFAULT_SIZE = 10;

    public CustomArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size==data.length;
    }

    public void resize(){
        int temp [] = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int get (int index){
        return data[index];
    }
    public void set(int index , int value){
        data[index] = value;
    }
    public int remove(int index){
        if(index>=size || index<0){
            throw new IndexOutOfBoundsException();
        }
        int removed = data[index];
        for (int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return removed;

    }

    @Override
    public String toString(){
        int[] temp = Arrays.copyOf(data, size);
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
        WildChar list = new WildChar();
        list.add(532);
        list.add(534);
        list.add(536);
        list.add(537);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("Here Removing the 0 index position " + list.remove(0));
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        list.set(1,5);
        System.out.println(list);

    }
}
