package com.message.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
	
	private int m_num;
	private String m_sendName;
	private String m_recieveEmail;
	private String m_content;
	private String m_sendDate;
	
	@Override
	public String toString() {
		return "MessageDTO [m_num=" + m_num + ", m_sendName=" + m_sendName + ", m_recieveEmail=" + m_recieveEmail
				+ ", m_content=" + m_content + ", m_sendDate=" + m_sendDate + "]";
	}
	
	
	
}
