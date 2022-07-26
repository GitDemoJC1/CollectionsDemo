package com.jc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jc.model.LuckyDrawModel;
import com.jc.service.LuckyDrawService;

public class LuckyDrawRegisterController extends HttpServlet {

	private LuckyDrawService luckyDrawService;

	public LuckyDrawRegisterController() {
		luckyDrawService = new LuckyDrawService();
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/HTML");
		String personFName = request.getParameter("LPFName");
		String personLName=request.getParameter("LPLName");
		String personMail=request.getParameter("LPEmail");
		String personPlace=request.getParameter("LPPlace");
		String gender=request.getParameter("LPgender");
		LuckyDrawModel lmodel=new LuckyDrawModel(personFName, personLName, personMail, personPlace, gender);
		int lukyDrawRegistartionId = luckyDrawService.lukyDrawRegistartion(lmodel);
		if (lukyDrawRegistartionId==0) {
			pw.print("<h1>Registration is Failed</h1>");
		}else {
			pw.print("<h1 style='color:green; backgroundcolor:silver;'>Registartion is Success with ID is::"+lukyDrawRegistartionId+"</h1>");
		}
	}

}
