package api.endpoints;

import api.payload.Order;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class OrderEndPoints {
	
	public static Response createOrder(Order payload) {		
		Response response= given()
						   		.contentType(ContentType.JSON)
						   		.accept(ContentType.JSON)
						   		.body(payload)
						   	.when()
						   		.post(Routes.create_order_url);
		return response;
	}
	
	public static Response getOrder(int orderId) {		
		Response response= given()
						   		.pathParam("orderId", orderId)
						   	.when()
						   		.get(Routes.get_order_url);
		return response;
	}
	
	public static Response deleteOrder(int orderId) {		
		Response response= given()
						  		.pathParam("orderId", orderId)
						   	.when()
						   		.delete(Routes.delete_order_url);
		return response;
	}

}
