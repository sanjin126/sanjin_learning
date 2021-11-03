package com.shangguigu.day25;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClassTest {
    public static void main(String[] args) throws IOException {
//    三中构造方法
        File f1 = new File("/home/sanjin/code/sanjin_learning/JavaTest");
        System.out.println(f1);
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());
        System.out.println(f1.length());
        System.out.println();
        for (String i : f1.list()){
            System.out.println(i);
        }

        for (File i : f1.listFiles()){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(new Date(f1.lastModified()));

        System.out.println("--------------------");

        File f2 = new File(f1.getAbsolutePath(),"1.txt");
        System.out.println(f2);
        System.out.println(f2.exists());
        System.out.println(f2.getAbsoluteFile());
        System.out.println(f2.getName());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getParent());
        System.out.println(f2.length());
        System.out.println(new Date(f2.lastModified()));

        File f3 = new File("/home/sanjin/code/sanjin_learning/JavaTest/src/com/shangguigu/day25/1.txt");
        System.out.println(new File(f3.getParent()).exists());
        boolean flag = f2.renameTo(f3);
        System.out.println(flag);
        System.out.println("------------------");
        System.out.println(f3.canRead());
        System.out.println(f3.isHidden());
        System.out.println(f3.canWrite());

        f3.delete();

        f1.createNewFile();
        RuntimeException exception = new RuntimeException("错误");
        throw exception;

    }
}
