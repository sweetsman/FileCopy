import java.io.*;
//将同一目录下的test.txt文本文件的内容复制到c\目录下的target.txt文件中
public class BufferedIOStream {
    public static void main(String[] args) {
        String src = "test.txt";
        String target = "C:\\target.txt";
        long start = System.currentTimeMillis();
        copyFile(src,target);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static  void copyFile(String src, String target){
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target))
        ){
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            bos.flush();

        }catch (IOException e){
            e.getStackTrace();
        }
    }
}

