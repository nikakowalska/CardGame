package pl.dicedev.game.services;

import org.springframework.stereotype.Service;
import pl.dicedev.game.builders.TeamLeaderDtoBuilder;
import pl.dicedev.game.dto.ElementsDto;
import pl.dicedev.game.dto.TeamLeaderDto;


import java.util.List;

@Service
public class TeamLeaderService {
    public List<TeamLeaderDto> getTeamLeadersList() {
        return List.of(new TeamLeaderDtoBuilder().withId("1").withName("HardCandy").withBoostElement(ElementsDto.WIND).withExtraThrow(false).build(),
                new TeamLeaderDtoBuilder().withId("2").withName("ChilliChips").withBoostElement(ElementsDto.FIRE).withExtraThrow(false).build(),
                new TeamLeaderDtoBuilder().withId("3").withName("Marshmallow").withBoostElement(ElementsDto.LIGHTNING).withExtraThrow(false).build(),
                new TeamLeaderDtoBuilder().withId("4").withName("HotSausage").withBoostElement(ElementsDto.WATER).withExtraThrow(false).build(),
                new TeamLeaderDtoBuilder().withId("5").withName("Sweet&Sour").withBoostElement(ElementsDto.WIND).withExtraThrow(false).build(),
                new TeamLeaderDtoBuilder().withId("6").withName("YourMomsDinner").withBoostElement(ElementsDto.LIGHTNING).withExtraThrow(true).build());
    }

    public List<TeamLeaderDto> getOneTLList() {
        return List.of(new TeamLeaderDtoBuilder().withId("1").withName("HardCandy").build(),
                new TeamLeaderDtoBuilder().withId("1").withName("HardCandy").build(),
                new TeamLeaderDtoBuilder().withId("1").withName("HardCandy").build(),
                new TeamLeaderDtoBuilder().withId("1").withName("HardCandy").build(),
                new TeamLeaderDtoBuilder().withId("1").withName("HardCandy").build(),
                new TeamLeaderDtoBuilder().withId("1").withName("HardCandy").build());
    }
}
