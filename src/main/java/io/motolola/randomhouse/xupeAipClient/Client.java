package io.motolola.randomhouse.xupeAipClient;


import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class Client
{
    final static String URL_XUPES = "https://localhost/";

    public static String getToken()
    {
        String username = "akin.motolola@xupes.com";
        String secret = "password";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
        requestBody.add("userName", username);
        requestBody.add("secret", secret);

        HttpEntity<?> httpEntity = new HttpEntity<>(requestBody, headers);

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.exchange(URL_XUPES + "token", HttpMethod.POST, httpEntity, String.class);
        return response.getBody();
    }
}
