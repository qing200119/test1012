package list;
/**Comparable比较接口，必须重写 CompareTo方法*/
public class point implements Comparable<point> {
    private int x;
    private int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
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
/**返回值不关心具体值，只关心取值范围*/
    @Override
    public int compareTo(point o) {
     int len = this.x*this.x +this.y*this.y;
     int lens = o.x*o.x+o.y*o.y;

        return len-lens;
    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
