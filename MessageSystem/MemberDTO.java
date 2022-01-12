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
	
	private String email;
	private String pw;
	private String tel;
	private String address;
	
	@Override
	public String toString() {
		return "MemberDTO [email=" + email + ", pw=" + pw + ", tel=" + tel + ", address=" + address + "]";
	}
	
	
	
}
