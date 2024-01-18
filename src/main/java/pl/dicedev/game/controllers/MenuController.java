package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.builders.MenuDtoBuilder;
import pl.dicedev.game.dto.MenuListDto;

import java.util.List;

import static pl.dicedev.game.controllers.URINames.*;

@RequestMapping(ENDPOINT_GAME)
@RestController
public class MenuController {

    @RequestMapping(value = ENDPOINT_OPTIONS, method = RequestMethod.GET)
    public MenuListDto getStringPathParam() {
        MenuListDto menuListDto = new MenuListDto();
        menuListDto.setMenuOptions(
                List.of(
                        MenuDtoBuilder.builder()
                                .withLetter("A")
                                .withCommand("Choose your team-leader")
                                .withUri(ENDPOINT_TEAM_LEADER)
                                .build(),
                        MenuDtoBuilder.builder()
                                .withLetter("B")
                                .withCommand("Throw a card")
                                .withUri(ENDPOINT_CARD)
                                .build(),
                        MenuDtoBuilder.builder()
                                .withLetter("C")
                                .withCommand("Show my hand")
                                .withUri(ENDPOINT_HAND)
                                .build()
                )
        );
        return menuListDto;
    }

}


