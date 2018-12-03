package com.learning.api_playground.client.impl;

import com.learning.api_playground.client.Users;
import com.learning.api_playground.model.Data;
import com.learning.api_playground.model.Record;
import com.learning.api_playground.model.Records;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UsersImpl implements Users {

	private final String baseUrl = "https://reqres.in";

	@Override
	public Records getRecords() {

		RestAssured.baseURI = baseUrl;

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/api/users");

		Records records = response.as(Records.class);

		return records;

	}

	@Override
	public Record getRecord() {
		RestAssured.baseURI = baseUrl;

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/api/users/2");

		Record record = response.as(Record.class);

		return record;
	}

}
