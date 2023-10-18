package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.DataProvidersUtility;
import io.restassured.response.Response;

public class DDTests {
	
	@Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProvidersUtility.class)
	public void testPostUser(String uID, String uName, String fName, String lName, String email, String pwd, String ph) {
		
		User userPayload= new User();
		
		userPayload.setId(Integer.parseInt(uID));
		userPayload.setUsername(uName);
		userPayload.setFirstName(fName);
		userPayload.setLastName(lName);
		userPayload.setEmail(email);
		userPayload.setPassword(pwd);
		userPayload.setPhone(ph);
		
		Response response = UserEndPoints.createUser(userPayload);
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2, dataProvider = "UserNames", dataProviderClass = DataProvidersUtility.class)
	public void testGetUser(String uName) {
		
		Response response = UserEndPoints.readUser(uName);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
