package com.at.creatomatejavaexamples;

import static com.at.creatomatejavaexamples.util.Constants.API_KEY;
import static com.at.creatomatejavaexamples.util.Constants.API_URL_RENDERS;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH_PREFIX;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class CreateMultipleVideoWithNewColorAndTextUsingTemplateId {

  //POST https://api.creatomate.com/v1/renders endpoint
  public static String templateRender() {

    RestTemplate restTemplate = new RestTemplate();

    String requestJson = "{\n"
        + "  \"template_id\": \"1401c072-e7f4-428d-9515-c58ef63b80f9\",\n"
        + "  \"modifications\": {\n"
        + "    \"Intro Text.font_family\": \"Pacifico\",\n"
        + "    \"Brand.font_family\": \"Pacifico\",\n"
        + "    \"Product Name.font_family\": \"Pacifico\",\n"
        + "    \"Price.font_family\": \"Pacifico\",\n"
        + "    \"Deal.font_family\": \"Pacifico\",\n"
        + "    \"Website.font_family\": \"Pacifico\",\n"
        + "    \"Call-To-Action.font_family\": \"Pacifico\",\n"
        + "    \"Product-Name.font_family\": \"Pacifico\",\n"
        + "    \"Product-Description.font_family\": \"Pacifico\",\n"
        + "    \"Discounted-Price.font_family\": \"Pacifico\",\n"
        + "    \"Normal-Price.font_family\": \"Pacifico\",\n"
        + "    \"Intro Text\": \"Right Deals\",\n"
        + "    \"Intro Text.fill_color\": \"#ffffff\",\n"
        + "    \"Brand\": \"Shopping Now\",\n"
        + "    \"Call-To-Action\": \"Shopping Now\",\n"
        + "    \"Brand.fill_color\": \"#e02222\",\n"
        + "    \"Call-To-Action.fill_color\": \"#e02222\",\n"
        + "    \"Shape\": \"#42BEA7\",\n"
        + "    \"Audio\": \"https://tonypascal.com/assets/audio/track1.mp3\",\n"
        + "    \"Website\": \"thursdayboots.com\",\n"
        + "    \"Product Name\": \"Women's Premier Low Top | Indigo\",\n"
        + "    \"Product-Name\": \"Women's Premier Low Top | Indigo\",\n"
        + "    \"Product Image 1\": \"https://cdn.shopify.com/s/files/1/0419/1525/products/1024x1024-Women-Premier-Indigo-100722-3.4.jpg?v=1665696596\",\n"
        + "    \"Product Image 2\": \"https://cdn.shopify.com/s/files/1/0419/1525/products/1024x1024-Women-Premier-LowTop-Indigo-100422-2.jpg?v=1665696599\",\n"
        + "    \"Product Image 3\": \"https://cdn.shopify.com/s/files/1/0419/1525/products/1024x1024-Women-Premier-Indigo-100722-3.4.jpg?v=1665696596\",\n"
        + "    \"Product-Image\": \"https://cdn.shopify.com/s/files/1/0419/1525/products/1024x1024-Women-Premier-Indigo-100722-3.4.jpg?v=1665696596\",\n"
        + "    \"QR\": \"https://chart.googleapis.com/chart?chs=300x300&cht=qr&chl=https%3A%2F%2Fthursdayboots.com%2Fproducts%2Fwomens-premier-low-top-sneaker-indigo\",\n"
        + "    \"QR.visible\": true\n"
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
