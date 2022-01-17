package com.message.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.message.model.MemberDTO;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	String sql;
	int cnt;

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
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ȸ������ ���
	public int memberJoin(MemberDTO member) { // DTO Ŭ������ �ϳ��� ��ü�� ������ ����. �ϳ��� �޾Ƶ� ������ �̷��Ե� ����...

		connect();

		sql = "insert into web_member values(?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getM_email());
			psmt.setString(2, member.getM_pw());
			psmt.setString(3, member.getM_tel());
			psmt.setString(4, member.getM_address());

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}

	public MemberDTO memberLogin(String M_email, String M_pw) { // DTO Ŭ������ �ϳ��� ��ü�� ������ ����. �ϳ��� �޾Ƶ� ������ �̷��Ե� ����...
		MemberDTO member = null;
		connect();
		sql = "select M_tel, M_address from web_member where M_email = ? and M_pw = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, M_email);
			psmt.setString(2, M_pw);

			rs = psmt.executeQuery();
			if (rs.next()) {
				member = new MemberDTO(M_email, null, rs.getString("M_tel"), rs.getString("M_address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return member;
	}

	public int update(MemberDTO member) { // DTO Ŭ������ �ϳ��� ��ü�� ������ ����. �ϳ��� �޾Ƶ� ������ �̷��Ե� ����...

		connect();

		sql = "update web_member set M_pw=?, M_tel=?, M_address=? where M_email=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(4, member.getM_email());
			psmt.setString(1, member.getM_pw());
			psmt.setString(2, member.getM_tel());
			psmt.setString(3, member.getM_address());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

}