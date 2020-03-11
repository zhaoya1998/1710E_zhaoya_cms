package com.zhaoya.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class DBUtil {
	private static final String URL="jdbc\\\\:mysql\\\\:///1710e";
    private static final String NAME="root";
    private static final String PASSWORD="root";

    public static void main(String[] args) throws Exception{
        
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得数据库的连接
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = (Statement) conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from cms_article");//选择import java.sql.ResultSet;
        while(rs.next()){//如果对象中有数据，就会循环打印出来
            System.out.println("1111111111111111111");
        }
    }
}