package com.sanmu.myXiaoMi.ftp;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-11 12:07
 **/
public class FtpTest {
    public static void main(String[] args) throws  Exception{
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.181.125");
        ftpClient.login("root", "123456");
        FileInputStream inputStream = new FileInputStream(new File("D:\\SC01C25.jpg"));
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        ftpClient.changeWorkingDirectory("/images/2018");
        ftpClient.makeDirectory("images/2018");
        ftpClient.changeWorkingDirectory("/images/2018");
        ftpClient.storeFile("123.jpg", inputStream);
        inputStream.close();

        ftpClient.logout();

    }
}
