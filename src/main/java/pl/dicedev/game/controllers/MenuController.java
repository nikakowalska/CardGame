package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.Utils.Strings;
import pl.dicedev.game.dto.MenuDto;
import pl.dicedev.game.dto.MenuListDto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@RestController

public class MenuController {
    private final Scanner scanner;
    private String result;

    public MenuController(final Scanner scanner, String result) {
        this.scanner = scanner;
        this.result = result;
    }

    @RequestMapping(value = "menu", method = RequestMethod.GET)

    public String dispatcher() {

        Strings.println("Do you want to play? Y/N", Strings.Color.GREEN_BACKGROUND);

        List<MenuDto> menuOptions = Arrays.asList(
                new MenuDto("A", "Choose your team-leader"),
                new MenuDto("B", "Throw a card"),
                new MenuDto("C", "Show my hand"));

        for (MenuDto menuOption : menuOptions) {
            System.out.println(menuOption.getEntryLetter() +" "+ menuOption.getCommand());
        }
        result = scanner.nextLine().toUpperCase();


        if (userSelectIncorrectOption(result)) {
            // throw new IncorrectUserSelectException("123","User selected incorrect option");
        }
        return result;
    }

    private boolean userSelectIncorrectOption(String result) {

        return !() || result.equals("Y") || result.equals("N"));
    }
}

