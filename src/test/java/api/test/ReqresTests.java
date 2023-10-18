package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.ReqEndPoints;
import api.payload.Reqres;
import api.utilities.JavaUtility;
import io.restassured.response.Response;

public class ReqresTests {
	
	Faker faker;
	Reqres req;
	JavaUtility jUtil;
	
	@BeforeClass
	public void setupData() {
		faker= new Faker();
		req= new Reqres();
		jUtil= new JavaUtility();
		String name= "demo"+jUtil.getRandomNumber();
		String job= "demoJob"+jUtil.getRandomNumber();
		
		req.setEmailId("eve.holt@reqres.in");
		req.setPassword("pistol");
		req.setName(name);
		req.setJob(job);	
		req.setPageId(jUtil.getPageIdRandomNumber());
		req.setUserId(jUtil.getUserIdRandomNumber());
	}
	
	@Test(priority = 1)
	public void loginSuccessfulTest() {
		Response response= ReqEndPoints.loginUser(req);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2)
	public void registerUnSuccessfulTest() {
		Response response= ReqEndPoints.registerNewUser(req);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 400);
	}
	
	@Test(priority = 3)
	public void registerSuccessfulTest() {
		Response response= ReqEndPoints.registerNewUser(req);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 4)
	public void getAllUserListTest() {
		Response response= ReqEndPoints.listOfAllUsers(this.req.getPageId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 5)
	public void getSingleUserListTest() {
		Response response= ReqEndPoints.listOfSingleUser(req.getUserId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
