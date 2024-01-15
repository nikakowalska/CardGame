package pl.dicedev.game.dto;

import pl.dicedev.game.Adnotations.MinimumListSize;

import java.util.List;

public class PlayerDto {

    private TeamLeaderDto teamLeaderDto;
    @MinimumListSize(min = 5)
    private List<StandardCardDto> hand;
    @MinimumListSize(min = 1)
    private List<StandardCardDto> table;
    private int scoreValue;


    public TeamLeaderDto getTeamLeaderDto() {
        return teamLeaderDto;
    }

    public void setTeamLeaderDto(final TeamLeaderDto teamLeaderDto) {
        this.teamLeaderDto = teamLeaderDto;
    }


    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(final int scoreValue) {
        int currentValue = this.scoreValue;
        this.scoreValue = currentValue + scoreValue;
    }

    public PlayerDto(final TeamLeaderDto teamLeaderDto, final List<StandardCardDto> hand, final List<StandardCardDto> table, final int scoreValue) {
        this.teamLeaderDto = teamLeaderDto;
        this.hand = hand;
        this.table = table;
        this.scoreValue = scoreValue;
    }


    public List<StandardCardDto> getTable() {
        return table;
    }

    public void setTable(final List<StandardCardDto> table) {
        this.table = table;
    }

    public List<StandardCardDto> getHand() {
        return hand;
    }

    public void setHand(final List<StandardCardDto> hand) {
        this.hand = hand;
    }
}

