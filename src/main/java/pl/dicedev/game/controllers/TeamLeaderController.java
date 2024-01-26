package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.dto.TeamLeaderDto;
import pl.dicedev.game.services.TeamLeaderService;

import java.util.List;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_ALL;
import static pl.dicedev.game.controllers.URINames.ENDPOINT_TEAM_LEADER;

@RestController
@RequestMapping(ENDPOINT_TEAM_LEADER)
public class TeamLeaderController {
    @Autowired
    private TeamLeaderService teamLeaderService;
    @GetMapping(ENDPOINT_ALL)
    public List<TeamLeaderDto> getAllTeamLeaders() {
        return teamLeaderService.getTeamLeadersList();
    }
}
