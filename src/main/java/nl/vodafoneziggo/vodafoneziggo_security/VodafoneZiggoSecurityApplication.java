package nl.vodafoneziggo.vodafoneziggo_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class VodafoneZiggoSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(VodafoneZiggoSecurityApplication.class, args);
	}

}
