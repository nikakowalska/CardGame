package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.dto.MenuDto;
import pl.dicedev.game.dto.MenuListDto;
import java.util.List;

@RequestMapping("menu")
@RestController

public class MenuController {


    @RequestMapping(method = RequestMethod.GET)
//przechwytuje adres url po pl/, potem zrobi liste i bedzie sprawdzal do ktorego zasobu
    public MenuListDto getMenuList() {
        MenuListDto menuOptions = new MenuListDto();
        menuOptions.setMenuOptions(
                List.of(
                        (new MenuDto("A", "Choose your team-leader")),
                        (new MenuDto("B", "Throw a card ")),
                        (new MenuDto("C", "Show my hand"))));
        return menuOptions;
    }
}

