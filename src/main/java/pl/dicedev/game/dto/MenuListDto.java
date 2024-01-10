package pl.dicedev.game.dto;


import java.util.Arrays;
import java.util.List;

public class MenuListDto {
    private List<MenuDto> menuOptions;

    public MenuListDto(List<MenuDto> menuOptions) {
        this.menuOptions = menuOptions;
    }

    public List<MenuDto> getMenuOptions() {
        return menuOptions;
    }

    public void setMenuOptions(List<MenuDto> menuOptions) {
        this.menuOptions = menuOptions;
    }


}