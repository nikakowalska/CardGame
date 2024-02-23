package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.clients.PlayerClient;
import pl.dicedev.game.dto.PlayerClientDto;
import pl.dicedev.game.services.PlayerService;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_ALL;


@RequestMapping(ENDPOINT_ALL)
@RestController
public class PlayerController {
    @Autowired
    private PlayerClient playerClient;
    private PlayerService playerService;


    @GetMapping("player1")
    public PlayerClientDto getp1results(
    ) {
        return playerClient.getP1results();
    }

    @GetMapping("player2")
    public PlayerClientDto getp2results(
    ) {
        return playerClient.getP2results();
    }
    @PostMapping("results")
    public String getResults() {
        return playerClient.getWinner();
    }
}