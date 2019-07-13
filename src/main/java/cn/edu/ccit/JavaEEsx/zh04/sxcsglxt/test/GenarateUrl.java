package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.test;

import org.junit.Test;

import java.io.*;

public class GenarateUrl {
    @Test
    public void GenUrls(){
        File file=new File("D:/","urls.txt");
        OutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream(file);
            PrintWriter printWriter=new PrintWriter(outputStream);
            String urlm="https://www.baidu.com/s?wd=%E4%BA%BA%E5%8F%82&pn=";
            for(int i=0;i<96;i++){

                printWriter.println(urlm+i*10);
            }
            printWriter.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
