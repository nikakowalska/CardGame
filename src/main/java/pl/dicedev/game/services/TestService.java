package pl.dicedev.game.services;

import org.springframework.stereotype.Service;
import pl.dicedev.game.clients.UUIDClient;

@Service
public class TestService {

    private UUIDClient uuidClient;

    public TestService(UUIDClient uuidClient) {
        this.uuidClient = uuidClient;
    }

    public String getString() {
        return "Alamakota";
    }

    public String getHeaderRequest(final String language, final String myHeader) {
        return language + myHeader;
    }

    public String getUUID() {
        return uuidClient.getUUID();
    }

}
