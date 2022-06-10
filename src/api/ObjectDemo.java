package api;
/*
* toString()
* *获得一个对象的字符串
* *如果想要返回自定义格式，可以重写
* equals(object obj)
* *当前对象和参数对象obj比较
* *比较内存地址this==obj
* *如果比较对象的属性，可以重写
*
*
*
* */

import java.util.Objects;

public class ObjectDemo {


    public static void main(String[] args) {
        Point a = new Point(3,4);
        Point b = new Point(3,4);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a==b);//双等号比较内存地址
        System.out.println(a.equals(b));
        /*比较地址，不一样*/
    }

}

class Point{
 private int x;
 private int y;

    public Point(int x, int y) {
        super();//调用object的无参构造方法
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null) return false;
        if(o==this) return true;
        if(!(o instanceof Point)) return false;//判断类型 instanceof
//        Point o =(Point)o;强转回Point类型
        return this.x==((Point) o).x
                && this.y==((Point) o).y;

    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}








