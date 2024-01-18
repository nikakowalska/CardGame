package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.dto.UserDto;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_LOGIN;
import static pl.dicedev.game.controllers.URINames.ENDPOINT_USER;

@RequestMapping(ENDPOINT_USER)
@RestController
public class UserController {

    @RequestMapping(value = ENDPOINT_LOGIN, method = RequestMethod.GET)
    public UserDto loginUsers() {
        UserDto userDto = new UserDto();
        userDto.setName("Name:");
        userDto.setPassword("Password:");
        return userDto;
    }

    @PostMapping(ENDPOINT_LOGIN + "/{name}/{password}")
    public String getPost(
            @PathVariable("name") String name,
            @PathVariable("password") String password
    ) {
        return "login" + name + password;
    }

}


