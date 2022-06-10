package IOstudy;

import day08.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流
 *
 *
 *
 * */
public class oisDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new
                FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        PersonDemo p = (PersonDemo)ois.readObject();
        System.out.println(p);


        ois.close();



    }
}
