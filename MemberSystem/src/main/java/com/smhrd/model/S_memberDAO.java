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

	// 연결하는 기능, 종료하는 기능 두 가지는 무조 건 잇어야 함.

	// DB연결 기능
	public void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// 실습 중에는 안 바뀌겠지만, 프로젝트 진행하면 localhost:1521 과 id ,pw가 바뀔 것

			conn = DriverManager.getConnection(url, user, password); // add catch : sql 관련 오류 캐치문 추가

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// DB연결 종료
	public void close() {
		try {
			if (rs != null) {rs.close();}
			if (psmt != null) {psmt.close();}
			if (conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원가입 기능
	public void memberJoin(S_memberDTO member) {  // DTO 클래스를 하나의 객체로 받으면 편함. 하나씩 받아도 되지만 이렇게도 가능...
		
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
