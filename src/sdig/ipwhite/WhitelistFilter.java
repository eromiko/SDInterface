package sdig.ipwhite;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(urlPatterns="/*", filterName="WhitelistFilter")
public class WhitelistFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化操作，可留空
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获得请求地址的ip
        String clientIpAddr = IpWhiteCheckUtil.getIpAddr(request);
        //获得白名单ip
        IpWhiteConfig ipWhiteConfig = new IpWhiteConfig("ip_white_list");
        String ipWhiteList = ipWhiteConfig.getIpWhiteList();
        // 校验IP
        if(!IpWhiteCheckUtil.isPermited(clientIpAddr, ipWhiteList)) {
            // 返回错误信息或重定向到其他页面
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("您的访问IP["+ clientIpAddr +"]不在IP白名单内，请联系管理员配置");
        }else {
            // 放行
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        // 销毁操作，可留空
    }
}
