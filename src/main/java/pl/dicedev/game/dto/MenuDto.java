package pl.dicedev.game.dto;

public class MenuDto {
    private String entryLetter;
    private String command;

    public MenuDto(final String entryLetter, final String command) {
        this.entryLetter = entryLetter;
        this.command = command;
    }

    public String getEntryLetter() {
        return entryLetter;
    }

    public String getCommand() {
        return command;
    }

    public void setEntryLetter(final String entryLetter) {
        this.entryLetter = entryLetter;
    }

    public void setCommand(final String command) {
        this.command = command;
    }
}
