package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.dto.ElementsDto;
import pl.dicedev.game.dto.TeamLeaderDto;

import java.util.List;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_ALL;
import static pl.dicedev.game.controllers.URINames.ENDPOINT_TEAM_LEADER;

@RestController
@RequestMapping(ENDPOINT_TEAM_LEADER)
public class TeamLeaderController {

    @GetMapping(ENDPOINT_ALL)
    public List<TeamLeaderDto> getAllTeamLeaders() {
        return List.of(
                new TeamLeaderDto("1", "Harry Potter", ElementsDto.LIGHTNING, false),
                new TeamLeaderDto("2", "HardCandy", ElementsDto.FIRE, false),
                new TeamLeaderDto("3", "ChilliChips", ElementsDto.LIGHTNING, false),
                new TeamLeaderDto("4", "Marshmallow", ElementsDto.WIND, false),
                new TeamLeaderDto("5", "HotSausage", ElementsDto.FIRE, false),
                new TeamLeaderDto("6", "Sweet&Sour", ElementsDto.WATER, false),
                new TeamLeaderDto("7", "YourMomsDinner", ElementsDto.FIRE, false));

    }
}