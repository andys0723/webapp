package com.mywebapp.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.getWriter().print("Hello from HelloServlet2");

        httpServletResponse.sendRedirect("http://www.posttestserver.com/data/2016/12/08/zzzfromnathanDR/");

    }


    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException, ServletException {
            this.doPost(httpServletRequest, httpServletResponse);
    }

}