package practice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class rest1 {
public static void main(String[]args)
{
	
	RestAssured.baseURI="https://reqres.in/";
			RequestSpecification a = RestAssured.given();
	Response a1 = a.request(Method.DELETE,"/api/users/2");
	System.out.println(a1.asString());
	System.out.println(a1.getStatusCode());
	System.out.println(a1.getStatusLine());
	System.out.println(a1.contentType());
	
}
}