package pl.dicedev.game.services;

import org.springframework.stereotype.Service;
import pl.dicedev.game.builders.StandardCardDtoBuilder;
import pl.dicedev.game.dto.StandardCardDto;

import java.util.List;

@Service
public class StandardCardService {
    public List<StandardCardDto> getStandardCardList() {
        return List.of(new StandardCardDtoBuilder().withName("Furrball McMuffin").withHero(true).build(),
                new StandardCardDtoBuilder().withName("Sir Pounce-a-lot").withHero(true).build(),
                new StandardCardDtoBuilder().withName("Captain Fluffernutter").withHero(true).build(),
                new StandardCardDtoBuilder().withName("Purrito").withHero(true).build(),
                new StandardCardDtoBuilder().withName("Whiskerface Von Scratchington").withHero(true).build(),
                new StandardCardDtoBuilder().withName("Furrball Thunderpaws").withHero(true).build());
    }
}
