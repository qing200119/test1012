package collection;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class location<E>{
private  E x;
private E y;
    public location(E x, E y) {
        this.x = x;
        this.y = y;
    }
    public E getX() {
        return x;
    }
    public void setX(E x) {
        this.x = x;
    }
    public E getY() {
        return y;
    }
    public void setY(E y) {
        this.y = y;
    }
    public static void main(String[] args) {
        location<Integer> s = new location(1,2);
        System.out.println(s);

    }


}
