package com.at.creatomatejavaexamples;

import static com.at.creatomatejavaexamples.util.Constants.API_KEY;
import static com.at.creatomatejavaexamples.util.Constants.API_URL_RENDERS;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH_PREFIX;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class CreateVideoUsingSource {

  //POST https://api.creatomate.com/v1/renders endpoint
  public static String templateRender() {

    RestTemplate restTemplate = new RestTemplate();

    String requestJson = "{  \"source\": {\n"
        + "  \"outputFormat\": \"mp4\",\n"
        + "    \"elements\": \"[ new Creatomate.Video({source : 'https://creatomate-static.s3.amazonaws.com/demo/video4.mp4' })]\" \n"
        + "}}";
    HttpHeaders headers = new HttpHeaders();

    headers.set(HEADER_AUTH,
        HEADER_AUTH_PREFIX + API_KEY);
    headers.setContentType(MediaType.APPLICATION_JSON);

    HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
    String response = restTemplate.postForObject(API_URL_RENDERS, entity, String.class);

    return response;
  }

  public static void main(String[] args) {
    String response = templateRender();
    // but video is not creating
    System.out.println("Created video using source --->" + response);

  }
}
