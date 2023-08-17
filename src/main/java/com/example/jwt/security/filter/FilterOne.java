package com.example.jwt.security.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterOne implements Filter {


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("=================filter one 실행됨");
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse) response;

        // 토큰검사
        String token = req.getHeader("Authorization");

        if (token != null && token.equals("token")){ // 테스트 용도의 토큰

            chain.doFilter(request,response); // 다음필터로의 연결

        } else { // 토큰이 없는 경우
            res.setCharacterEncoding("utf-8");
            res.setContentType("text/plain");
            res.sendError(403, "토큰없음");
        }


       //  chain.doFilter(request,response); // 다음필터로의 연결


    }




}
