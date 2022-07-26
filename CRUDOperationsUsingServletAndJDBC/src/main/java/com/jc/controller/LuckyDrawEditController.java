
package com.jc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jc.model.LuckyDrawModel;
import com.jc.service.LuckyDrawService;

public class LuckyDrawEditController extends HttpServlet {

	private LuckyDrawService luckyDrawService;

	public LuckyDrawEditController() {
		luckyDrawService = new LuckyDrawService();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/HTML");
		Integer id=Integer.parseInt(request.getParameter("id"));
		LuckyDrawModel searchRecordById = luckyDrawService.searchRecordById(id);
		if (searchRecordById ==null) {
			pw.print("<h1>Sorry record is not found</h1>");
		}else {
			pw.print("<form action='/CRUDOperationsUsingServletAndJDBC/UpdateRecord' method='post'>");
			pw.print("id::<input type='text' name='PId' value='"+searchRecordById.getId()+"'>");
			pw.print("FirstNAME::<input type='text' name='PFName' value='"+searchRecordById.getFristName()+"'>");
			pw.print("Lastname::<input type='text' name='PLName' value='"+searchRecordById.getLastName()+"'>");
			pw.print("Email::<input type='text' name='PEamil' value='"+searchRecordById.getEmailAddress()+"'>");
			pw.print("Place::<input type='text' name='PPlace' value='"+searchRecordById.getPlace()+"'>");
			pw.print("Gender::<input type='text' name='PGender' value='"+searchRecordById.getGender()+"'>");
			pw.print("<input type='submit' name='PFName' value='Update'>");
			pw.print("</form>");
		}
	}

}
