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

    public StandardCardDtoBuilder withName() {
        this.name = name;
        return this;
    }

    public StandardCardDtoBuilder withOnGraveyard() {
        this.onGraveyard = onGraveyard;
        return this;
    }

    public StandardCardDtoBuilder withHero() {
        this.hero = hero;
        return this;
    }

    public StandardCardDtoBuilder withItem() {
        this.item = item;
        return this;
    }

    public StandardCardDtoBuilder withActionPoints() {
        this.actionPoints = actionPoints;
        return this;
    }

    public StandardCardDtoBuilder withWeaponAttack() {
        this.weaponAttack = weaponAttack;
        return this;
    }

    public StandardCardDtoBuilder withHeroFightStyle() {
        this.heroFightStyle = heroFightStyle;
        return this;
    }
}
