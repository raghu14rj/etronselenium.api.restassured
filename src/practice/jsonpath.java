package practice;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class jsonpath {
public static void main(String[]args)
{

		
	RestAssured.baseURI="https://reqres.in/";
				RequestSpecification a = RestAssured.given();
		a.contentType(ContentType.JSON);
		String s1="{\r\n" + 
				"    \"name\": \"mor\",\r\n" + 
				"    \"job\": \" resident\"\r\n" + 
				"}";
		a.body(s1);
		 Response a1 = a.request(Method.PUT,"/api/users/2");
		System.out.println(a1.asString());
		System.out.println(a1.getStatusCode());
		System.out.println(a1.getStatusLine());
		System.out.println(a1.contentType());
		System.out.println(a1.getTime());
	
}
}
