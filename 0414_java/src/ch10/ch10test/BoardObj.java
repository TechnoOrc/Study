package ch10.ch10test;

import java.util.ArrayList;

public class BoardObj {// Getters Setters

	private String title; //ArrayList<BoardObj> 입력데이터 정의용
	private String writer; //ArrayList<BoardObj> 입력데이터 정의용
	private String cnts; //ArrayList<BoardObj> 입력데이터 정의용
	
	BoardObj(){}
	BoardObj(String s1, String s2, String s3){
		this.title = s1;
		this.writer = s2;
		this.cnts = s3;
	}//BoardObj
	@Override
		public String toString() {
			return "제목 : " + title
					+ ", 작성자 : " + writer
					+ ", 내용 : " + cnts;
		}//toString
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCnts() {
		return cnts;
	}
	public void setCnts(String cnts) {
		this.cnts = cnts;
	}
	
}//class
