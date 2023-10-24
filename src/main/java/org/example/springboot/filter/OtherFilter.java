package org.example.springboot.filter;

import org.springframework.core.Ordered;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * {@code OtherFilter}
 *
 * @author jianghong
 * @date 2023/10/24
 * @since 2.3.0
 */
public class OtherFilter extends OncePerRequestFilter implements Ordered {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("OtherFilter->doFilterInternal->开始...");
        filterChain.doFilter(request, response);
        System.out.println("OtherFilter->doFilterInternal->结束...");
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE + 1;
    }
}