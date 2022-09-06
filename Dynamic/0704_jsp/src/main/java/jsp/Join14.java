package jsp;

import java.io.IOException;
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

	private Join14DAO dao;
    public Join14() {
        super();
        dao = new Join14DAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. getParameter 수행 : 클라이언트에서 온 데이터를 받는다.
		MemberDTO dto = new MemberDTO();
		dto.setMid( request.getParameter("mid") );
		dto.setMpwd( request.getParameter("mpwd") );
		dto.setTel1( request.getParameter("tel1") );
		dto.setTel2( request.getParameter("tel2") );
		dto.setTel3( request.getParameter("tel3") );
		dto.setEmail1( request.getParameter("email1") );
		dto.setEmail2( request.getParameter("email2") );
		//2. dao에 클라이언트에서 보낸 데이터를 전달 -> dao는 insert 수행
		int successCount = 0;
		try {
			successCount = dao.insertMember(dto);
		} catch( SQLException e ) {
			//3. dao의 insert 수행 중 오류 : exception 처리 + 오류 메세지 출력
			//세션에 오류 메세지를 넣은 후, 오류 페이지 호출 -> 오류 페이지에서 세션 값 출력
			e.printStackTrace();
			request.getSession().setAttribute("err_msg"
					, "DBMS 오류.<br><br>잠시 후 다시 시도해 주세요.");
			response.sendRedirect("./jsp/14RE_err_page.jsp");
			return;
		}
		if(successCount < 1) {
			//4. insert의 결과가 0일때 : 오류 메세지 출력
			request.getSession().setAttribute("err_msg"
					, "회원 가입 실패.<br><br>잠시 후 다시 시도해 주세요.");
			response.sendRedirect("./jsp/14RE_err_page.jsp");
		} else if(successCount == 1) {
			//5. insert의 결과가 1일때 : 성공 페이지 로드
			SuccessMsgDTO msgDTO = new SuccessMsgDTO();
			msgDTO.setMessage("회원 가입에 성공 하셨습니다.");
			msgDTO.setUrl("./15login.jsp");
			msgDTO.setUrlName("로그인 바로가기");
			request.getSession().setAttribute("success_msg_dto", msgDTO);
			response.sendRedirect("./jsp/success_page.jsp");
		}//else
	}//doPost

}//class