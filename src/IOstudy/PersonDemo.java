package IOstudy;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 */
/*
* 对象流
*Exception in thread "main" java.io.NotSerializableException: IOstudy.PersonDemo
* 实例类添加 implements Serializable 序列化接口
*transient 瘦身，忽略一些没有必要存的数据，减少开销
*
*
*
* *当前类中所引用的类的属性，对应的类也必须实现接口，
*
* */
public class PersonDemo implements Serializable {
    private static final long serialVersionUID =1L;//版本号，代码发生改变，依然能够运行,如果不定义的话，以前的对象的序列化一定失败
    private String  name;
    private int age;
    private String  gender;
    private transient String[] otherInOf;

    public PersonDemo(String name, int age, String gender, String[] otherInOf) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInOf = otherInOf;
    }

    public PersonDemo() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String[] getOtherInOf() {
        return otherInOf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOtherInOf(String[] otherInOf) {
        this.otherInOf = otherInOf;
    }

public String toString(){

        return name+","+age+","+gender+","+
                Arrays.toString(otherInOf);

}


}
