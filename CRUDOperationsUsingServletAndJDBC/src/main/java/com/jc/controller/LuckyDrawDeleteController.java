package com.jc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jc.service.LuckyDrawService;

//@WebServlet("/LuckyDrawDeleteController")
public class LuckyDrawDeleteController extends HttpServlet {
	private LuckyDrawService luckyDrawService;

	public LuckyDrawDeleteController() {
		luckyDrawService = new LuckyDrawService();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id=Integer.parseInt(request.getParameter("id"));
		int deleteRecordById = luckyDrawService.deleteRecordById(id);
		if (deleteRecordById>0) {
			response.sendRedirect("/CRUDOperationsUsingServletAndJDBC/getAllRegisterRecords");
		}
	
	}

}
