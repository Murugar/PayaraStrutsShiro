/**
 * 
 */
package iqmsoft.struts2.shiro.example.interceptor;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;




public class ShiroUserInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#destroy()
	 */
	@Override
	public void destroy() 
	{
		//release resources here
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#init()
	 */
	@Override
	public void init() 
	{
		// create resources here
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception 
	{
		if (actionInvocation.getAction() instanceof iqmsoft.struts2.shiro.example.action.ShiroBaseAction)
		{
	        Subject shiroUser = SecurityUtils.getSubject();
	        actionInvocation.getStack().setValue("shiroUser", shiroUser);
		}
	        
		return actionInvocation.invoke();
	}

}
