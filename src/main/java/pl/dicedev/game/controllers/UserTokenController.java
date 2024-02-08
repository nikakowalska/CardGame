package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.clients.AuthClient;

@RestController
public class UserTokenController {
    @Autowired
    private AuthClient authClient;

    @GetMapping("/credentials")
    public String getToken() {
        return authClient.getToken();
    }
}

