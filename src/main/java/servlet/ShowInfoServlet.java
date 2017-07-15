package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.User;

public class ShowInfoServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			this.doPost(req, resp);
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/json;charset=utf-8");
			PrintWriter out = resp.getWriter() ;
			List<User> list = new ArrayList<User>() ;
			User u1 = new User(1,"张三","男") ;
			User u2 = new User(2,"李四","女") ;
			list.add(u1) ;
			list.add(u2) ;
			Gson gson = new Gson() ;
			String str = gson.toJson(list) ;
			out.print(str);
			out.flush();
			out.close();
		}
}
