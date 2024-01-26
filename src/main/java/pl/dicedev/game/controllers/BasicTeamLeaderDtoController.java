package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.dto.BasicTeamLeaderDto;
import pl.dicedev.game.services.TeamLeaderService;

import java.util.List;

import static pl.dicedev.game.controllers.URINames.ENDPOINT_TEAM_LEADER;

@RestController
@RequestMapping(ENDPOINT_TEAM_LEADER)
public class BasicTeamLeaderDtoController {
    @Autowired
    private TeamLeaderService teamLeaderService;

    @GetMapping("requestparam")
    public String getStringPathParam(

            @RequestParam("id") String id,
            @RequestParam(value = "team-leader", required = false) List<BasicTeamLeaderDto> teamLeader //rozdziela sie do tablicy poniewaz jest lista,
    ) {
        return "URI requestparam?id=" + id + "&teamLeader=" + teamLeaderService.getOneTLList();
    }
}
