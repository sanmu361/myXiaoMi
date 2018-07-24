package com.sanmu.myXiaoMi.apacheHttp;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-08-08 16:01
 **/
public class HttpTest {

    private static String GET_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx07ca08c700a82393&secret=aacd3a041fc4e87fd66b048799967977";

    private static String ER_WEI_MA = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=";

    private static Gson gson = new GsonBuilder().create();

    public static void main(String arg[]) {
        String token = get(GET_TOKEN_URL);

        Map<String, Object> map = Maps.newHashMap();
        postForm(ER_WEI_MA + token, map);
    }

    public static void postForm(String url, Map<String, Object> map) {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(url);
        Map<String, Object> formparams = Maps.newHashMap();
        formparams.put("scene", "liwangyu");
        formparams.put("width", 430);
        formparams.put("auto_color", true);

        try {
            StringEntity uefEntity = new StringEntity(gson.toJson(formparams));
            uefEntity.setContentType("application/json");

            uefEntity.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "UTF-8"));
            httppost.setEntity(uefEntity);
            System.out.println("executing request " + httppost.getURI());
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    InputStream instreams = entity.getContent();
                    String uploadSysUrl = "D://erweima/";

                    File saveFile = new File(uploadSysUrl + "1.png");
                    if (!saveFile.getParentFile().exists()) {
                        saveFile.getParentFile().mkdirs();
                    }
                    saveToImgByInputStream(instreams, uploadSysUrl, "1.png");

                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int saveToImgByInputStream(InputStream instreams, String imgPath, String imgName) {
        int stateInt = 1;

        if (instreams != null) {
            try {
                File file = new File(imgPath + imgName);
                FileOutputStream fos = new FileOutputStream(file);
                byte[] b = new byte[1024];
                int nRead = 0;
                while ((nRead = instreams.read(b)) != -1) {
                    fos.write(b, 0, nRead);
                }
                fos.flush();
                fos.close();
            } catch (Exception e) {
                stateInt = 0;
                e.printStackTrace();
            } finally {
                try {
                    instreams.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stateInt;
    }

    public static String get(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String result = null;
        try {
            HttpGet httpget = new HttpGet(url);
            System.out.println("executing request " + httpget.getURI());
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                HttpEntity entity = response.getEntity();
                System.out.println("--------------------------------------");
                System.out.println(response.getStatusLine());
                if (entity != null) {
                    System.out.println("Response content length: " + entity.getContentLength());

                    result = EntityUtils.toString(entity);
                    System.out.println(result);
                }
                Map<String, Object> map = gson.fromJson(result, new TypeToken<Map<String, Object>>() {
                }.getType());

                System.out.println("------------------------------------");

                result = String.valueOf(map.get("access_token"));
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}

