package com.waheedaworks.peoplesoft.web.services;

public class AuthenticatorService {

	public boolean validateUserCredentials(String userName, String password) {

		if ("rehan".equals(userName)) {
			// log.info("entered username is valid");
			if ("rehan123".equals(password)) {
				System.out.println("login successful display home page if it is a web applicaiton");
				return true;
			} else {
				System.out.println("Invalid user name/password");
			}
		} else {
			System.out.println("Invalid user name/password");
		}

		return false;
	}

}
