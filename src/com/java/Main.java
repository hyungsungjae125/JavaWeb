package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet {
	Mybatis my;
	public Main() {
		my = new Mybatis();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		my.Print(response);
		/*
		 * //데이터와 문서타입을 UTF-8로 일치시켜야 한글이 나온다.
		* response.setCharacterEncoding("UTF-8");//데이터타입의 인코딩을 UTF-8로
		* response.setContentType("text.html;charset=UTF-8");//문서타입의 인코딩을 UTF-8로
		* PrintWriter pw = response.getWriter();
		pw.write(result);
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		my.Print(response);
		
	}

}
