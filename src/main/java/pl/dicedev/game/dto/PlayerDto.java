package pl.dicedev.game.dto;

import pl.dicedev.game.adnotations.MinimumListSize;

import java.util.List;

public class PlayerDto {
    private String id;
    private String name;
    private TeamLeaderDto teamLeaderDto;
    @MinimumListSize(min = 5)
    private List<StandardCardDto> hand;
    @MinimumListSize(min = 1)
    private List<StandardCardDto> table;
    private int scoreValue;
    private List<PlayerDto> listOfPlayers;

    public PlayerDto(final String id, final String name, final TeamLeaderDto teamLeaderDto, final List<StandardCardDto> hand, final List<StandardCardDto> table, final int scoreValue, final List<PlayerDto> listOfPlayers) {
        this.id = id;
        this.name = name;
        this.teamLeaderDto = teamLeaderDto;
        this.hand = hand;
        this.table = table;
        this.scoreValue = scoreValue;
        this.listOfPlayers = listOfPlayers;
    }

    public List<PlayerDto> getListOfPlayers() {
        return listOfPlayers;
    }

    public void setListOfPlayers(final List<PlayerDto> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

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


    @Override
    public String toString() {
        return "PlayerDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teamLeaderDto=" + teamLeaderDto +
                ", hand=" + hand +
                ", table=" + table +
                ", scoreValue=" + scoreValue +
                ", listOfPlayers=" + listOfPlayers +
                '}';
    }
}

