package KiteTabQA;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Add_Employee {

	
	
	private static final Object firstName = null;
	private static final Object lastName = null;

	// TC1 - POSITIVE CASE OF ADD EMPLOYEE
	@Test
	public void TC_01 ( ){
	
	JSONObject request = new JSONObject();
	 
	   request.put ("firstName","Mukesh");
	  request.put ("lastName","GoelA");
	  request.put ("gender","UNSET");
	request.put ("email","mukeshgoela@yopmail.com");
	request.put ("mobile","+919994945549");
	request.put ("roleId","dfbf9bc7-fbd0-42e4-a19e-4748c78dd138");
  
	 System.out.println(request);
     System.out.println(request.toJSONString());
     
     given().
     header("Content-Type" , "application/json").
     header("Enterprise" , "kec").
     header("Authorization" , "bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJPa3VMamdrY3RpSEVSOFZVNTNhcEtHSEtFQm1ValpPY1hOS2lwSFhKVEtzIn0.eyJqdGkiOiI1NWUxMDE4ZS00NTQ2LTRlZDAtYjNmMS1jNDI3NDI5ODVmOTUiLCJleHAiOjE2MjIwMjMyMTcsIm5iZiI6MCwiaWF0IjoxNjIxOTM2ODE3LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwMjUvYXV0aC9yZWFsbXMva2VjIiwiYXVkIjoia2l0ZS10YWItYXBpIiwic3ViIjoiZDkyMWE4MTktZWIzYi00MDE2LTkwNjgtZWVkMThkZDJkZDZkIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoia2l0ZS10YWItYXBpIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiN2MxOTA2ZTgtNzVlYi00Nzg3LWJjMDEtNWI5YzE2MjM1NGUyIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vbG9jYWxob3N0Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImtpdGUtdGFiLWFwaSI6eyJyb2xlcyI6WyJTVVBFUi1BRE1JTiIsIlNUQU5EQVJEIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJuYW1lIjoiU0EgU0EiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJrZWNAeW9wbWFpbC5jb20iLCJnaXZlbl9uYW1lIjoiU0EiLCJmYW1pbHlfbmFtZSI6IlNBIiwiZW1haWwiOiJrZWNAeW9wbWFpbC5jb20ifQ.S4w5R2g2L_0WxN_PoI9uAM6L2kfu-D_IQU2qE5dPAMKzEYl7f9-3C1b5SwHRtodJ2lE9cli8aKRVF_t9qgdEJGjgXmtxGorsPwEIJfG1d-5rmy9T09lcL5wJwHNkayWSya4jaaN8jcGL9CNK2Vqza1DolcrfapWptUhfpmPwG6lqW4SCpMyGirA0htXbxGqXxkwTgKn54Ja0axqH-MPpiehaCKC9dSnqHAnbaKtzW8EBAtfmp2xPmzubdCXG8iU04ApX3Me5cfI3D5YOaDA-h0Z7J7cZOG6xKQaKDPTVKjVfdLxWik0GagxkxJ61JgHnteZWkAtg0rnmrWzCi-1LjA").
     
     
     
      body(request.toJSONString()).
      
     when().
     post(" http://qa.tab.kitecash.in/kite/v1/web/employees").
     
     then().
       statusCode(201).
         log().all();
     
     
}

	// TC2 - NEGATIVE CASE (First name left as blank)
	@Test
	public void TC_02 ( ){
		
		JSONObject request = new JSONObject();
		 
		   request.put ("firstName","");
		request.put ("lastName","Goel");
		request.put ("gender","UNSET");
		request.put ("email","testmail1@yopmail.com");
		request.put ("mobile","+919994945549");
		request.put ("roleId","dfbf9bc7-fbd0-42e4-a19e-4748c78dd138");
	  
		 System.out.println(request);
	     System.out.println(request.toJSONString());
	     
	     given().
	     header("Content-Type" , "application/json").
	     header("Enterprise" , "kec").
	     header("Authorization" , "bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJPa3VMamdrY3RpSEVSOFZVNTNhcEtHSEtFQm1ValpPY1hOS2lwSFhKVEtzIn0.eyJqdGkiOiI1NWUxMDE4ZS00NTQ2LTRlZDAtYjNmMS1jNDI3NDI5ODVmOTUiLCJleHAiOjE2MjIwMjMyMTcsIm5iZiI6MCwiaWF0IjoxNjIxOTM2ODE3LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwMjUvYXV0aC9yZWFsbXMva2VjIiwiYXVkIjoia2l0ZS10YWItYXBpIiwic3ViIjoiZDkyMWE4MTktZWIzYi00MDE2LTkwNjgtZWVkMThkZDJkZDZkIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoia2l0ZS10YWItYXBpIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiN2MxOTA2ZTgtNzVlYi00Nzg3LWJjMDEtNWI5YzE2MjM1NGUyIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vbG9jYWxob3N0Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImtpdGUtdGFiLWFwaSI6eyJyb2xlcyI6WyJTVVBFUi1BRE1JTiIsIlNUQU5EQVJEIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJuYW1lIjoiU0EgU0EiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJrZWNAeW9wbWFpbC5jb20iLCJnaXZlbl9uYW1lIjoiU0EiLCJmYW1pbHlfbmFtZSI6IlNBIiwiZW1haWwiOiJrZWNAeW9wbWFpbC5jb20ifQ.S4w5R2g2L_0WxN_PoI9uAM6L2kfu-D_IQU2qE5dPAMKzEYl7f9-3C1b5SwHRtodJ2lE9cli8aKRVF_t9qgdEJGjgXmtxGorsPwEIJfG1d-5rmy9T09lcL5wJwHNkayWSya4jaaN8jcGL9CNK2Vqza1DolcrfapWptUhfpmPwG6lqW4SCpMyGirA0htXbxGqXxkwTgKn54Ja0axqH-MPpiehaCKC9dSnqHAnbaKtzW8EBAtfmp2xPmzubdCXG8iU04ApX3Me5cfI3D5YOaDA-h0Z7J7cZOG6xKQaKDPTVKjVfdLxWik0GagxkxJ61JgHnteZWkAtg0rnmrWzCi-1LjA").
	   
	      body(request.toJSONString()).
	      
	     when().
	     post(" http://qa.tab.kitecash.in/kite/v1/web/employees").
	     
	     then().
	       statusCode(400).
	       body("errors.code[0]" , equalTo(5001)).
	       body("errors.code[1]" , equalTo(firstName)).
	       log().all();
	  
	
	}
	 
	// TC3 - NEGATIVE CASE (Last name left as blank)
		@Test
		public void TC_03 ( ){
			
			JSONObject request = new JSONObject();
			 
			request.put ("firstName","Mohit");
			request.put ("lastName","");
			request.put ("gender","UNSET");
			request.put ("email","testmail2@yopmail.com");
			request.put ("mobile","+919994945550");
			request.put ("roleId","dfbf9bc7-fbd0-42e4-a19e-4748c78dd138");
		  
			 System.out.println(request);
		     System.out.println(request.toJSONString());
		     
		     given().
		     header("Content-Type" , "application/json").
		     header("Enterprise" , "kec").
		     header("Authorization" , "bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJPa3VMamdrY3RpSEVSOFZVNTNhcEtHSEtFQm1ValpPY1hOS2lwSFhKVEtzIn0.eyJqdGkiOiI1NWUxMDE4ZS00NTQ2LTRlZDAtYjNmMS1jNDI3NDI5ODVmOTUiLCJleHAiOjE2MjIwMjMyMTcsIm5iZiI6MCwiaWF0IjoxNjIxOTM2ODE3LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwMjUvYXV0aC9yZWFsbXMva2VjIiwiYXVkIjoia2l0ZS10YWItYXBpIiwic3ViIjoiZDkyMWE4MTktZWIzYi00MDE2LTkwNjgtZWVkMThkZDJkZDZkIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoia2l0ZS10YWItYXBpIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiN2MxOTA2ZTgtNzVlYi00Nzg3LWJjMDEtNWI5YzE2MjM1NGUyIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vbG9jYWxob3N0Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImtpdGUtdGFiLWFwaSI6eyJyb2xlcyI6WyJTVVBFUi1BRE1JTiIsIlNUQU5EQVJEIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJuYW1lIjoiU0EgU0EiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJrZWNAeW9wbWFpbC5jb20iLCJnaXZlbl9uYW1lIjoiU0EiLCJmYW1pbHlfbmFtZSI6IlNBIiwiZW1haWwiOiJrZWNAeW9wbWFpbC5jb20ifQ.S4w5R2g2L_0WxN_PoI9uAM6L2kfu-D_IQU2qE5dPAMKzEYl7f9-3C1b5SwHRtodJ2lE9cli8aKRVF_t9qgdEJGjgXmtxGorsPwEIJfG1d-5rmy9T09lcL5wJwHNkayWSya4jaaN8jcGL9CNK2Vqza1DolcrfapWptUhfpmPwG6lqW4SCpMyGirA0htXbxGqXxkwTgKn54Ja0axqH-MPpiehaCKC9dSnqHAnbaKtzW8EBAtfmp2xPmzubdCXG8iU04ApX3Me5cfI3D5YOaDA-h0Z7J7cZOG6xKQaKDPTVKjVfdLxWik0GagxkxJ61JgHnteZWkAtg0rnmrWzCi-1LjA").
		   
		      body(request.toJSONString()).
		      
		     when().
		     post(" http://qa.tab.kitecash.in/kite/v1/web/employees").
		     
		     then().
		       statusCode(400).
		       body("errors.code[0]" , equalTo(5001)).
		       body("errors.code[1]" , equalTo(lastName)).
		       log().all();
	
}
		
}