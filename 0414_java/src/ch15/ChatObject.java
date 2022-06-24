package ch15;

import java.io.Serializable;

public class ChatObject implements Serializable{

	private String name;
	private String chat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChat() {
		return chat;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}
	

}//class
