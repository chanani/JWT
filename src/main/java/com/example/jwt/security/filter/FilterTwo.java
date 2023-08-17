package com.example.jwt.security.filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterTwo implements Filter {


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("=================filter Two 실행됨");

        // 토큰의 유효성 검사, 로그인 시도

        chain.doFilter(request,response);
    }
}
