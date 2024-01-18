package pl.dicedev.game.services;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    //klasy konfiguracyjne
    //nie wystawia endpoin
    //tworzy instancje klay czyli new testService
    //doda klase do spisu klas dostepny
    public String getString() {
        return "Alamakota";
    }

    public String getHeaderRequest(final String language, final String myHeader) {

        return language + myHeader;
    }
}
