package KiteTabQA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.junit.Assert;




public class get_company_code {

	
	
	@Test
	public void TC_01() {
		
		Response response = RestAssured.get("http://qa.tab.kitecash.in/kite/v1/companies/code/kite");
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getHeader("connection"));
		
		int StatusCode = response.getStatusCode();
		Assert.assertEquals(StatusCode, 200);
		

	}
	
	
	// TC02 - Company code left as Blank
	@Test
		public void  TC_02_() {
			
			Response response = get("http://qa.tab.kitecash.in/kite/v1/companies/code/");
			
			System.out.println(response.asString());
			System.out.println(response.getBody().asString());
			System.out.println(response.getStatusCode());
			System.out.println(response.getHeader("content-type"));
			System.out.println(response.getHeader("connection"));
			
			int StatusCode = response.getStatusCode();
			Assert.assertEquals(StatusCode, 404);	
		
	}
	
	// Positive case - in the form of Gherkin syntax Given() / When() / Then ()
	@Test
	public void  TC_03_() {
		
		given()
		.get("http://qa.tab.kitecash.in/kite/v1/companies/code/kite")
		.then()
		.statusCode(200).
		  log().all();
	}
	
	@Test
		public void  TC_04_() {
			
			given().
			         header("connection" , "keep-alive").
			         header("content-type" , "application/json;charset=UTF-8").
			         get("http://qa.tab.kitecash.in/kite/v1/companies/code/IncorrectCompanyCode").
			
			then().
			statusCode(404).
			log().all();
			
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
}
