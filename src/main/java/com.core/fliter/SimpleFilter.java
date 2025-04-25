package com.core.fliter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author huangyulu
 * @Date 2025/4/14 23:35
 * @Description
 */
public class SimpleFilter implements Filter {





    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
