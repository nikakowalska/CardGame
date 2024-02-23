package pl.dicedev.game.clients;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.dicedev.game.dto.PlayerClientDto;
import pl.dicedev.game.services.PlayerService;


@Component
public class PlayerClient {

    private RestTemplate restTemplate;

    public PlayerClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PlayerClientDto getP1results() {
        PlayerService playerService = new PlayerService();
        String id = playerService.getPlayer1id();
        String scoreValue = playerService.getPlayer1scoreValue();
        String playerData = id + ":" + scoreValue;
               ResponseEntity<PlayerClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/winner/" + playerData,
                HttpMethod.POST,
                HttpEntity.EMPTY,
                PlayerClientDto.class);
        return responseEntity.getBody();
    }
    public PlayerClientDto getP2results() {
        PlayerService playerService = new PlayerService();
        String id = playerService.getPlayer2id();
        String scoreValue = playerService.getPlayer2scoreValue();
        String playerData = id + ":" + scoreValue;
        ResponseEntity<PlayerClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/winner/" + playerData,
                HttpMethod.POST,
                HttpEntity.EMPTY,
                PlayerClientDto.class);
        return responseEntity.getBody();
    }
    public String getWinner() {
        return restTemplate.exchange(
                "http://localhost:8081/v1/winner/result",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                String.class).getBody();
    }

}
