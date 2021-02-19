package com.mstf.book1.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBHelper {

    private static String Driver;
    private static String Url;
    private static String UserName;
    private static String UserPwd;

    //静态代码块加载配置文件信息
    static {
        try {
            //1.通过当前类获取类加载器
            ClassLoader classLoader = DBHelper.class.getClassLoader();
            //2.通过类加载器的方法获得一个输入流
            InputStream is = classLoader.getResourceAsStream("db.properties");
            //3.创建一个properties对象
            Properties proprs = new Properties();
            //4.加载输入流
            proprs.load(is);
            //5.获取相关参数的值
            Driver = proprs.getProperty("driver");
            Url = proprs.getProperty("url");
            UserName = proprs.getProperty("username");
            UserPwd = proprs.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取连接方法
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(Url, UserName, UserPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    //释放资源方法
    public static void release(Connection conn, PreparedStatement pstmt, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (pstmt != null){
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
