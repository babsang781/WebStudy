package com.message.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 변수, 생성자,getter/setter , toString() 정의

// @Data : getter/setter 자동생성
// @NoArgsConstructor: 기본생성자 생성
// @AllArgsConstructor: 모든 필드변수를 초기화하는 생성자 생성


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
