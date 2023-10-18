package api.test;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.OrderEndPoints;
import api.payload.Order;
import io.restassured.response.Response;

public class OrderTests{
	
	Faker faker;
	Order orderPayload;
	String orderStatus= "placed"; 
	
	@BeforeClass
	public void setupData() {
		faker= new Faker();
		orderPayload= new Order();
		LocalDateTime currentDateTime = LocalDateTime.now(ZoneOffset.UTC);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		String formattedDate = currentDateTime.format(formatter);
		
		orderPayload.setId(faker.number().numberBetween(1, 10000));
		orderPayload.setPetId(faker.number().numberBetween(1, 100));
		orderPayload.setQuantity(faker.number().numberBetween(1, 100));
		orderPayload.setShipDate(formattedDate);
		orderPayload.setStatus(orderStatus);
	}
	
	
	
	@Test(priority = 1)
	public void testCreateOrder() {
		System.out.println("Create Order method");
		Response response= OrderEndPoints.createOrder(orderPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2)
	public void testGetOrder() {
		System.out.println("Get Order details method");
		Response response= OrderEndPoints.getOrder(this.orderPayload.getId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 3)
	public void testDeleteOrder() {
		System.out.println("Delete Order method");
		Response response= OrderEndPoints.deleteOrder(this.orderPayload.getId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
