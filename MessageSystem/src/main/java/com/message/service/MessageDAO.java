package com.message.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.message.model.MessageDTO;

public class MessageDAO {

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

	
	public int sendMessage(MessageDTO message) {
		
		connect();
		
		sql = "insert into web_message values (num_seq.nextval,? , ?, ?,sysdate)";
		
		try {
			psmt = conn.prepareStatement(sql);
	
			psmt.setString(1, message.getM_sendName());
			psmt.setString(2, message.getM_recieveEmail());
			psmt.setString(3, message.getM_content());
		
			cnt = psmt.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}

	
	public ArrayList<MessageDTO> messageSelect(String email) {
		ArrayList<MessageDTO> list = new ArrayList<MessageDTO>();
		connect();

		sql = "select m_num, m_sendName, m_content, m_sendDate from web_message where m_recieveEmail = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);

			rs = psmt.executeQuery();
			
			while (rs.next()) {
				MessageDTO msg = new MessageDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
						email, rs.getString(4));  	// ������ ��Ƽ� list.add(message) ���·� �ϴ� ���

				// �ٷ� list.add �ϴ� ���
				list.add(msg);

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return list;

	}
}
