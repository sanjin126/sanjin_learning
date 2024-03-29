package sanjin.domain;

/**
 * @author sanjin
 * @date 2022/2/13 下午5:16
 * @description
 */

public class User {
    private String name;
    private String addr;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
