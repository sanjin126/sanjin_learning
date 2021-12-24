package com.shangguigu.netprograme;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetClassTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        System.out.println(inet);
        InetAddress inet2 = InetAddress.getByName("www.baidu.com");
        System.out.println(inet2);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //
        System.out.println(inet2.getHostName());
        //
        System.out.println(inet2.getHostAddress());
    }
}
