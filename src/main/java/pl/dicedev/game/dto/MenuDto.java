package pl.dicedev.game.dto;

public class MenuDto {
    private String letter;
    private String command;

    public MenuDto(final String letter, final String command) {
        this.letter = letter;
        this.command = command;
    }

    public String getLetter() {
        return letter;
    }

    public String getCommand() {
        return command;
    }

    public void setLetter(final String Letter) {
        this.letter = letter;
    }

    public void setCommand(final String command) {
        this.command = command;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final MenuDto menuDto = (MenuDto) o;

        if (!letter.equals(menuDto.letter)) return false;
        return command.equals(menuDto.command);
    }

    @Override
    public int hashCode() {
        int result = letter.hashCode();
        result = 31 * result + command.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "entryLetter='" + letter + '\'' +
                ", command='" + command + '\'' +
                '}';
    }
}
