package jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join14")
public class Join14 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Join14() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. getParameter 수행 : 클라이언트에서 온 데이터를 만든다.
		MemberDTO dto = new MemberDTO();
		//dto.setMdate( request.getParameter("mid") );
		dto.setMid( request.getParameter("mid") );
		dto.setMpwd( request.getParameter("mpwd") );
		dto.setTel1( request.getParameter("tel1") );
		dto.setTel2( request.getParameter("tel2") );
		dto.setTel3( request.getParameter("tel3") );
		dto.setEmail1( request.getParameter("email1") );
		dto.setEmail2( request.getParameter("email2") );
		//2. dao에 클라이언트에서 보낸 데이터를 전달 -> dao는 insert 수행
		Join14DAO dao = new Join14DAO();
		int successCount = 0;
		try {
			successCount = dao.insertMember(dto);
		} catch (SQLException e) {
			request.getSession().setAttribute("err_msg", "DBMS 오류 - 잠시 후 다시 시도해 주세요.");
			response.sendRedirect("./jsp/14RE_err_page.jsp");
			e.printStackTrace();
		}
		//3. dao의 insert 수행 중 오류 : exception 처리(RE10.java 참고) + 오류 메시지 출력
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();//답장쓰기
		if(successCount == 0 ) {//4. insert의 결과가 0일때 : 오류 메시지 출력(0624프로젝트 Join13 참고)
			out.print("<h1>회원 가입 실퍠</h1>");
		} else  {//5. insert의 결과가 1일때 : 성공 페이지 로드(0624프로젝트 Join13 참고)
			out.print("<h1>회원 가입 성공</h1>");
		}
		out.close();
		
	}//doPost

}//class
