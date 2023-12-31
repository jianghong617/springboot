package org.example.springboot.interceptor;

import org.apache.catalina.util.RequestUtil;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@code CustomInterceptor}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
public class CustomInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StringBuffer url = RequestUtil.getRequestURL(request);
        System.out.println("CustomInterceptor->preHandle->" + url);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        StringBuffer url = RequestUtil.getRequestURL(request);
        System.out.println("CustomInterceptor->postHandle->" + url);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        StringBuffer url = RequestUtil.getRequestURL(request);
        System.out.println("CustomInterceptor->afterCompletion->" + url);
    }
}