package com.sp.jsp2;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test.do")
public class TestServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fnm = req.getParameter("fname");

		
		if (fnm == null || fnm.trim().length() == 0) {
			fnm = "Guest";
		}
		Date dt = new Date();
		req.setAttribute("NM", fnm);
		req.setAttribute("DT", dt);
		req.getRequestDispatcher("show.jsp").forward(req, res);;
		
		
	}

}
