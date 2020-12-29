import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//将同一目录下的test.txt文本文件的内容复制到c\目录下的target.txt文件中
public class FileIOStream {
    public static void main(String[] args) {
        try{
            File src = new File("test.txt");
            File target = new File("C:\\target.txt");
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(target);

            byte[] buf = new byte[1024];
            while(fis.read(buf) != -1){
                fos.write(buf);
            }
            fis.close();
            fos.close();
            System.out.println("successful");
        }catch (Exception e){
            System.out.println("failed");
        }
    }
}
