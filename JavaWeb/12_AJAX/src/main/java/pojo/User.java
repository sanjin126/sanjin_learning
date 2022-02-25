package pojo;

import java.util.Arrays;

/**
 * @author sanjin
 * @date 2022/2/10 下午11:22
 * @description
 */
public class User {
    String name;
    int age;
    String[] addr;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + Arrays.toString(addr) +
                '}';
    }

    public User() {
    }

    public User(String name, int age, String[] addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getAddr() {
        return addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddr(String[] addr) {
        this.addr = addr;
    }
}
