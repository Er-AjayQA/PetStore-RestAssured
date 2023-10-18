package api.endpoints;

/*
Base URI ---> https://petstore.swagger.io/v2
	
Create User(Post) : https://petstore.swagger.io/v2/user
Get User(Get) : https://petstore.swagger.io/v2/user/{username}
Update User(Put) : https://petstore.swagger.io/v2/user/{username}
Delete User(Delete) : https://petstore.swagger.io/v2/user/{username}

Create Order(Post) : https://petstore.swagger.io/v2/store/order
Get Order(Get) : https://petstore.swagger.io/v2/store/order/{orderId}
Delete Order(Delete) : https://petstore.swagger.io/v2/store/order/{orderId}
*/

public class Routes {
	
	// Base URL
	public static String base_url= "https://petstore.swagger.io/v2";
	
	// User Module
	public static String post_user_url= base_url+"/user";
	public static String get_user_url= base_url+"/user/{username}";
	public static String update_user_url= base_url+"/user/{username}";
	public static String delete_user_url= base_url+"/user/{username}";
	
	// Store Module
	public static String create_order_url= base_url+"/store/order";
	public static String get_order_url= base_url+"/store/order/{orderId}";
	public static String delete_order_url= base_url+"/store/order/{orderId}";
	
	public static String test_url= "https://urldefense.com/v3/__https:/api.securaa.io/service/service.php__;!!N8Xdb1VRTUMlZeI!lMn4vmdb60kZfQdmQiG2NwbNJSfEavr9DddDSW0RxGvKLMVmXWW9WDdFPMfdVs27dRpCDGE3fueYwoac7LFizmTY3w$";

}
