package day08;

public class Student extends Person{

    String stuId;

    Student(String name,int age,String address,String stuId){
    super(name, age, address);
        this.stuId =stuId;
    }

   @Override

    void SayHi(){
        System.out.println("我是"+name+"今年"+age+"家住"+address + "学号"+stuId);
    }
}

