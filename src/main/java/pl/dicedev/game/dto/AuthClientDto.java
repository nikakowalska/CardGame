package pl.dicedev.game.dto;

import java.util.Objects;

public class AuthClientDto {
            private String token;

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final AuthClientDto that = (AuthClientDto) o;

        return Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return token != null ? token.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AuthClientDto{" +
                "token='" + token + '\'' +
                '}';
    }
}
