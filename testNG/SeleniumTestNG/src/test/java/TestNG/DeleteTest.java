package TestNG;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
 

 
public class DeleteTest {
	public void DeleteTest() {
		delete("https://dummyjson.com/products/195")
	    .then()
	      .log().body()
	        .statusCode(200);  
	    System.out.println("DELETE PRODUCT");
		
	}
	
}