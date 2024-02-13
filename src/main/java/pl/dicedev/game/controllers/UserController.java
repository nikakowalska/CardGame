package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.clients.AuthClient;
import pl.dicedev.game.dto.AuthClientDto;
import pl.dicedev.game.dto.UserDto;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_LOGIN;
import static pl.dicedev.game.controllers.URINames.ENDPOINT_USER;

@RequestMapping(ENDPOINT_USER)
@RestController
public class UserController {
    @Autowired
    private AuthClient authClient;

    @RequestMapping(value = ENDPOINT_LOGIN, method = RequestMethod.GET)
    public UserDto loginUsers() {
        UserDto userDto = new UserDto();
        userDto.setName("Name:");
        userDto.setPassword("Password:");
        return userDto;
    }

    @PostMapping(ENDPOINT_LOGIN + "/{name}/{password}")
    public AuthClientDto getPost(
            @PathVariable("name") String name,
            @RequestParam(required = false) String nameParam,
            @PathVariable("password") String password
    ) {
        if (nameParam != null) {
            switch (nameParam) {
                case "body":
                    return authClient.getTokenSendBody(name, password);
                case "headers":
                    return authClient.getTokenSendHeaders(name, password);
                case "params":
                    return authClient.getTokenSendParams(name, password);
            }
        }
        return authClient.getToken(name, password);
    }
    //else if ()
}


