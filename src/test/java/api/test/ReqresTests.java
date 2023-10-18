package api.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import api.endpoints.ReqresEndPoints;
import api.payload.Reqres;
import io.restassured.response.Response;

public class ReqresTests {
	
	Faker faker;
	Reqres req;
	
	@BeforeClass
	public void setupData() {
		faker= new Faker();
		req= new Reqres();
		
		req.setEmailId(faker.internet().safeEmailAddress());
		req.setPassword(faker.internet().password(6, 10));
		req.setName(faker.name());
		req.setJob(faker.job());		
	}
	
	@Test(priority = 1)
	public void testRegister() {
		Response response= 
	}

}
