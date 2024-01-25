package pl.dicedev.game.services;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getString() {
        return "Alamakota";
    }

    public String getHeaderRequest(final String language, final String myHeader) {

        return language + myHeader;
    }
}
