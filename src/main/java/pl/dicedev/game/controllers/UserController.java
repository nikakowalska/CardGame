package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.dto.UserDto;

import java.util.List;


@RequestMapping("user")
@RestController
public class UserController {


    @RequestMapping(value = "login", method = RequestMethod.GET)

    public UserDto getNewUsers() {
        UserDto userDto = new UserDto();
        userDto.setName("Name:");
        userDto.setPassword("Password:");
        return userDto;
    }


    @PostMapping("login/{name}/{password}")
    public String getPost(
            @PathVariable("name") String name,
            @PathVariable("password") String password) {
        return "login" + name + password;
    }

}


