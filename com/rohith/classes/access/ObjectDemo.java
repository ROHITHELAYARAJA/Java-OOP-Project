package com.rohith.classes.access;

public class ObjectDemo extends Object{
    int num;
    float gpa;
    String name;
    public ObjectDemo(int num,float gpa){
        this.num = num;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "876t2h";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object removed");
    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object o){
        return this.num == ((ObjectDemo) o).num;
    }


    static void main() {
        ObjectDemo o1 = new ObjectDemo(1,2.5f);
        ObjectDemo o2 = new ObjectDemo(1,2.5f);
        ObjectDemo o3 = o2;

        System.out.println(o1.hashCode()); // it is a random integer value that is hashCode for each object
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());

        if(o1.equals(o2)){
            System.out.println("Yeah it is equal");
        }
        System.out.println(o1 instanceof Object); // Here each and every class is an instance of the Object class
        // so it always return True
        System.out.println(o1.getClass().getPackage()); //  The getClass() it is always is stored in the HEAP MEMORY
    }
}
