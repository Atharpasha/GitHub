package generic_utility;

import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseApiClass {

public RequestSpecification req;
	
@BeforeSuite
	public void bfConfigure()
	{
		  req = new RequestSpecBuilder()
				.setBaseUri("https://reqres.in/")
				.setContentType(ContentType.JSON).build();
		 
		  
	}
}
