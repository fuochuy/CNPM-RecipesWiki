/*
package cnpm.recipe.filter;

import java.io.IOException;
import java.net.URLPermission;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebFilter(urlPatterns = {
	"/*"
})
public class AuthFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		String accountId = (String) session.getAttribute("AccountId");
		
		if(accountId != null) {
			chain.doFilter(req, resp);
		}
		else {
			if(req.getServletPath().equals("/sign-in") || req.getServletPath().equals("/sign-up")) {
				chain.doFilter(request, response);
			}
			else {
				resp.sendRedirect(req.getContextPath()+"/sign-in");
			}
		}
		

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
*/
