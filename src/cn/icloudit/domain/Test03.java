package cn.icloudit.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test03 {

    public static void main(String[] args) {
        //创建一个URL实例
        try {
            URL url=new URL("http://www.baidu.com");
            //通过url的openstream方法来获取url对象所表示资源的字节输入流
            InputStream is=url.openStream();
            //之后把它转化成字符输入流
            InputStreamReader isr=new InputStreamReader(is);
            //为字符输入流添加缓冲
            BufferedReader br=new BufferedReader(isr);
            String data=br.readLine();
            while(data!=null){
                System.out.println(data);
                data=br.readLine();
            }
            br.close();
            isr.close();
            is.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
