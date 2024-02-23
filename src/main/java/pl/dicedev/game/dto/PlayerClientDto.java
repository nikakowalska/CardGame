package pl.dicedev.game.dto;

import java.util.Objects;

public class PlayerClientDto {
    private String playerData;

    public PlayerClientDto(final String playerData) {
        this.playerData = playerData;
    }

    public String getPlayerData() {
        return playerData;
    }

    public void setPlayerData(final String playerData) {
        this.playerData = playerData;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final PlayerClientDto that = (PlayerClientDto) o;

        return Objects.equals(playerData, that.playerData);
    }

    @Override
    public int hashCode() {
        return playerData != null ? playerData.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "PlayerClientDto{" +
                "playerData='" + playerData + '\'' +
                '}';
    }
}
