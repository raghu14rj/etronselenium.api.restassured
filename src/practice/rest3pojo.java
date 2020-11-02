package practice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class rest3pojo {
public static void main(String[]args)
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification a=RestAssured.given();
	Single_user a1 = a.request(Method.GET,"/api/users/2").as(Single_user.class);
	
	Data a2 = a1.getdata();
	System.out.println(a2.getLast_name());
	System.out.println(a2.getEmail());
	System.out.println(a2.getFirst_name());
	System.out.println(a2.getAvatar());
	System.out.println(a2.getId());
}
}
