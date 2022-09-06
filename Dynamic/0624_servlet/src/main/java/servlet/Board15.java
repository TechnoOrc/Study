package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Board15")
public class Board15 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	FreeBoardDAO dao;
    public Board15() {
        super();
        dao = new FreeBoardDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		if(cmd.equals("list")) {
			ArrayList<FreeBoardDTO> list = dao.selectList();

			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<table border=1><tbody>");
			for(int i = 0; i < list.size(); i++) {
				out.print("<tr>");
				FreeBoardDTO tmpDTO = list.get(i);
				out.print("<td>" + tmpDTO.getBno() + "</td>");
				out.print("<td>" + tmpDTO.getBtitle() + "</td>");
				out.print("<td>" + tmpDTO.getBwriter() + "</td>");
				out.print("<td>" + tmpDTO.getBdate() + "</td>");
				out.print("</tr>");
			}//for
			out.print("</tbody></table>");
			out.close();
		} else if(cmd.equals("detail")) {
			
		}//if
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String cmd = request.getParameter("cmd");
		if(cmd.equals("reg")) {

			FreeBoardDTO dto = new FreeBoardDTO();
			dto.setBtitle( request.getParameter("title") );
			dto.setBwriter( request.getParameter("writer") );
			dto.setBcnts( request.getParameter("cnts") );

			int successCount = dao.insertFreeBoard(dto);

			response.setCharacterEncoding("euc-kr");
			PrintWriter out = response.getWriter();
			//successCount = 0;//에러 테스트용.
			if(successCount > 0) {
				//out.print("<h1>글쓰기 성공</h1>");
				response.sendRedirect("./Board15?cmd=list");
			} else {
				//out.print("<h1>글쓰기 실패 - 서버 로그를 확인해 주세요</h1>");
				response.sendRedirect("./Redirect16ErrorPage");
			}
			out.close();
		}//자유 게시판 등록.
	}//doPost

}//class 
