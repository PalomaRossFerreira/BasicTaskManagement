package com.paloma.taskmanagement;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TaskmanagementApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void greetingShouldReturnDefaultMessage() throws Exception {
		
		String endpointResponse = this.restTemplate.getForObject("http://localhost:" + port + "/", String.class);
		
		assertThat(endpointResponse).contains("opostman");
	}
	
	@Test
	void goodnightShouldReturnDefaultMessage() throws Exception {
		
		String initialpointResponse = this.restTemplate.getForObject("http://localhost:" + port + "/m", String.class);
		
		assertThat(initialpointResponse).contains("bye");
	}

}
