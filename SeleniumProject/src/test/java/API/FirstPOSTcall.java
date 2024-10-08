package API;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class FirstPOSTcall {
	
	public static void main (String []args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given()
		.log().all().queryParam("key", "qaclick123")
		.header("Content-type","application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -34.383494,\r\n"
				+ "    \"lng\": 37.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Rahul house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"28, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe plaza\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}")
		.when().log().all()
		.post("maps/api/place/add/json")
		.then().log().all()
		.assertThat().statusCode(201);
		
		
	}

}
