package pl.dicedev.game.clients;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UUIDClient {

    private RestTemplate restTemplate;

    public UUIDClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getUUID() {
        return restTemplate.exchange(
                        "https://www.uuidtools.com/api/generate/v1",
                        HttpMethod.GET,
                        HttpEntity.EMPTY,
                        String.class)
                .getBody();
    }

}
