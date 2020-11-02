package practice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSenderOptions;
import io.restassured.specification.RequestSpecification;

public class jsonpath1 {
public static void main(String[]args)
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification a = RestAssured.given();
	Response a1 = a.request(Method.GET,"/api/users?page=2");
	String s1 = a1.asString();
	System.out.println(s1);
	JsonPath jp=new JsonPath(s1);
	Object s2 = jp.get("data[4].id");
	System.out.println(s2);
	s2=jp.get("data[1].last name");
	System.out.println(s2);
	s2=jp.get("data[2].email");
	System.out.println(s2);  
	s2=jp.get("per.page");
	System.out.println(s2);
}
}
