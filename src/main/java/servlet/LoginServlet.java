package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name") ;
		String password = req.getParameter("password") ;
		if("admin".equals(name)&&"123456".equals(password)) {
			System.out.println("��½�ɹ�");
			req.setAttribute("msg", "����");
			req.getRequestDispatcher("NewFile.jsp").forward(req, resp);
		}else {
			System.out.println("��½ʧ��");
			System.out.println(req.getContextPath());
			System.out.println(req.getServletPath());
			resp.sendRedirect(req.getContextPath()+"/error.jsp");
		}
	}
}
