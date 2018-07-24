package com.sanmu.myXiaoMi.xml;

import java.io.*;

import java.nio.charset.Charset;
import java.util.*;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.w3c.dom.*;

import javax.xml.parsers.*;
/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-07-31 19:24
 **/
public class MyXmlBeanFoctary {

    public static void main(String args[]) throws IOException {
        File file = new File("D:\\erweima\\question.txt");
        File file1 = new File("D:\\erweima\\question1.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }

        Gson gson = new GsonBuilder().create();

        JsonParser parser = new JsonParser();
        List<String> lines = Files.readLines(file, Charset.forName("gbk"));


        for(int i = 1; i < lines.size(); i++){
            String line = lines.get(i);
            String newLine = "";
           List<String> temp = Splitter.on("\t").splitToList(line);
            newLine += i + "、" + temp.get(0) + "\n";
            String options = new String(temp.get(3).getBytes("utf-8"),"utf-8").replace("”","\"").replace(": ",":").replace("，",",");
            try{
                JsonArray array = parser.parse(options).getAsJsonArray();
                for(int j = 0; j < array.size(); j++){
                    if( array.get(j).getAsJsonObject().get("answer").getAsBoolean()){
                        newLine += array.get(j).getAsJsonObject().get("index").getAsString() + ":" + array.get(j).getAsJsonObject().get("desc").getAsString() + "(正确)"+ "\t";
                    }else{
                        newLine += array.get(j).getAsJsonObject().get("index").getAsString() + ":" + array.get(j).getAsJsonObject().get("desc").getAsString() + "\t";
                    }
                }
                newLine += "\n";

                System.out.println(newLine);
            }catch (Exception e){

            }
        }

    }
}
