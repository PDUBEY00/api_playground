package com.learning.api_playground.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.learning.api_playground.client.impl.UsersImpl;
import com.learning.api_playground.model.Data;
import com.learning.api_playground.model.Records;
import com.learning.api_playground.service.UserDetails;

public class UserDetailsImpl implements UserDetails {

	UsersImpl userClient = new UsersImpl();

	@Override
	public List<String> getUserName() {

		Records records = userClient.getRecords();
		List<Data> userData = records.getUsers();
		List<String> userName = new ArrayList<>();
		for (int i = 0; i < userData.size(); i++) {
			userName.add(userData.get(i).getFirstName());
		}
		
		return userName;
	}

	@Override
	public String getIndividualRecord() {
		
		return userClient.getRecord().getData().getFirstName();
	}


	}


