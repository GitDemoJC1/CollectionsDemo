package com.jc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jc.model.LuckyDrawModel;
import com.jc.service.LuckyDrawService;

public class LuckyDrawSerachController extends HttpServlet {

	private LuckyDrawService luckyDrawService;

	public LuckyDrawSerachController() {
		luckyDrawService = new LuckyDrawService();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/HTML");
		Integer id = Integer.parseInt(request.getParameter("serachId"));

		LuckyDrawModel smr = luckyDrawService.searchRecordById(id);
		if (smr.getId() == 0) {
			pw.print("<h1 style='color:red;'>SORRY No record is found</h1>");
		} else {
			pw.print("<table border='2' width='500px'>");
			pw.print(
					"<tr style='color:red;'><th>ID</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Place</th><th>Gender</th></tr>");
			pw.print("<tr><td>" + smr.getId() + "</td><td>" + smr.getFristName() + "</td><td>" + smr.getLastName()
					+ "</td><td>" + smr.getEmailAddress() + "</td><td>" + smr.getPlace() + "</td><td>" + smr.getGender()
					+ "</td></tr>");
			pw.print("<a href='index.html'><h1>BAck to Home</h1></a>");
			pw.print("</table>");
		}

	}
}
