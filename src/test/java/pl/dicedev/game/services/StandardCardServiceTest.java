package pl.dicedev.game.services;

import org.junit.jupiter.api.Test;
import pl.dicedev.game.dto.StandardCardDto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StandardCardServiceTest {

    @Test
    void shouldReturnPlayerHandFiveCards() {

        StandardCardService standardCardService = new StandardCardService();

        List<StandardCardDto> standardCardDtos = standardCardService.getPlayerHandList();

        assertEquals(5, standardCardDtos.size(), "moj test");
    }
}