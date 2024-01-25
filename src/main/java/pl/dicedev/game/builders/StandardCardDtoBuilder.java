package pl.dicedev.game.builders;

import pl.dicedev.game.dto.FightStyleDto;
import pl.dicedev.game.dto.StandardCardDto;
import pl.dicedev.game.dto.WeaponDto;

public class StandardCardDtoBuilder {
    private String name;
    private String id;
    private boolean onGraveyard;
    private boolean hero;
    private boolean item;
    private int actionPoints;
    private WeaponDto weaponAttack;
    private FightStyleDto heroFightStyle;

    public StandardCardDtoBuilder() {
    }

    public static StandardCardDtoBuilder builder() {
        return new StandardCardDtoBuilder();
    }

    public StandardCardDto build() {
        return new StandardCardDto(this.name, this.id, this.onGraveyard, this.hero, this.item, this.actionPoints, this.weaponAttack, this.heroFightStyle);
    }

    public StandardCardDtoBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public StandardCardDtoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public StandardCardDtoBuilder withOnGraveyard(boolean onGraveyard) {
        this.onGraveyard = onGraveyard;
        return this;
    }

    public StandardCardDtoBuilder withHero(boolean hero) {
        this.hero = hero;
        return this;
    }

    public StandardCardDtoBuilder withItem(boolean item) {
        this.item = item;
        return this;
    }

    public StandardCardDtoBuilder withActionPoints(int actionPoints) {
        this.actionPoints = actionPoints;
        return this;
    }

    public StandardCardDtoBuilder withWeaponAttack(WeaponDto weaponAttack) {
        this.weaponAttack = weaponAttack;
        return this;
    }

    public StandardCardDtoBuilder withHeroFightStyle(FightStyleDto heroFightStyle) {
        this.heroFightStyle = heroFightStyle;
        return this;
    }
}
