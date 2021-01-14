package Filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FiltroLogin implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession sesion= ((HttpServletRequest)request).getSession();
        if (sesion.getAttribute("emple")!=null) {
            chain.doFilter(request, response);
        }else {
            ((HttpServletResponse)response).sendRedirect("/PoloTicTpFinal/index.jsp");
        }
        
        
    }

    @Override
    public void destroy() {
    }
    
}
