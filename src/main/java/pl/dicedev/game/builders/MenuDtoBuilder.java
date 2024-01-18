package pl.dicedev.game.builders;

import pl.dicedev.game.dto.MenuDto;

public class MenuDtoBuilder {

    private String letter;
    private String command;
    private String uri;

    public MenuDtoBuilder() {
    }

    public static MenuDtoBuilder builder() {
        return new MenuDtoBuilder();
    }

    public MenuDto build() {
        return new MenuDto(this.letter, this.command, this.uri);
    }

    public MenuDtoBuilder withLetter(String letter) {
        this.letter = letter;
        return this;
    }

    public MenuDtoBuilder withCommand(String command) {
        this.command = command;
        return this;
    }

    public MenuDtoBuilder withUri(String uri) {
        this.uri = uri;
        return this;
    }
}
