package Rest_Api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class FirstAPIDemo {

	ValidatableResponse val;
	@Test
	void firstDemoForAPI() 
	{
		
		Response responce= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(responce.getStatusCode());
		
		
	
		
		
	}
}