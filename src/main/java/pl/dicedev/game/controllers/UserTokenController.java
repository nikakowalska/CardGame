package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.clients.AuthClient;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_LOGIN;
import static pl.dicedev.game.controllers.URINames.ENDPOINT_USER;

@RestController
@RequestMapping(ENDPOINT_LOGIN)
public class UserTokenController {
    @Autowired
    private AuthClient authClient;


    @PostMapping("validate/{token}")
    public boolean getValidateToken(@PathVariable String token) {
        String retrievedToken = authClient.getToken();
        return retrievedToken.equals(token);
    }
}

