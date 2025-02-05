package com.APITesting;
import static io.restassured.RestAssured.*;   // Make a static to RestAssured Package

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDeleteRequest {

	@Test
	public void PutRequest() {
	
	JSONObject request = new JSONObject();
	
	baseURI = "https://reqres.in/api";
	
	request.put("name", "Ajith");
	request.put("job", "Developer");
	
	given().header("Content-Type","application/json").
	contentType(ContentType.JSON).accept(ContentType.JSON).
	body(request.toJSONString()).post("/users/2").then().statusCode(201).log().all();
			
	}
	
	
	@Test
	public void PutRequestOnFoodMenu() {
	
	JSONObject request = new JSONObject();
	
	baseURI = "http://localhost:8888";
	
	request.put("foodName", "Pizza");
	
	
	given().header("Content-Type","application/json").
	contentType(ContentType.JSON).accept(ContentType.JSON).
	body(request.toJSONString()).put("/foodMenu/1").then().statusCode(201).log().all();
			
	}
	
	
	
	
	
	
	@Test
	public void DeleteRequest() {	
		baseURI = "http://localhost:8888";
		when().delete("/foodMenu").then().statusCode(200).log().all();
	}
	
	
	@Test
	public void PatchRequest() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Ajith");
		request.put("job", "Developer");
		
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).patch("/users/2").then().statusCode(201).log().all();
		
		
	}
}
