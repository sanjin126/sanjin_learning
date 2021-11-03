package com.shangguigu.day25;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        File f1 = new File("1.txt");
        if (!f1.exists()){
            f1.createNewFile();
            System.out.println("success");
        }
        FileWriter bf1 = new FileWriter(f1,true);
        bf1.write('1');
        bf1.flush();

        BufferedReader bf2 = new BufferedReader(new FileReader(f1));
        char[] str = new char[5];
        int length;
        while ((length = bf2.read(str)) != -1){
            for (int i = 0; i < length; i++){
                System.out.print(str[i]);
            }
        }
        bf1.close();
        bf2.close();
    }
}

class FileCopy{
    public static void copyFile(String srcfile, String destfile) throws FileNotFoundException {
        File f1 = new File(srcfile);
        File f2 = new File(destfile);

        new BufferedReader(new FileReader(f1));


    }
}