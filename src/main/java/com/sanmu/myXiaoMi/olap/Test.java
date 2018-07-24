package com.sanmu.myXiaoMi.olap;

import org.apache.hadoop.security.UserGroupInformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-09-12 14:21
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            UserGroupInformation ugi = UserGroupInformation.getLoginUser();
            ugi.checkTGTAndReloginFromKeytab();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Class.forName("org.apache.hive.jdbc.HiveDriver");

        String url = "jdbc:hive2://c3-kudu-tst-st01.bj:16000/default;principal=sql_prc/hadoop@XIAOMI.HADOOP";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "h_zhangzhen", "");
        } catch (Exception e) {
            e.printStackTrace();
        }


        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("show databases");
            long rsCount = 0;
            while (rs.next()) {
                rsCount ++;
            }
            System.out.println("result count: " + rsCount);
            System.out.println("result: " + rs.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            conn.close();
        }

    }
}
