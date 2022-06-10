package day08;

public class Teacher extends Person {
    double salary;

    Teacher(String name, int age, String address ,double salary) {
        super(name, age, address);
        this.salary = salary;

    }

    void SayHi(){
        System.out.println("我是"+name+"今年"+age+"家住"+address + "工资"+ salary);
    }
}

