package com.smhrd.model;

public class S_memberDTO {
	private String m_id;
	private String m_pw;
	private String m_nick;
	
	public S_memberDTO() {
		// �⺻ ������, ��Ʈ�� �����̽� ����, �Ű� ������ ���� ���ϴ� �� �⺻������
		// ������ �Ἥ ���� �� ������ �׷��� �� ���, ��������� �����ڶ�� �θ��� �� ����
	}
	
	// ������ : 1. �⺻ ������, 2. ��������� ������ 
	public S_memberDTO(String m_id, String m_pw, String m_nick) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_nick = m_nick;
	}
	// getter/setter
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_nick() {
		return m_nick;
	}
	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}
	
	//tostring
	@Override
	public String toString() {
		return "s_memberDTO [m_id=" + m_id + ", m_pw=" + m_pw + ", m_nick=" + m_nick + "]";
	}
	
	
	
}
