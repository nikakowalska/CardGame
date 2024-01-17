package pl.dicedev.game.dto;

public class WeaponDto {

//    SABER(7, ElementsDto.NONE), ORB(7, ElementsDto.NONE), BOW(7, ElementsDto.NONE), DAGGER(7, ElementsDto.NONE), LIRA(7, ElementsDto.NONE), SWORD(7, ElementsDto.NONE);

    private final int weaponAttackValue;
    public final ElementsDto elementsValue;
    WeaponDto(final int weaponAttackValue, ElementsDto elementValue) {
        this.weaponAttackValue = weaponAttackValue;
        this.elementsValue = elementValue;
    }

    private int getWeaponAttackValue() {
        return weaponAttackValue;
    }

    public int comboAttack() {
        return weaponAttackValue + elementsValue.getElementValue();
    }
}
