package pl.dicedev.game.builders;

import pl.dicedev.game.adnotations.MinimumListSize;
import pl.dicedev.game.dto.PlayerDto;
import pl.dicedev.game.dto.StandardCardDto;
import pl.dicedev.game.dto.TeamLeaderDto;

import java.util.List;

public class PlayerDtoBuilder {
    private String id;
    private String name;
    private TeamLeaderDto teamLeaderDto;
    @MinimumListSize(min = 5)
    private List<StandardCardDto> hand;
    @MinimumListSize(min = 1)
    private List<StandardCardDto> table;
    private int scoreValue;

    public PlayerDtoBuilder() {
    }

    public static PlayerDtoBuilder builder() {
        return new PlayerDtoBuilder();
    }

    public PlayerDto build() {
        return new PlayerDto(this.id, this.name, this.teamLeaderDto, this.hand, this.table, this.scoreValue);
    }

    public PlayerDtoBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public PlayerDtoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PlayerDtoBuilder withTeamLeaderDto(TeamLeaderDto teamLeaderDto) {
        this.teamLeaderDto = teamLeaderDto;
        return this;
    }

    public PlayerDtoBuilder withHand(List<StandardCardDto> hand) {
        this.hand = hand;
        return this;
    }

    public PlayerDtoBuilder withTable(List<StandardCardDto> table) {
        this.table = table;
        return this;
    }

    public PlayerDtoBuilder withScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
        return this;
    }
}
