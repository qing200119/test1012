package file;

import java.io.File;

/***
 *
 *
 *
 * */
public class createNewFileDemo {
   /*递归删除目录*/
    public static void delete(File f){
     if(f.isDirectory()){
         File[] sus =f.listFiles();
         for(int i=0;i<sus.length;i++){
             File su =sus[i];
             delete(su);
         }
     }
     f.delete();

    }

    public static void main(String[] args) throws java.io.IOException{

        /*实现删除给定的文件或目录*/
        /*File dir = new File("./a");
        delete(dir);
*/





        /*获取当前目录的所有子项*/
       /* File dir = new File(".");
        if(dir.isDirectory()){
            File[] trs =dir.listFiles();
            for(int i=0;i<trs.length;i++){
                File tr =trs[i];
                System.out.println(tr.getName());
            }
        }else {
            System.out.println("不是目录");
        }
*/






        /*删除目录，如果目录里面不为空，要用deletes()*/
       /* File dir = new File("./demo");
        if(dir.exists()){
            dir.delete();
            System.out.println("目录删除");
        }else {
            System.out.println("目录不存在");
        }*/

         /*创建多级目录*/
     /*File dirs = new File("./a/b/c");
     if(!dirs.exists()){
         dirs.mkdirs();
         System.out.println("目录创建完毕");
     }else {
         System.out.println("目录已经存在");
     }*/



        /*创建一个目录*/
       /* File dir = new File("./demo");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("文件已创建");
        }else {
            System.out.println("文件已存在");
        }

*/


        /* 当前目录创建文件：demo.txt*/
       /* File file = new File("./demo.txt");
        if(!file.exists()){
            System.out.println("文件不存在");
            file.createNewFile();
        }
        else {
            System.out.println("文件已存在");
        }*/
        /*删除一个文件*/
       /* File file = new File("./demo.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }
        else {
            System.out.println("文件不存在");

        }*/





    }
}
