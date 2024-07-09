package com.APITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;   // Make a static to RestAssured Package

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class FoodMenuHomePage {

	@Test				// Execute Function 
	public void FoodMenuAPITest() {

		Response response =	get("http://localhost:8888/foodMenu");
		
		int statusCode = response.getStatusCode();

		System.out.println("Status Code : "+statusCode);
		System.out.println("Get Time : "+response.getTime());
		System.out.println("Body as String : "+response.getBody().asString());
		System.out.println("Status Line : "+response.getStatusLine());
		System.out.println("Header : "+response.getHeader("content-type"));
		
		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void FoodMenuAPITest2() {
		
		baseURI = "http://localhost:8888";
		  given().get("/foodMenu")
	        .then()
	        .statusCode(200)
	        .body("find { it.id == '1' }.foodItems[0].id", equalTo("1"))
	        .log().all();
		  
		  
		given().get("/foodMenu").then().statusCode(200).body("find { it.id == '1' }.foodItems[0].price", equalTo("₹330"));
		
	}	
}
