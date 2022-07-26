package com.jc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jc.model.LuckyDrawModel;
import com.jc.service.LuckyDrawService;

public class UpdateRecordController extends HttpServlet {
	private LuckyDrawService luckyDrawService;

	public UpdateRecordController() {
		luckyDrawService = new LuckyDrawService();
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/HTML");
		String personFName = request.getParameter("PFName");
		String personLName = request.getParameter("PLName");
		String personMail = request.getParameter("PEamil");
		String personPlace = request.getParameter("PPlace");
		String gender = request.getParameter("PGender");
		LuckyDrawModel lmodel = new LuckyDrawModel(personFName, personLName, personMail, personPlace, gender);
		lmodel.setId(Integer.parseInt(request.getParameter("PId")));
		int lukyDrawRegistartionId = luckyDrawService.updateRecord(lmodel);
		if (lukyDrawRegistartionId == 0) {
			pw.print("<h1>Registration is Failed</h1>");
		} else {
			pw.print("<h1 style='color:green; backgroundcolor:silver;'>Update below given Id::"
					+ request.getParameter("PId")+ "</h1>");
		}

	}
}
