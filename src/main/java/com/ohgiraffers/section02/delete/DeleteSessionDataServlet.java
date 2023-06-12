package com.ohgiraffers.section02.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        Enumeration<String> sessionNames = session.getAttributeNames();
        
        while (sessionNames.hasMoreElements()) {
            System.out.println("sessionNames.nextElement() = " + sessionNames.nextElement());
        }
        
        /* 필기.
        *   세션의 데이터를 지우는 방법
        *   1. 세션에 만료시간 설정
        *   2. removeAttribute() 메소드를 이용해 session 의 Attribute 값을 제거
        *   3. invaildate() 를 호출하면 세션이 만료된다.
        *   세션의 데이터를 지우는 것은 로그아웃을 의미하기도 한다.
        *  */
        
//        session.setMaxInactiveInterval(600);
        // 이 작업을 시작하면 firstName 의 값을 없앤다.
        session.removeAttribute("firstName");
        session.removeAttribute("lastName");


        Enumeration<String> remain = session.getAttributeNames();
        while (remain.hasMoreElements()) {
            System.out.println("remain.nextElement() = " + remain.nextElement());
        }
        

        session.invalidate();
        System.out.println("session.id() = " + session.getId());

    }
}
