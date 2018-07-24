package com.sanmu.myXiaoMi;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-01-02 10:19
 **/
public class Md5Token {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Long time = System.currentTimeMillis() / 1000;

        String secret = "a219beff5c4baa56";

        String token = String.format("%s_%s", time, secret);

        String md = Hashing.md5().newHasher().putString(token, Charsets.UTF_8).hash().toString();

        System.out.println(md);

        String url = "http://api.d.mi.com/goodsCfgDetail/goods_list?time=%s&token=%s";

        String getUrl = String.format(url, time, md);
        System.out.println(time);


        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            // 创建httpget.
            HttpGet httpget = new HttpGet(getUrl);
            System.out.println("executing request " + httpget.getURI());
            // 执行get请求.
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                // 获取响应实体
                HttpEntity entity = response.getEntity();
                System.out.println("--------------------------------------");
                // 打印响应状态
                System.out.println(response.getStatusLine());
                if (entity != null) {
                    // 打印响应内容长度
                    System.out.println("Response content length: " + entity.getContentLength());
                    // 打印响应内容
                    //System.out.println("Response content: " + EntityUtils.toString(entity));

                    String json = EntityUtils.toString(entity);

                    Gson gson = new Gson();


                    Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>() {
                    }.getType());

                    List<LinkedTreeMap<String, Object>> dataList = (List<LinkedTreeMap<String, Object>>) map.get("data");


//                    for (Map<String, Object> temp : dataList) {
//                        System.out.println(temp.get("goods_id").getClass());
//                        if (temp.get("goods_id").equals("18074")) {
//
//                            System.out.println(String.valueOf(temp.get("goods_id")));
//                            System.out.println(Long.valueOf(String.valueOf(temp.get("goods_id"))));
//                            System.out.println(Long.valueOf(String.valueOf(temp.get("cat_id"))));
//                            System.out.println(String.valueOf(String.valueOf(temp.get("cat_name"))));
//                            System.out.println(Long.valueOf(String.valueOf(temp.get("type1_id"))));
//                            System.out.println(String.valueOf(temp.get("type1_name")));
//                            System.out.println(Long.valueOf(String.valueOf(temp.get("type2_id"))));
//                            System.out.println(String.valueOf(temp.get("type2_name")));
//                            System.out.println(Long.valueOf(String.valueOf(temp.get("type3_id"))));
//                            System.out.println(String.valueOf(temp.get("type3_name")));
//                            System.out.println(Long.valueOf(String.valueOf(temp.get("type4_id"))));
//                            System.out.println(String.valueOf(temp.get("type4_name")));
//                            System.out.println(Long.valueOf(String.valueOf(temp.get("type5_id"))));
//                            System.out.println(String.valueOf(temp.get("type5_name")));
//                        }
//
//                    }


                    try {
                        File newFile = new File("D:\\文档\\josn1.txt");
                        Files.write(json.getBytes(Charsets.UTF_8), newFile);
                    } catch (IOException fileIoEx) {
                        System.out.println("ERROR trying to write to file '" + "' - "
                                + fileIoEx.toString());
                    }
                }

                System.out.println(System.currentTimeMillis() - startTime);
                System.out.println("------------------------------------");
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

//
//    }

