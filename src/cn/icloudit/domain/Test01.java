package cn.icloudit.domain;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("计算机名:" + address.getHostName());
            System.out.println("IP地址:" + address.getHostAddress());
            byte[] bytes = address.getAddress();
            System.out.println("字节形式的数据IP:" + Arrays.toString(bytes));
            System.out.println(address);

            System.out.println("----------------------");
            InetAddress address1 = InetAddress.getByName("DESKTOP-1UDUMT0");
            System.out.println("计算机名:" + address1.getHostName());
            System.out.println("IP地址:" + address1.getHostAddress());

            System.out.println("----------------------");
            InetAddress address2 = InetAddress.getByName("192.168.0.121");
            System.out.println("计算机名:" + address2.getHostName());
            System.out.println("IP地址:" + address2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
