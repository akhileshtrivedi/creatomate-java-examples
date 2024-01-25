package com.at.creatomatejavaexamples;

import static com.at.creatomatejavaexamples.util.Constants.API_KEY;
import static com.at.creatomatejavaexamples.util.Constants.API_URL_RENDERS;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH;
import static com.at.creatomatejavaexamples.util.Constants.HEADER_AUTH_PREFIX;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class CreateVideoWithNewColorAndTextUsingTemplateId {

  //POST https://api.creatomate.com/v1/renders endpoint
  public static String templateRender() {

    RestTemplate restTemplate = new RestTemplate();

    String requestJson = "{\n"
        + "  \"template_id\": \"1401c072-e7f4-428d-9515-c58ef63b80f9\",\n"
        + "  \"modifications\": {\n"
        + "    \"Product Image 3\": \"https://cdn.shopify.com/s/files/1/0419/1525/files/1024x1024-Men-Aviator3.0-Chocolate-062923-Outsole.jpg?v=1691435448\",\n"
        + "    \"Deal\": \"-30%\",\n"
        + "    \"bed7f3ba-00e8-4e75-9d3f-3a77b571a869\": \"https://cdn.shopify.com/s/files/1/0419/1525/products/3.4_Captain_BlackMatte.jpg?v=1569226836\",\n"
        + "    \"449cc28c-5356-4af7-b7c4-68acd30ee34f\": \"$111.11\",\n"
        + "    \"931fee58-48eb-4d3a-afd0-1eecbcf64001\": \"https://cdn.shopify.com/s/files/1/0419/1525/files/1024x1024-Mens-Cadet-ShadowGrey-041223-Side.jpg?v=1692045072\",\n"
        + "    \"aa0d4ee7-5337-49f4-a24e-6a92f9c89dc4\": \"The Product!\",\n"
        + "    \"2c04f9d8-ddb9-4aad-b219-087e49fff119\": \"https://cdn.shopify.com/s/files/1/0419/1525/products/3.4_Captain_BlackMatte.jpg?v=1569226836\",\n"
        + "    \"83da1835-7bb9-4cdb-83cb-ac14d857aab3\": \"https://cdn.shopify.com/s/files/1/0419/1525/files/1024x1024-Men-Aviator3.0-Chocolate-062923-Outsole.jpg?v=1691435448\",\n"
        + "    \"Intro Text\": \"NEW API's Deals\",\n"
        + "    \"Intro Text.font_family\": \"Kolker Brush\",\n"
        + "    \"Intro Text.fill_color\": \"#FF0000\",\n"
        + "    \"de7311cd-964f-4fba-916f-10fb037816c3\": \"rgba(36, 58, 62)\",\n"
        + "    \"6619f96e-cf48-4e4a-a7bd-e410009887ed\": \"AT Brand X\",\n"
        + "    \"d0c554f8-3463-4ea6-88e8-f09f7a46eb87\": \"https://cdn.shopify.com/s/files/1/0419/1525/files/1024x1024-Mens-Cadet-ShadowGrey-041223-Side.jpg?v=1692045072\",\n"
        + "    \"4d467e21-9ba5-4af3-ac6e-e7505d2dc09b\": \"AT Brand X\",\n"
        + "    \"Website\": \"www.atnewqabrand.com\",\n"
        + "    \"0f195ad2-6510-46d1-b909-057acc4ddfcc\": \"The AT Product!\",\n"
        + "    \"60fbeb59-227e-47ad-8076-a8c6cb9f50e1\": \"$111.11\",\n"
        + "    \"16ded007-2f0b-42be-ba53-4285d8c24404\": \"https://cdn.shopify.com/s/files/1/0419/1525/products/1024x1024-Women-Crown-Black-012023-2.jpg?v=1675110361\",\n"
        + "    \"fc38b5d7-6745-4e05-9eb7-40c7b9ea273b\": \"https://www.scandit.com/wp-content/uploads/2019/08/Symbology-QR-code.svg\"\n"
        + "  }"
        + "  }";




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
