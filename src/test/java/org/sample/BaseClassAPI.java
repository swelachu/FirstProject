package org.sample;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassAPI {
	public static RequestSpecification res;
	static Response response;
	public static void requestObject(String baseUri) {
		RestAssured.baseURI=baseUri;
		 res = RestAssured.given();
		
		
	}
public static void AttachQueryParam(String parameterName, String parameterValue) {
	res.queryParam(parameterName, parameterValue);
	
	
}
public static void AttachPathParam(String parameterName, String parameterValue) {
	res.pathParam(parameterName, parameterValue);

}
public static void attachPayLoad(JSONObject jsonObject) {
	res.body(jsonObject.toJSONString());
	
}
public static Response ResponseObject(String requestType,String endPoint) {
	switch(requestType) {
	case "GET":{
		return res.request(Method.GET,endPoint);
	}
	case "POST":{
		return res.request(Method.POST,endPoint);
	}
	case "PUT":{
		return res.request(Method.PUT,endPoint);
	}
	default:{
		return res.request(Method.DELETE,endPoint);
	}
		
	} 
	}
public static void getStatusCode(Response response) {
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	
}
public static void getResponseBody(Response response) {
	String asPrettyString = response.getBody().asPrettyString();
	System.out.println(asPrettyString);
}

}