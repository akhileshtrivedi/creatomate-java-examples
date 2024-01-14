package com.at.creatomatejavaexamples;

import static com.at.creatomatejavaexamples.util.Constants.API_KEY;
import static com.at.creatomatejavaexamples.util.Constants.API_URL_TEMPLATES;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH_PREFIX;

import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ShowAllTemplates {

  // GET https://api.creatomate.com/v1/templates  Returns a list of templates in your project
  public  static ResponseEntity<String> getAllTemplates() {

    HttpHeaders headers = new HttpHeaders();
    RestTemplate restTemplate = new RestTemplate();
    headers.set(HEADER_AUTH,
        HEADER_AUTH_PREFIX + API_KEY);
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>("body", headers);
    ResponseEntity<String> response = restTemplate.exchange(
        API_URL_TEMPLATES,
        HttpMethod.GET,
        entity,
        String.class
    );

    return response;
  }

  public static void main(String[] args) {
    String response = getAllTemplates().getBody();
    System.out.println("List of Templates in your project--->"+response);

  }
}
