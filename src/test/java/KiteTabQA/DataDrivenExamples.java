package KiteTabQA;


import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExamples {
	
	

	@DataProvider(name = "dataForPost")
	public Object[][] DataForPost() {
		
//		Object[][] data = new Object[1][6];
//		
//		data[0][0] = "Ankush";
//		data[0][1] = "Garg";
//		data[0][2] = "Male";
//		data[0][3] = "ankush@yopmail.com";
//		data[0][4] = "+919994945550";
//		data[0][5] = "dfbf9bc7-fbd0-42e4-a19e-4748c78dd138";
//		
//		return data;
		
		 return new Object[][] {
			
 {"Ankush", "Garg", "Male", "ankush@yopmail.com", "+919994945550", "dfbf9bc7-fbd0-42e4-a19e-4748c78dd138"},
			 
			 
		 };

		
	}
	
	
	@Test(dataProvider = "DataForPost")
	public void TC_01 (String firstName, String lastName, String gender, String email, int mobile, Number roleId) {
	
	JSONObject request = new JSONObject();
	 
	   request.put("firstName", firstName);
	  request.put("lastName", lastName);
	  request.put("gender", gender);
	request.put("email", email);
	request.put("mobile", mobile);
	request.put("roleId", roleId);
  
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
       statusCode(401).
         log().all();
     
	
	
	
	}
	
}
