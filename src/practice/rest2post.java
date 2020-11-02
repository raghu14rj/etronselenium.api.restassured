package practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class rest2post {
	public static void main(String[]args)
	{
		
		RestAssured.baseURI="https://reqres.in/";
				RequestSpecification a = RestAssured.given();
		a.contentType(ContentType.JSON);
		JSONObject js=new JSONObject();
		js.put("name","tanush");
		js.put("job","dev");
		a.body(js.toJSONString());
				Response a1 = a.request(Method.PUT,"/api/users/2");
		System.out.println(a1.asString());
		System.out.println(a1.getStatusCode());
		System.out.println(a1.getStatusLine());
		System.out.println(a1.contentType());
		System.out.println(a1.getTime());
		
	}
	}

