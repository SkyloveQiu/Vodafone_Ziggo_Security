package nl.vodafoneziggo.vodafoneziggo_security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VodafoneZiggoSecurityApplicationTests extends KeycloakTestContainers{

	@Test
	void testUnprotectedEntryPoint() {
		given().get("/hello")
				.then()
				.toString()
				.equals("This is an echo server");
	}

	@Test
	void testProtectedEntryPoint(){
		given().header("Authorization", getJaneDoeBearer())
				.queryParam("input", "test123")
				.when()
				.get("/test")
				.then()
				.toString()
				.equals("test123");
	}

	@Test
	void testProtectedEntryPointWithoutAuthorization(){
		given().queryParam("input", "test123")
				.when()
				.get("/test")
				.then()
				.statusCode(401);
	}

}
