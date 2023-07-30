package com.login.EndPoint;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import com.login.facade.LoginFacade;
import com.login.vo.LoginVO;


public class LoginEndpointImpl implements LoginEndpoint {
	private LoginFacade loginFacade;
	


	@Override
	public Response getAccessToken( HttpServletRequest request) {
		try{
			
				return Response.ok().entity(loginFacade.recordLoginSucess()).build();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			return Response.serverError().entity("").build();
		}
	}
	
	@Override
	public Response getUserData( HttpServletRequest request) {
		try{
			 LoginVO vo= new LoginVO();
			 vo.setName("Sandeep "+vo.getRegID());
				return Response.ok().entity(vo).build();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			return Response.serverError().entity("").build();
		}
	}



	public LoginFacade getLoginFacade() {
		return loginFacade;
	}



	public void setLoginFacade(LoginFacade loginFacade) {
		this.loginFacade = loginFacade;
	}

	
	

}
