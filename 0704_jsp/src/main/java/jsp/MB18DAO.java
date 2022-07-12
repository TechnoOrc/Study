package jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MB18DAO {
	
	Context initContext;
	Context envContext;
	DataSource ds;
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	public MB18DAO () {
		try {
			initContext = new InitialContext();// 웹 서버가 뜰때 실행되는 자바 실행환경
			envContext = (Context) initContext.lookup("java:/comp/env");//lookup() 톰캣 실행환경의 변수들을 찾는 함수
			ds = (DataSource) envContext.lookup("jdbc/myoracle");//톰캣 소스를 자바소스로 변경
			
			
		} catch ( NamingException e ) {
			e.printStackTrace();
		}
	}//constructor

	public ArrayList<BoardDTO> list() throws SQLException {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();

		con = ds.getConnection();

		String sql = "select mb.bno, mb.btitle, mb.mno, m.mid, mb.bcnts, mb.bdate"
				+ " from memberboard mb, member m"
				+ " where mb.mno = m.mno order by mb.bno";
		psmt = con.prepareStatement(sql);
		rs = psmt.executeQuery();

		while(rs.next()) {
			BoardDTO dto = new BoardDTO();
			dto.setBno( rs.getString("bno") );
			dto.setBtitle( rs.getString("btitle") );
			dto.setMno( rs.getString("mno") );
			dto.setMid( rs.getString("mid") );
			dto.setBcnts( rs.getString("bcnts") );
			dto.setBdate( rs.getString("bdate") );
			list.add(dto);
		}//while

		rs.close();
		psmt.close();
		con.close();

		return list;
	}//list
	
	public int write(String title, String cnts, String id) throws SQLException {
		int successCount = 0;
		con = ds.getConnection();
		String sql = "insert into memberboard (bno, btitle, mno, bcnts, bdate)"
				+ " values (mno_seq.nextval, ?"
				+ ", (select mno from member where mid = ?), ?, sysdate)";
		psmt = con.prepareStatement(sql);
		psmt.setString(1, title);
		psmt.setString(2, id);
		psmt.setString(3, cnts);
		successCount = psmt.executeUpdate();
		psmt.close();
		con.close();
		
		return successCount;
	}//write

	public BoardDTO detail(String bno) throws SQLException {
		BoardDTO dto = new BoardDTO();
		con = ds.getConnection();
		String sql = "select mb.bno, mb.btitle, mb.mno, m.mid, mb.bcnts, mb.bdate"
				+ " from memberboard mb, member m"
				+ " where mb.bno = ? and mb.mno = m.mno";
		psmt = con.prepareStatement(sql);
		psmt.setString(1, bno);
		rs = psmt.executeQuery();
		rs.next();//결과값의 다음줄(속성 다음 줄) 데이터..
		dto.setBno( rs.getString("bno") );
		dto.setBtitle( rs.getString("btitle") );
		dto.setMno( rs.getString("mno") );
		dto.setMid( rs.getString("mid") );
		dto.setBcnts( rs.getString("bcnts") );
		dto.setBdate( rs.getString("bdate") );
		rs.close();
		psmt.close();
		con.close();
		
		return dto;
		
	}//detail

	public int delete(String bno, String id) throws SQLException {
		int successCount = 0;
		con = ds.getConnection();
		String sql = "delete from memberboard where bno = ?"
				+ " and mno = (select mno from member where mid = ?)";
		psmt = con.prepareStatement(sql);
		psmt.setString( 1, bno );
		psmt.setString( 2, id );
		
		successCount = psmt.executeUpdate();
		psmt.close();
		con.close();
			
		return successCount;
	}//delete		

	public int update(String bno, String title, String cnts, String id) throws SQLException {
		int successCount = 0;
		con = ds.getConnection();
		
		String sql = "update memberboard set btitle = ?, bcnts = ? where bno = ?"
				+ " and mno = (select mno from member where mid = ?)";
		//and mno = (select mno from member where mid = ?) 글을 잘성한 작성자에게만 updqte 권한을 주기위헤 서브쿼리적용.
		psmt = con.prepareStatement(sql);
		psmt.setString(1, title);
		psmt.setString(2, cnts);
		psmt.setString(3, bno);
		psmt.setString(4, id);
		
		successCount = psmt.executeUpdate();
		
		psmt.close();
		con.close();
		
		return successCount;
		
	}
	
	

}//class

/*
drop table member;
PURGE RECYCLEBIN;
create table member(
mno number(5,0) primary key
, mid varchar2(20) unique
, mpwd varchar2(20)
, tel1 varchar2(3)
, tel2 varchar2(4)
, tel3 varchar2(4)
, email1 varchar2(20)
, email2 varchar2(20)
, mdate date
);

drop sequence mno_seq;
create sequence mno_seq
start with 1
increment by 1
maxvalue 99999
nocycle;

create table memberboard(
bno number(5,0) primary key
, btitle varchar2(150)
, mno number(5,0)
, bcnts varchar2(1500)
, bdate date
);

drop table freeboard;
PURGE RECYCLEBIN;
create table freeboard(
bno number(5,0) primary key
, btitle varchar2(150)
, bwriter varchar2(60)
, bcnts varchar2(1500)
, bdate date
);
*/