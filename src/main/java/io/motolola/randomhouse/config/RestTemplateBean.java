package io.motolola.randomhouse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
@Configuration
public class RestTemplateBean
{
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
