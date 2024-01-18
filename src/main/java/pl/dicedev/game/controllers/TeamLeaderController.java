package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.dto.ElementsDto;
import pl.dicedev.game.dto.TeamLeaderDto;

import java.util.List;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_ALL;
import static pl.dicedev.game.controllers.URINames.ENDPOINT_TEAM_LEADER;

@RestController(ENDPOINT_TEAM_LEADER)
public class TeamLeaderController {

    @GetMapping(ENDPOINT_ALL)
    public List<TeamLeaderDto> getAllTeamLeaders() {
        return List.of(
                new TeamLeaderDto("b261ee52-a293-4d95-9b69-f458ccf11f55", "Harry Potter", ElementsDto.LIGHTNING, false)
        );
    }

}
