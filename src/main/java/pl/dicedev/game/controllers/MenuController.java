package pl.dicedev.game.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.dto.MenuDto;
import pl.dicedev.game.dto.MenuListDto;

import java.util.List;

@RequestMapping("game")
@RestController

public class MenuController {


    private org.springframework.http.HttpHeaders HttpHeaders;

    @RequestMapping(value = "options", method = RequestMethod.GET)
    public String getStringPathParam(List<MenuDto> menuOptions) {
        MenuListDto menuListDto = new MenuListDto();
        menuListDto.setMenuOptions(List.of(
                (new MenuDto("A", "Choose your team-leader")),
                (new MenuDto("B", "Throw a card ")),
                (new MenuDto("C", "Show my hand"))));
        return String.valueOf(menuListDto);
    }

    @PostMapping("options/{choice}/{A}")
    public String getPostA(@PathVariable String choice, @PathVariable String A) {
        return "choice" + choice + A;
    }

//
//    @GetMapping("requestheader")
//    public String getStringH(
//            @RequestHeader(org.springframework.http.HttpHeaders.ACCEPT_LANGUAGE) String language,
//            @RequestHeader("Little (but fun) Card Game") String myHeader
//    ) {
//        return "test URI language/" +
//                "\n" +
//                HttpHeaders.ACCEPT_LANGUAGE +
//                " " +
//                language +
//                "\n" +
//                "Little (but fun) Card Game" +
//                " " +
//                myHeader;
//    }
}


