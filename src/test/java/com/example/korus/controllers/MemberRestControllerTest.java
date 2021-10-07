package com.example.korus.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MemberRestControllerTest {

    // bind the above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testRestController() throws Exception {

        Set<String> testNames = new HashSet<>();
        testNames.add("Mike");
        testNames.add("Andrey");

        ResponseEntity<String> response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/members/younger/15").toString(), String.class);
//        assertEquals(testNames, response.getBody());
        testNames.equals(response.getBody());

    }
}