package day08;

public class Doctor extends Person {
    String  level;

    Doctor(String name, int age, String address ,String level) {
        super(name, age, address);
        this.level = level;
    }

    @Override
    void SayHi() {
        System.out.println("我是"+name+"今年"+age+"家住"+address + "职称"+ level);
    }
}
