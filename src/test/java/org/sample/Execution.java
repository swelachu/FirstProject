package org.sample;

import org.json.simple.JSONObject;

import io.restassured.response.Response;

public class Execution extends BaseClassAPI {
	public static void main(String[] args) {
//		requestObject("https://reqres.in/");
//		AttachQueryParam("page", "2");
//		Response responseObject = ResponseObject("GET", "api/uesrs");
//		getStatusCode(responseObject);
//		getResponseBody(responseObject);
		
		
		
//	requestObject("https://reqres.in/");
//	AttachPathParam("id", "2");
//	Response responseObject = ResponseObject("GET", "api/uesrs/{id}");
//	getStatusCode(responseObject);
//	getResponseBody(responseObject);
	
//		requestObject("https://reqres.in/");
//		JSONObject jsonObject =new JSONObject();
//		jsonObject.put("name","swetha");
//		jsonObject.put("job","QA");		
//		attachPayLoad(jsonObject);
//		Response responseObject = ResponseObject("POST", "api/uesrs/");
//		getStatusCode(responseObject);
//		getResponseBody(responseObject);
	
		requestObject("https://reqres.in/");
		JSONObject jsonObject =new JSONObject();
		jsonObject.put("name","swetha");
		jsonObject.put("job","QA");		
		attachPayLoad(jsonObject);
		AttachPathParam("id", "2");
		Response responseObject = ResponseObject("PUT", "api/uesrs/{id}");
		getStatusCode(responseObject);
		getResponseBody(responseObject);
	
	
	}

}
