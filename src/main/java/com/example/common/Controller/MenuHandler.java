package com.example.common.Controller;

import com.example.common.Mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuHandler implements HandlerInterceptor {
    @Autowired
    private ProductMapper productMapper;

    //메뉴핸들러
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        String uri = request.getRequestURI();
        request.setAttribute("uri", uri);

    }
}
