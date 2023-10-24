package Cloning;

public class Human implements Cloneable {
    String name;
    int[] arr = {1,2,3,4,5};
    public Human(String name) {
        super();
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        //shallow copy;
//        return super.clone();
        //deep copy
        Human clone = (Human) super.clone();
        clone.arr = new int[this.arr.length];
        for (int i=0;i<this.arr.length;i++) {
            clone.arr[i] = this.arr[i];
        }
        return clone;
    }
}
