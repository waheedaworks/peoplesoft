package com.waheedaworks.peoplesoft.web.controllers;

import com.waheedaworks.peoplesoft.web.services.AuthenticatorService;

public class LoginController {

	AuthenticatorService authenticatorService;

	//requestMapping .loginController
	public void validateUser(String userName,String password)
	{
		if(authenticatorService.validateUserCredentials(userName, password))
		{
			//gotoHome page
		}
		else{
		//goto Login page with invlid credentials error message	
		}
	}

}
