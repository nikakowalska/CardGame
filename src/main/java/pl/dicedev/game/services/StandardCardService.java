package pl.dicedev.game.services;

import org.springframework.stereotype.Service;
import pl.dicedev.game.builders.StandardCardDtoBuilder;
import pl.dicedev.game.dto.StandardCardDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public List<StandardCardDto> getPlayerHandList() {
        List<StandardCardDto> tableCards = new StandardCardService().getStandardCardList();
        List<StandardCardDto> playerHand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int a = random.nextInt(tableCards.size() - 1);
            StandardCardDto card = tableCards.get(a);
            if (playerHand.contains(card)) {
                i--;
                continue;
            }
            playerHand.add(card);
        }
        return playerHand;
    }
}