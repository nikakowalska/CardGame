package pl.dicedev.game.services;

import org.springframework.stereotype.Service;
import pl.dicedev.game.builders.PlayerDtoBuilder;
import pl.dicedev.game.dto.PlayerDto;

@Service
public class PlayerService {
    PlayerDto player1 = new PlayerDtoBuilder().withId("111").withScoreValue(17).build();
    PlayerDto player2 = new PlayerDtoBuilder().withId("112").withScoreValue(20).build();

    public String getPlayer1id() {
        return player1.getId();
    }

    public String getPlayer1scoreValue() {
        return String.valueOf(player1.getScoreValue());
    }
        public String getPlayer2id() {
            return player2.getId();
        }
        public String getPlayer2scoreValue() {
            return String.valueOf(player2.getScoreValue());
        }
    }
