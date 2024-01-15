package pl.dicedev.game.dto;

public class MenuDto {
    private String entryLetter; //letter
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final MenuDto menuDto = (MenuDto) o;

        if (!entryLetter.equals(menuDto.entryLetter)) return false;
        return command.equals(menuDto.command);
    }

    @Override
    public int hashCode() {
        int result = entryLetter.hashCode();
        result = 31 * result + command.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "entryLetter='" + entryLetter + '\'' +
                ", command='" + command + '\'' +
                '}';
    }
}
