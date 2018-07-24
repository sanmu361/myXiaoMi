package com.sanmu.myXiaoMi.ftp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.httpclient.util.DateUtil;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-11 14:48
 **/
public class FtpUploadUtil {
//    private static ThreadLocal<FTPClient> threadLocal = new ThreadLocal<>();
//    private static ThreadLocal<String> threadLocalHost = new ThreadLocal<>();
//    public static void init(String host,int port,String username,String password) throws SocketException, IOException {
//        FTPClient client = threadLocal.get();
//        if(client==null) {
//            client = new FTPClient();
//            //1.连接
//            client.connect(host,port);
//            //2.登录
//            client.login(username,password);
//            threadLocal.set(client);
//            threadLocalHost.set(host);
//        }
//    }
//    public static String upload(InputStream local,String fileName,String path) throws SocketException, IOException {
//        String datePath = DateUtil.date2Str(new Date(),"/yyyy/MM/dd/");
//        //路径添加日期
//        path+=datePath;
//        FTPClient client = threadLocal.get();
//        String host = threadLocalHost.get();
//        //3.指定文件上传路径(路径不存在返回false)
//        boolean exists = client.changeWorkingDirectory(path);
//        if(!exists) {
//            String pathArray[] = path.split("/");
//            String temp = "/";
//            for(String p:pathArray) {
//                temp+=(p+"/");
//                //4.如果文件路径不存在，则创建(一次只能创建一级目录)
//                client.makeDirectory(temp);
//            }
//            //重新指定文件上传路径
//            client.changeWorkingDirectory(path);
//        }
//        //5.指定文件类型
//        client.setFileType(FTP.BINARY_FILE_TYPE);
//        //获取后缀
//        String suffix = fileName.substring(fileName.lastIndexOf("."));
//        String uuid = UUID.randomUUID().toString();
//        //6.执行上传
//        client.storeFile(uuid+suffix, local);
//        //7.退出
//        client.logout();
//        //8.断开连接
//        client.disconnect();
//        threadLocalHost.remove();
//        threadLocal.remove();
//        return "http://"+host+"/jonychen"+datePath+uuid+suffix;
//    }
//    public static void main(String[] args) throws SocketException, IOException {
//        InputStream local = new FileInputStream("D:\\Documents\\Pictures\\01.png");
//        init("192.168.178.161", 21, "ftpuser", "111111");
////　　　　　//上传路径
//        String res = upload(local, "code.png","/home/ftpuser/ego");
//        System.out.println(res);
//    }
}
