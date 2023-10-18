package api.endpoints;

import api.payload.Reqres;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ReqEndPoints {
	
	/**
	 * Used to perform the new register action.
	 * @param payload
	 * @return
	 */
	public static Response registerNewUser(Reqres payload) {		
		Response resoponse= given()
								.contentType(ContentType.JSON)
								.accept(ContentType.JSON)
								.body(payload)
							.when()
								.post(ReqresRoutes.register_reqres);
		return resoponse;
	}
	
	/**
	 * Used to perform the login action.
	 * @param payload
	 * @return
	 */
	public static Response loginUser(Reqres payload) {		
		Response resoponse= given()
								.contentType(ContentType.JSON)
								.accept(ContentType.JSON)
								.body(payload)
							.when()
								.post(ReqresRoutes.login_reqres);
		return resoponse;
	}
	
	/**
	 * Used to get the list of all the users by pageId.
	 * @param pageId
	 * @return
	 */
	public static Response listOfAllUsers(int pageId) {		
		Response resoponse= given()
								.queryParam("page",pageId)
							.when()
								.get(ReqresRoutes.list_reqres_alluser);
		return resoponse;
	}
	
	/**
	 * Used to get the list of single user by userId.
	 * @param userId
	 * @return
	 */
	public static Response listOfSingleUser(int userId) {
		Response resoponse= given()
								.pathParam("userId",userId)
							.when()
								.get(ReqresRoutes.list_reqres_singleuser);
		return resoponse;
	}



}
