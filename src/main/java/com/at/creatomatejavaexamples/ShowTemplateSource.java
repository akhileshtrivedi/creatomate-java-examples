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

public class ShowTemplateSource {
  
  // GET https://api.creatomate.com/v1/templates/ID Returns the template source associated with the provided ID
  public  static ResponseEntity<String> getTemplateSource(String templateId) {
    String apiUrl = API_URL_TEMPLATES + "/" + templateId;
    HttpHeaders headers = new HttpHeaders();
    RestTemplate restTemplate = new RestTemplate();
    headers.set(HEADER_AUTH,
        HEADER_AUTH_PREFIX + API_KEY);
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>("body", headers);
    ResponseEntity<String> response = restTemplate.exchange(
        apiUrl,
        HttpMethod.GET,
        entity,
        String.class
    );

    return response;
  }

  public static void main(String[] args) {
    String response = getTemplateSource("22560bf2-76a2-4fd3-9b6f-ebe882b942f6").getBody();
    System.out.println("Template source associated with the given ID--->"+response);

  }
}
