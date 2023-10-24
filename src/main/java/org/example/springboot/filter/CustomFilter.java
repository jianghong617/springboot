package org.example.springboot.filter;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * {@code CustomFilter}
 *
 * @author jianghong
 * @date 2023/09/13
 * @since 2.2.0
 */
public class CustomFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CustomFilter->doFilter->开始...");
        filterChain.doFilter(request, response);
        System.out.println("CustomFilter->doFilter->结束...");
    }
}