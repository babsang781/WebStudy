package com.smhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S_memberDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// �����ϴ� ���, �����ϴ� ��� �� ������ ���� �� �վ�� ��.

	// DB���� ���
	public void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// �ǽ� �߿��� �� �ٲ������, ������Ʈ �����ϸ� localhost:1521 �� id ,pw�� �ٲ� ��

			conn = DriverManager.getConnection(url, user, password); // add catch : sql ���� ���� ĳġ�� �߰�

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// DB���� ����
	public void close() {
		try {
			if (rs != null) {rs.close();}
			if (psmt != null) {psmt.close();}
			if (conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ȸ������ ���
	public void memberJoin(S_memberDTO member) {  // DTO Ŭ������ �ϳ��� ��ü�� ������ ����. �ϳ��� �޾Ƶ� ������ �̷��Ե� ����...
		
		connect();
		
		String sql = "insert into s_member values(?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,  member.getM_id());
			psmt.setString(2,  member.getM_pw());
			psmt.setString(3,  member.getM_nick());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		close();
	}

}
