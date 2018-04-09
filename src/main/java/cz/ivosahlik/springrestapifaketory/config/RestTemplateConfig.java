package cz.ivosahlik.springrestapifaketory.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Configuration
public class RestTemplateConfig {

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
//        return restTemplateBuilder.build();
//    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
