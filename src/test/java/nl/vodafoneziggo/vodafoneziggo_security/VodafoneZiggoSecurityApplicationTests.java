package nl.vodafoneziggo.vodafoneziggo_security;

import dasniko.testcontainers.keycloak.KeycloakContainer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VodafoneZiggoSecurityApplicationTests extends KeycloakTestContainers{

	@Test
	void givenAuthenticatedUser_whenGetMe_shouldReturnMyInfo() {

		String body = given().header("Authorization", getJaneDoeBearer())
				.when()
				.get("/hello")
				.then()
				.toString();
		System.out.println(body);

	}

}
