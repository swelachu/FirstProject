package org.sample;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {
	public static void main(String[] args) {
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.queryParam("page", "2");
//		Response request = requestSpecification.request(Method.GET,"api/users");
//		int statusCode = request.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = request.getBody().asPrettyString();
//		System.out.println(asPrettyString);

//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification given = RestAssured.given();
//		given.pathParam("id", "2");
//		Response request = given.request(Method.GET,"api/users/{id}");
//		int statusCode = request.getStatusCode();	
//		System.out.println(statusCode);
//		String asPrettyString3 = request.getBody().asPrettyString();	
//		System.out.println(asPrettyString3);

//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification given1 = RestAssured.given();
//		JSONObject jsonObject=new JSONObject();
//		jsonObject.put("name", "Swetha");
//		jsonObject.put("job","testing");
//		given1.body(jsonObject.toJSONString());
//		Response request1 = given1.request(Method.POST,"api/users");
//		int statusCode1 = request1.getStatusCode();	
//		System.out.println(statusCode1);
//		String asPrettyString2 = request1.getBody().asPrettyString();
//		System.out.println(asPrettyString2);
		
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name","swetha");
		jsonObject.put("job", "QA");
		rs.body(jsonObject.toJSONString());
		rs.pathParam("id","2" );
		Response request = rs.request(Method.PUT,"api/uers/{id}");
		System.out.println(request.getStatusCode());
		System.out.println(request.getBody().asPrettyString());
	}

}

