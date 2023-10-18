package api.endpoints;

import api.payload.Reqres;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ReqresEndPoints {
	
	public Response registerNewUser(Reqres payload) {		
		Response resoponse= given()
								.contentType(ContentType.JSON)
								.accept(ContentType.JSON)
								.body(payload)
							.when()
								.post(ReqresRoutes.register_reqres);
		return resoponse;
	}

}
