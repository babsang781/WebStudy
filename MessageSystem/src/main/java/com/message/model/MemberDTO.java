package com.message.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ����, ������,getter/setter , toString() ����

// @Data : getter/setter �ڵ�����
// @NoArgsConstructor: �⺻������ ����
// @AllArgsConstructor: ��� �ʵ庯���� �ʱ�ȭ�ϴ� ������ ����


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
	
	private String M_email;
	private String M_pw;
	private String M_tel;
	private String M_address;
	
	
	@Override
	public String toString() {
		return "MemberDTO [M_email=" + M_email + ", M_pw=" + M_pw + ", M_tel=" + M_tel + ", M_address=" + M_address
				+ "]";
	}
	
	
	
}