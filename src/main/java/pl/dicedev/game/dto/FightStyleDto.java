package pl.dicedev.game.dto;

public enum FightStyleDto {
    WARRIOR(5), WIZARD(5), HUNTER(5), SENTINEL(5), THIEF(5), BARD(5);

    private final int heroFightStyle;

    FightStyleDto(final int f) {
        this.heroFightStyle = f;
    }

    private int getHeroFightStyle() {
        return heroFightStyle;
    }

    public boolean warriorWithSaber() {
        return this == WARRIOR;
    }

    public boolean wizardWithOrb() {
        return this == WIZARD;
    }

    public boolean hunterWithBow() {
        return this == HUNTER;
    }

    public boolean sentinelWithSword() {
        return this == SENTINEL;
    }

    public boolean thiefWithDagger() {
        return this == THIEF;
    }

    public boolean bardWithLira() {
        return this == BARD;
    }
}
