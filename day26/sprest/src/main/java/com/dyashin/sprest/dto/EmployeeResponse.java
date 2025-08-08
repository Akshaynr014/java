package com.dyashin.sprest.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Employee-response")
public class EmployeeResponse {

	@JsonProperty("statusCode")
	private int statusCode;
	@JsonProperty("message")
	private String message;
	@JsonProperty("description")
	private String description;
	
	List<Employee> beans;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employee> getBeans() {
		return beans;
	}

	public void setBeans(List<Employee> beans) {
		this.beans = beans;
	}
	
}
