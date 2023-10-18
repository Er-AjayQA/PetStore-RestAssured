package api.endpoints;

/*
Base URI ---> https://reqres.in
New Register successful: - /api/register - 200
New Register unsuccessful: - /api/register - 400
Login successful: - /api/login - 200
Login unsuccessful: - /api/login - 400
Create User(POST): -/api/users - 201
Get List of all Users(GET): - /api/users?page={pageId} - 200
Get single User(GET): - /api/users/{userId} - 200
Update User Detail(PUT): - /api/users/{userId} - 200
Update User Detail(PATCH): - /api/users/{userId} - 200
Delete User(DELETE): - /api/users/{userId} - 204
*/
public class ReqresRoutes {
	// Base URL
	public static String reqres_base_url= "https://reqres.in";
	
	// Base URL
	public static String register_reqres= reqres_base_url+"/api/register";
	public static String login_reqres= reqres_base_url+"/api/login";
	public static String create_reqres_user= reqres_base_url+"/api/users";
	public static String list_reqres_alluser= reqres_base_url+"/api/users";
	public static String list_reqres_singleuser= reqres_base_url+"/api/users/{userId}";
	public static String update_reqres_put= reqres_base_url+"/api/users/{userId}";
	public static String update_reqres_patch= reqres_base_url+"/api/users/{userId}";
	public static String delete_reqres_user= reqres_base_url+"/api/users/{userId}";

}
