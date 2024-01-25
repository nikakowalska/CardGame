package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.dto.StandardCardDto;
import pl.dicedev.game.services.StandardCardService;

import java.util.List;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_ALL;
import static pl.dicedev.game.controllers.URINames.ENDPOINT_CARD;
@RestController(ENDPOINT_CARD)
public class StandardCardController {
        @Autowired
        private StandardCardService standardCardService;

        @GetMapping(ENDPOINT_ALL)
        public StandardCardService getStandardCardList(List<StandardCardDto>standardCardDtoList){
                return (StandardCardService) standardCardService.getStandardCardList();
        }
}
