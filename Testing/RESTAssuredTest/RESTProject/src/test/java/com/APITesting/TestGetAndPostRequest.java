package com.APITesting;

import static io.restassured.RestAssured.baseURI;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;   // Make a static to RestAssured Package

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.*;

public class TestGetAndPostRequest {
	
	
	@Test
	public void testGet1() {
		
		baseURI = "http://localhost:8888";
		
		given().get("/foodMenu").then().statusCode(200).body("find { it.id == '1' }.foodItems[0].id",equalTo("1")).log().all();
		
		given().get("/foodMenu").then().statusCode(200).
		body("find { it.id == '1' }.foodItems[0].price", equalTo("₹330")).
		body("find { it.id == '1' }.foodItems[0].price", equalTo("₹330"));
	}
	
	@Test
	public void testGet2() {
		baseURI = "http://localhost:8888";
		
		given().get("/foodMenu").then().statusCode(200).
		body("[0].foodItems.fname", hasItems("Truffle Mushroom Madness","Margherita Supreme")).log().all();
	}
	
	
	@Test
	public void testGet3() {
		baseURI = "https://reqres.in/api";
		
		given().get("/users?page=2").then().statusCode(200).
		body("data.first_name", hasItems("Lindsay", "Tobias")).log().all();
	}
	
	@Test
	public void PostRequest() {
		Map<String,Object> map = new HashMap<String,Object>();
		
		JSONObject request = new JSONObject(map);
		
		request.put("name", "Ajith");
		request.put("job", "Developer");
		
		System.out.println();
		
		baseURI = "https://reqres.in/api";
		
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).post("/users").then().statusCode(201).log().all();
		
		
	}
	
	@Test
	public void PostRequest2() {
		Map<String,Object> map = new HashMap<String,Object>();
		
		JSONObject request = new JSONObject(map);
		
		request.put("name", "Ajith");
		request.put("job", "Developer");
		
		System.out.println();
		
		baseURI = "https://reqres.in/api";
		
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).post("/foodMenu").then().statusCode(201).log().all();
		
		
	}

}
