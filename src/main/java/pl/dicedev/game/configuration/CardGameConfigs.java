package pl.dicedev.game.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CardGameConfigs {

    @Bean
    public RestTemplate getRestTemplate() {
        //tu dopisuje się zamiast geta w nazwie metody wstawiam nazwe serwisu do którego się łaćzę
        return new RestTemplate();
    }

}
