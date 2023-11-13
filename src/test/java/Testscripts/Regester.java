package Testscripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import generic_utility.BaseApiClass;
import generic_utility.endpoints;
import pojoutility.Reg;

public class Regester extends BaseApiClass {

	@Test
	public void register()
	{
		Reg r=new Reg("eve.holt@reqres.in","pistol");
	   given().spec(req).body(r)
	   .when().post(endpoints.regester)
	   .then().log().all();
	}
	@Test
	public void users()
	{
		 given().spec(req)
			.when().get(endpoints.getall)
			.then().log().all(); 
	}
}
