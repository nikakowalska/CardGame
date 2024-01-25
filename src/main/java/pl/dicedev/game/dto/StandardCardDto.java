package pl.dicedev.game.dto;

import java.util.List;

public class StandardCardDto {
    private String name;
    private String id;
    private boolean onGraveyard;
    private boolean hero;
    private boolean item;
    private int actionPoints;
    private WeaponDto weaponAttack;
    private FightStyleDto heroFightStyle;
    private List<StandardCardDto> standardCardList;

    public StandardCardDto(final String name, final String id, final boolean onGraveyard, final boolean hero, final boolean item, final int actionPoints, final WeaponDto weaponAttack, final FightStyleDto heroFightStyle) {
        this.name = name;
        this.id = id;
        this.onGraveyard = onGraveyard;
        this.hero = hero;
        this.item = item;
        this.actionPoints = actionPoints;
        this.weaponAttack = weaponAttack;
        this.heroFightStyle = heroFightStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public boolean isOnGraveyard() {
        return onGraveyard;
    }

    public void setOnGraveyard(final boolean onGraveyard) {
        this.onGraveyard = onGraveyard;
    }

    public boolean isHero() {
        return hero;
    }

    public void setHero(final boolean hero) {
        this.hero = hero;
    }

    public boolean isItem() {
        return item;
    }

    public void setItem(final boolean item) {
        this.item = item;
    }

    public int getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(final int actionPoints) {
        this.actionPoints = actionPoints;
    }

    public WeaponDto getWeaponAttack() {
        return weaponAttack;
    }

    public void setWeaponAttack(final WeaponDto weaponAttack) {
        this.weaponAttack = weaponAttack;
    }

    public FightStyleDto getHeroFightStyleDto() {
        return heroFightStyle;
    }

    public void setHeroFightStyle(final FightStyleDto heroFightStyle) {
        this.heroFightStyle = heroFightStyle;
    }

    @Override
    public String toString() {
        return "StandardCardDto{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", onGraveyard=" + onGraveyard +
                ", hero=" + hero +
                ", item=" + item +
                ", actionPoints=" + actionPoints +
                ", weaponAttack=" + weaponAttack +
                ", heroFightStyle=" + heroFightStyle +
                ", standardCardList=" + standardCardList +
                '}';
    }
}
