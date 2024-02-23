package pl.dicedev.game.clients;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.dicedev.game.dto.AuthClientDto;
import pl.dicedev.game.dto.UserAuthDto;

@Component
public class AuthClient {
    private RestTemplate restTemplate;

    public AuthClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getToken() {
        return restTemplate.exchange(
                "http://localhost:8081/v1/authentication/test:test",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                String.class).getBody();
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

    public AuthClientDto getValidateToken(String username, String password) {
        String credentials = username + ":" + password;
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/validate/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public String getScope() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Sales-Manager", "40%discount");

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        restTemplate.exchange(
                "http://localhost:8081/v1/authentication/scope",
                HttpMethod.GET,
                entity,
                String.class);
        return entity.getBody();
    }

    public AuthClientDto getScopeForToken(String username, String password) {
        String credentials = username + ":" + password;
        HttpEntity<AuthClientDto> entity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/scope/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return entity.getBody();
    }

    public AuthClientDto getTokenForName(String username, String password) {
        String credentials = username + ":" + password;
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/name/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public AuthClientDto getTokenForId(String username, String password) {
        String token = username + ":" + password; //
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/id/" + token,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public AuthClientDto getTokenSendBody(String username, String password) {
        UserAuthDto userAuthDto = new UserAuthDto(username, password);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");

        HttpEntity<UserAuthDto> entity = new HttpEntity<>(userAuthDto, httpHeaders);

        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/credentials/body",
                HttpMethod.POST,
                entity,
                AuthClientDto.class);
        return responseEntity.getBody();//łapie json od R i bierze  moj obiekt authdto i przepisze wartosci z jsona do obiektu
    }

    public AuthClientDto getTokenSendHeaders(String username, String password) {
        UserAuthDto userAuthDto = new UserAuthDto(username, password);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
        HttpEntity<UserAuthDto> entity = new HttpEntity<>(userAuthDto, httpHeaders);

        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/credentials/headers",
                HttpMethod.POST,
                entity,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public AuthClientDto getTokenSendParams(String username, String password) {
        UserAuthDto userAuthDto = new UserAuthDto(username, password);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
        HttpEntity<UserAuthDto> entity = new HttpEntity<>(userAuthDto, httpHeaders);

        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/credentials/{uuid}/{username}/{password}",
                HttpMethod.POST,
                entity,
                AuthClientDto.class);
        return responseEntity.getBody();
    }
}

