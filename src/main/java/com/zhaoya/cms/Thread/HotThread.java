package com.zhaoya.cms.Thread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class HotThread {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc\\:mysql\\:///1710e";
	private static final String username = "root";
	private static final String password = "root";

	  // 连接对象
    private static Connection conn;
    // 传递sql语句
    private static Statement stt;
    // 结果集
    private static ResultSet set;

	// 连接数据库
	public static Connection getConn() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			 if (con == null)
	                return con;
	            // 定义sql语句
	            String Sql = "select * from cms_article";
	            
	            stt = (Statement) conn.createStatement();
	            // 返回结果集
	            set = stt.executeQuery(Sql);
	            // 获取数据
	            while (set.next()) {

	                System.out.println("///////");

	            }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	// 关闭数据库
	public void closeConn(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
