package pl.dicedev.game.builders;

import pl.dicedev.game.dto.ElementsDto;
import pl.dicedev.game.dto.TeamLeaderDto;

public class TeamLeaderDtoBuilder {
    private String id;
    private String name;
    public boolean extraThrow;
    private ElementsDto boostElement;

    public TeamLeaderDtoBuilder() {
    }

    public static TeamLeaderDtoBuilder builder() {
        return new TeamLeaderDtoBuilder();
    }

    public TeamLeaderDto build() {
        return new TeamLeaderDto(this.id, this.name, this.boostElement, this.extraThrow);
    }

    public TeamLeaderDtoBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public TeamLeaderDtoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TeamLeaderDtoBuilder withBoostElement(ElementsDto boostElement) {
        this.boostElement = boostElement;
        return this;
    }

    public TeamLeaderDtoBuilder withExtraThrow(boolean extraThrow) {
        this.extraThrow = extraThrow;
        return this;
    }
}
