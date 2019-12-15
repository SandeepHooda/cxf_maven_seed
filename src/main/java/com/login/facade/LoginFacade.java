package com.login.facade;



import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import com.login.vo.LoginVO;

public class LoginFacade {
	private static final Logger log = Logger.getLogger(LoginFacade.class.getName());
	

	public LoginVO recordLoginSucess() {
		return new LoginVO();
		
	}
	

}
