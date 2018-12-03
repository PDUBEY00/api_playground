package com.learning.api_playground;

import com.learning.api_playground.service.UserDetails;
import com.learning.api_playground.service.impl.UserDetailsImpl;

public class Application {

	public static void main(String[] args) {
		
		UserDetails userDetails = new UserDetailsImpl();
		System.out.println(userDetails.getUserName());
		System.out.println("First name of user is "+userDetails.getIndividualRecord());
		

	}

}
