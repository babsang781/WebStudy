package com.smhrd.model;

public class S_memberDTO {
	private String m_id;
	private String m_pw;
	private String m_nick;
	
	public S_memberDTO() {
		// 기본 생성자, 컨트롤 스페이스 생성, 매개 변수를 받지 못하는 것 기본생성자
		// 뭔가를 써서 만들 수 있지만 그렇게 될 경우, 사용자정의 생성자라고 부르는 게 맞음
	}
	
	// 생성자 : 1. 기본 생성자, 2. 사용자정의 생성자 
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
