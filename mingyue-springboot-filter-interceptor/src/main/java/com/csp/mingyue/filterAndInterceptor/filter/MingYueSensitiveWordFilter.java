package com.csp.mingyue.filterAndInterceptor.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;

/**
 * 敏感词过滤器
 *
 * @author Strive
 */
@Component
public class MingYueSensitiveWordFilter implements Filter {
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
      throws IOException, ServletException {
    System.out.println("Remote Host:" + request.getRemoteHost());
    System.out.println("Remote Address:" + request.getRemoteAddr());

    filterChain.doFilter(request, response);
  }
}
