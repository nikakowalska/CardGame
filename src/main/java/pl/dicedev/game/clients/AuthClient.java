package pl.dicedev.game.clients;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.dicedev.game.dto.AuthClientDto;

@Component
public class AuthClient {
    private RestTemplate restTemplate;

    public AuthClient(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getToken() {
        return restTemplate.exchange(
                        "http://localhost:8081/v1/authentication/test:test",
                        HttpMethod.GET,
                        HttpEntity.EMPTY,
                        String.class)
                .getBody();
    }

    public AuthClientDto getToken(String username, String password) {
        String credentials = username + ":" + password;
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }
    public AuthClientDto getTokenTo(String username, String password) {
        String credentials = username + ":" + password;
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }
}
