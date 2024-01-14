package com.at.creatomatejavaexamples;

import static com.at.creatomatejavaexamples.util.Constants.API_KEY;
import static com.at.creatomatejavaexamples.util.Constants.API_URL_RENDERS;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH_PREFIX;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class CreateVideoUsingTemplateId {

  //POST https://api.creatomate.com/v1/renders endpoint
  public static String templateRender() {

    RestTemplate restTemplate = new RestTemplate();

    String requestJson = "{\n"
        + "  \"template_id\": \"1f66e8b5-4cc7-4b9b-94a5-842c4081ecaa\",\n"
        + "  \"modifications\": {\n"
        + "    \"Photo 1\": \"https://cdn.creatomate.com/files/assets/353ba980-9f13-4613-a8c5-f3aca0c41324\",\n"
        + "    \"Photo 2\": \"https://cdn.creatomate.com/files/assets/f1cedfdd-eb93-4bda-a2f0-9171e3c71c41\",\n"
        + "    \"Photo 3\": \"https://cdn.creatomate.com/files/assets/a2fc1725-f761-4d68-a6e8-001aa890c126\",\n"
        + "    \"Photo 4\": \"https://cdn.creatomate.com/files/assets/cc72d7f3-ae1a-494e-af46-f080fa2c5d85\",\n"
        + "    \"Photo 5\": \"https://cdn.creatomate.com/files/assets/9fc100e8-cbb5-451d-8c5e-d9f75b190cb1\",\n"
        + "    \"Address\": \"NEW NOIDA ,WEST\",\n"
        + "    \"Details 1\": \"3,500 sqft5 Bedrooms 4 Bathrooms\",\n"
        + "    \"Details 2\": \"Built in 2020 2 ATS Rs 21,595,000\",\n"
        + "    \"Picture\": \"https://cdn.creatomate.com/files/assets/08322d05-9717-402a-b267-5f49fb511f95\",\n"
        + "    \"Email\": \"akhileshtrivedi@mybrand.com\",\n"
        + "    \"Phone Number\": \"9718344424\",\n"
        + "    \"Brand Name\": \"MDTI Realtors\",\n"
        + "    \"Name\": \"ER. Akhilesh Trivedi\"\n"
        + "  }\n"
        + "}";
    HttpHeaders headers = new HttpHeaders();

    headers.set(HEADER_AUTH,
        HEADER_AUTH_PREFIX + API_KEY);
    headers.setContentType(MediaType.APPLICATION_JSON);

    HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
    String response = restTemplate.postForObject(API_URL_RENDERS, entity, String.class);

    return response;
  }

  public static void main(String[] args) {
    String response = templateRender();
    System.out.println("Created video using template id--->" + response);

  }
}
