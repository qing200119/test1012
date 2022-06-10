package IOstudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* 对象输出流，高级流，提供功能：读写java中任何对象
*java。IO.ObjectOutputStream
* 他可以将对象转换成字节然后通过其连接流将字节输出
*通过对象流些对象两个步骤
* 1对象流先将给定对象转换为一组字节，这组字节包含对象的节构信息
* * 然后将这组字节通过连接其他流写出来
* 上述操作术语：对象序列化
* 经过文件流时，文件将这组字节写入文件中、
* 将数据写入磁盘长久保存，对应术语数据持久化
*
* */
public class PersonTestDemo {
    public static void main(String[] args) throws IOException {
        PersonDemo p = new PersonDemo();
        p.setName("cca");
        p.setAge(12);
        p.setGender("女");
        String[] otherInfo ={"sf","dsf","fds","dsa","asd"};
        p.setOtherInOf(otherInfo);
        System.out.println(p);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("写好了");
        oos.close();

    }
}
