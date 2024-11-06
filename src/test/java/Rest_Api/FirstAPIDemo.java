package Rest_Api;

import org.testng.Assert;
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
		System.out.println(responce.getTime());	
		System.out.println(responce.getBody().asString());
		System.out.println(responce.getHeader("content-type"));
		System.out.println(responce.getStatusLine());
		int statuscode=responce.getStatusCode();
		//Assert.assertEquals(statuscode, 200);
		
		Assert.assertEquals(statuscode, 200);
		
		
	}
}
