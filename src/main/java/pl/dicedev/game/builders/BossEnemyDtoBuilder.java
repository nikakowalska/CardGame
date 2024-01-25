package pl.dicedev.game.builders;

import pl.dicedev.game.dto.BossEnemyDto;

public class BossEnemyDtoBuilder {
    private String id;
    private String name;
    private int attackPlayer;
    private int defeated;

    public BossEnemyDtoBuilder() {
    }

    public static BossEnemyDtoBuilder builder() {
        return new BossEnemyDtoBuilder();
    }

    public BossEnemyDto build() {
        return new BossEnemyDto(this.id, this.name, this.attackPlayer, this.defeated);
    }

    public BossEnemyDtoBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public BossEnemyDtoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BossEnemyDtoBuilder withAttackPlayer(int attackPlayer) {
        this.attackPlayer = attackPlayer;
        return this;
    }

    public BossEnemyDtoBuilder withDefeated(int defeated) {
        this.defeated = defeated;
        return this;
    }
}
