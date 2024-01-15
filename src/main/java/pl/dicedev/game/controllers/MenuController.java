package pl.dicedev.game.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.dto.MenuDto;

import java.util.List;

@RequestMapping("menu")
@RestController

public class MenuController {


    private org.springframework.http.HttpHeaders HttpHeaders;

    @GetMapping("options")
    public String getStringPathParam(
            @RequestParam("A") String A,
            @RequestParam("Menu") List<String> Menu) {
        return "URI options?A=" + A +
                "&Menu=" + List.of(
                (new MenuDto("A", "Choose your team-leader")),
                (new MenuDto("B", "Throw a card ")),
                (new MenuDto("C", "Show my hand")));
    }


//        @GetMapping("requestparam/map")
//        public String getStringPathParamMap (
//                @RequestParam Map < String, String > paramMap
//    ){
//            return "URI requestparam/map?" + paramMap;
//        }

    @GetMapping("requestheader")
    public String getStringH(
            @RequestHeader(org.springframework.http.HttpHeaders.ACCEPT_LANGUAGE) String language,
            @RequestHeader("Little (but fun) Card Game") String myHeader
    ) {
        return "test URI language/" +
                "\n" +
                HttpHeaders.ACCEPT_LANGUAGE +
                " " +
                language +
                "\n" +
                "Little (but fun) Card Game" +
                " " +
                myHeader;
    }
}


