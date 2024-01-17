package pl.dicedev.game.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private String id;
    private String name;
    private String password;
    private List<String> listOfPlayers;

    public UserDto(final String name, final String password, final List<String> listOfPlayers) {
        this.name = name;
        this.password = password;
        this.listOfPlayers = listOfPlayers;
    }

    public UserDto() {

    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public List<String> getListOfPlayers() {
        return listOfPlayers;
    }

    public void setListOfPlayers(final List<String> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", listOfPlayers=" + listOfPlayers +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final UserDto userDto = (UserDto) o;

        if (!id.equals(userDto.id)) return false;
        if (!name.equals(userDto.name)) return false;
        if (!password.equals(userDto.password)) return false;
        return listOfPlayers.equals(userDto.listOfPlayers);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + listOfPlayers.hashCode();
        return result;
    }
}
