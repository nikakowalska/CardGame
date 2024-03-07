package pl.dicedev.game.services;

import org.junit.jupiter.api.Test;
import pl.dicedev.game.dto.StandardCardDto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StandardCardServiceTest {//moze byc integrationTest

    @Test //gdy polaczone do biblioreki test sparametryzowany, doczytac
    void shouldReturnPlayerHandFiveCards() {//nazwa testu powinna mowic co robi
        //czesc pierwsza given , zawsze pisze sie te kom, - kryteria poczatkowe
        StandardCardService standardCardService = new StandardCardService();
        //druga when
        List<StandardCardDto> standardCardDtos = standardCardService.getPlayerHandList();

        //trzecia then
        assertEquals(5,standardCardDtos.size(),"moj test");
    }
}//adnotacja before i before all
//test integracyjny ma za zadnie przyjac jakies dane i imituje zapis do bazy danych,
//np przerzucenie dto do controller, sevice po zapis do bd
//test containers w testach integracyjnych - potrzebny docker
//nie zawsze istnieje mozliwosc uruchomienia dockera
// test integr dlugo sie odpalaja
//test end to end - dla testrow, sprawdzaja kilka systemów
//piramida testow, rozek i klepsydra(ktorych testow powinno byc najwiecej) i chmura