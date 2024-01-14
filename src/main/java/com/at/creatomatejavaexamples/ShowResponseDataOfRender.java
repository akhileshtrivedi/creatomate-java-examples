package com.at.creatomatejavaexamples;

import static com.at.creatomatejavaexamples.util.Constants.API_KEY;
import static com.at.creatomatejavaexamples.util.Constants.API_URL_RENDERS;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH_PREFIX;

import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class ShowResponseDataOfRender {

  //GET https://api.creatomate.com/v1/renders endpoint(get the status of a render by specifying its ID)
  public static ResponseEntity<String> getRenderDataOrStatus(String renderId) {

    String apiUrl = API_URL_RENDERS + "/" + renderId;
    HttpHeaders headers = new HttpHeaders();
    headers.set(HEADER_AUTH,
        HEADER_AUTH_PREFIX + API_KEY);
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>("body", headers);
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.exchange(
        apiUrl,
        HttpMethod.GET,
        entity,
        String.class
    );

    return response;
  }

  public static void main(String[] args) {
    String response = getRenderDataOrStatus("8cad1fc7-5a49-4a41-bbe1-9bf5af461c46").getBody();
    System.out.println("get the status of a render by using the provided id--->" + response);

  }
}
