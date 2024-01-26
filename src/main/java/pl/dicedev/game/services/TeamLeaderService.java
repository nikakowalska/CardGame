package pl.dicedev.game.services;

import org.springframework.stereotype.Service;
import pl.dicedev.game.dto.BasicTeamLeaderDto;


import java.util.List;

@Service
public class TeamLeaderService {

    public List<BasicTeamLeaderDto> getTLList() {
        return List.of(new BasicTeamLeaderDto("1", "HarryPotter"),
                new BasicTeamLeaderDto("2", "HardCandy"),
                new BasicTeamLeaderDto("3", "ChilliChips"),
                new BasicTeamLeaderDto("4", "Marshmallow"),
                new BasicTeamLeaderDto("5", "HotSausage"),
                new BasicTeamLeaderDto("6", "Sweet&Sour"),
                new BasicTeamLeaderDto("7", "YourMomsDinner"));
    }
}
