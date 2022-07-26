package com.jc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jc.model.LuckyDrawModel;
import com.jc.service.LuckyDrawService;

public class LuckyDrawGetAllRecordsController extends HttpServlet {
	 private LuckyDrawService luckyDrawService;
	
    public LuckyDrawGetAllRecordsController() {
    	luckyDrawService=new LuckyDrawService();
    }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/HTML");
		List<LuckyDrawModel> fetchAllRecords = luckyDrawService.fetchAllRecords();
	
		if (fetchAllRecords.size()>0) {
			pw.print("<table border='2' width='500px'>");
			pw.print("<tr style='color:red;'><th>ID</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Place</th><th>Gender</th></tr>");
			for (LuckyDrawModel luckyDrawModel : fetchAllRecords) {
				System.out.println(luckyDrawModel);
				pw.print("<tr><td>" + luckyDrawModel.getId() + "</td><td>" + luckyDrawModel.getFristName() + "</td><td>" + luckyDrawModel.getLastName()
				+ "</td><td>" + luckyDrawModel.getEmailAddress() + "</td><td>" + luckyDrawModel.getPlace() + "</td><td>" + luckyDrawModel.getGender()
				+ "</td><td><a href='/CRUDOperationsUsingServletAndJDBC/deleteRecord?id="+luckyDrawModel.getId()+"'>Delete</a></td><td><a href='/CRUDOperationsUsingServletAndJDBC/editRecord?id="+luckyDrawModel.getId()+"'>Edit</a></td></tr>");
			}
			pw.print("<a href='index.html'><h1>BAck to Home</h1></a>");
			pw.print("</table>");
			pw.close();
		}

	}

}
