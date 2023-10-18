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

}
