package pl.dicedev.game.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CardGameConfigs {

    @Bean
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }

}
