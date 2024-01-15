package pl.dicedev.game.dto;


import pl.dicedev.game.Utils.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuListDto {
    private List<MenuDto> menuOptions;



    public List<MenuDto> getMenuOptions() {
        return menuOptions;
    }

    public void setMenuOptions(List<MenuDto> menuOptions) {
        this.menuOptions = menuOptions;
    }


}