package file;

import java.io.File;
import java.io.FileFilter;

/***
 * listFiles提供了一个重载方法，可以指定一个文件过滤器（
 * （FileFilter),然后满足改过滤器的子项返回
 *
 *
 * */
public class listFilesDemo {


    public static void main(String[] args) {
        /*
         * 获取一点开头的子项
         * */
        File dir = new File(".");
        File[] subs = dir.listFiles(new FileFilter() {
                                        @Override
                                        public boolean accept(File file) {
                                            String name = file.getName();
                                            System.out.println("正在过滤" + name);
                                            return name.startsWith(".");//判断字符串以什么开始

                                        }
                                    }
        );

        System.out.println(subs.length);
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
        }

    }


}

