package com.APITesting;
import static io.restassured.RestAssured.*;   // Make a static to RestAssured Package

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class JSONSchemValidator {

	
	public void testGet1() {
		
		baseURI = "";
		
		given().get("").
		then().
		assertThat().body(matchesJsonSchemaInClasspath("schema.json")).statusCode(200);
	}
	
	
}
