package pl.dicedev.game.dto;

public enum ElementsDto {
    WATER (3), FIRE(3), WIND(3), LIGHTNING(3), NONE (0);
    private final int elementValue;
    ElementsDto(final int i) {
        this.elementValue = i;
    }
    public int getElementValue() {
        return elementValue;
    }
    public boolean isFire(){
        return this==FIRE;
    }
}
