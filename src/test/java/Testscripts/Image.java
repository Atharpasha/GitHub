package Testscripts;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Image {

	@Test
	public void image()
	{
		File f=new File("C:\\Users\\Athar\\eclipse-workspace\\zop\\Photos\\Screenshot (45).png");
		Response res = given().multiPart("file",f)
		.when().post("https://petstore.swagger.io/v2/pet/2/uploadImage");
		
		System.out.println(res.prettyPrint());
		
	}
}
