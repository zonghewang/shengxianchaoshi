package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

public class GenarateGeoData {
    @Test
    public void GenP() {
        String jsondata = "";
        try {
            URL url = new URL("https://geo.datav.aliyun.com/areas/bound/220000_full.json");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            int resCode = httpURLConnection.getResponseCode();
            if (resCode == HttpURLConnection.HTTP_OK) {
                InputStream in = httpURLConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader bufr = new BufferedReader(isr);
                String str;
                while ((str = bufr.readLine()) != null) {
                    jsondata += str;
                }
                bufr.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
       // System.out.println(jsondata);
        JSONObject jsonObject= JSON.parseObject(jsondata);
        JSONArray features=jsonObject.getJSONArray("features");

        for(Iterator iterator = features.iterator(); iterator.hasNext();){
            JSONObject job = (JSONObject) iterator.next();
            JSONObject properties=job.getJSONObject("properties");
            String adcode=properties.getString("adcode");
            String name=properties.getString("name");
            String center=properties.getString("center");
            // '海门': [121.15, 31.89],
            System.out.println("'"+name+"':" +center+",");
        }

        System.out.println();

        for(Iterator iterator = features.iterator(); iterator.hasNext();){
            JSONObject job = (JSONObject) iterator.next();
            JSONObject properties=job.getJSONObject("properties");
            String adcode=properties.getString("adcode");
            // '海门': [121.15, 31.89],
            //System.out.println(adcode);

            jsondata = "";
            try {
                URL url = new URL("https://geo.datav.aliyun.com/areas/bound/"+adcode+"_full.json");
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                int resCode = httpURLConnection.getResponseCode();
                if (resCode == HttpURLConnection.HTTP_OK) {
                    InputStream in = httpURLConnection.getInputStream();
                    InputStreamReader isr = new InputStreamReader(in);
                    BufferedReader bufr = new BufferedReader(isr);
                    String str;
                    while ((str = bufr.readLine()) != null) {
                        jsondata += str;
                    }
                    bufr.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

           // System.out.println(jsondata);
            JSONObject jsonObject2= JSON.parseObject(jsondata);
            JSONArray features2=jsonObject2.getJSONArray("features");

            for(Iterator iterator2 = features2.iterator(); iterator2.hasNext();){
                JSONObject job2 = (JSONObject) iterator2.next();
                JSONObject properties2=job2.getJSONObject("properties");
                String adcode2=properties2.getString("adcode");
                String name2=properties2.getString("name");
                String center2=properties2.getString("center");
                // '海门': [121.15, 31.89],
                System.out.println("'"+name2+"':" +center2+",");
            }
        }



        //JSONObject features=jsonObject.getJSONObject("features");




    }

    @Test
    public void GenC() {

    }
}
