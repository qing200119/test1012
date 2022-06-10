package exception;
/**
 *throws 方法调用前先说明可能会报错
 * 通常一个方法中使用throw抛出异常时，就要在方法声明时使用throws声明该异常，通知调用者解决异常
 * 只有抛出RuntimeException及其子类型时可以不用这样做
 *尽量不在main方法中throws
 *
 * 1 thorws重写规则
 * 2自定义异常 throwsDemo2
 *  */
public class throwsDemo {
    public static void main(String[] args) {
     Person p = new Person();
        try {
            p.setAge(10000);
            System.out.println(p.getAge());
        } catch (throwsDemo2 e) {
            e.printStackTrace();
        }

        System.out.println("over");

    }
}
 class  Person{
    private static int age;

    public Person(int age) {
        this.age = age;
    }

     public Person() {
     }

     public int getAge() {
        return age;
    }

    public void setAge(int age) throws throwsDemo2 {
        if(age<0||age>100){
            throw  new throwsDemo2("年龄不合法");
        }

        this.age = age;
    }
}