package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	//To create a servlet, you must extend either GenericServlet/HttpServlet
	//In order for your code to compile, must override either one of the Http Do methods/service method
	private static final long serialVersionUID = 1L;
	
	//PrintWriter = object that writes out the response in the response body
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<h1>Hello from your doGet method!</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<h1>Hello from your doPost method!</h1>");
	}
}
