package com.ohgiraffers.section01.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        System.out.println("redirectSession id : " + session.getId());

        System.out.println("redirect 시작됨...");

        String firstName = (String)session.getAttribute("firstName");
        String lastName = (String)session.getAttribute("lastName");

        String firstName1 = String.valueOf(session.getAttribute("firstName"));
        String lastName1 = String.valueOf(session.getAttribute("lastName"));

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        System.out.println("firstName1 = " + firstName1);
        System.out.println("lastName1 = " + lastName1);
    }
}
