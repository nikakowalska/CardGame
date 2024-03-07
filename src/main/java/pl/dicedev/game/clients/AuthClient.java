package pl.dicedev.game.clients;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.dicedev.game.dto.AuthClientDto;
import pl.dicedev.game.dto.UserAuthDto;

@Component
public class AuthClient {
    private RestTemplate restTemplate;

    public AuthClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
//w springu jesli jest przy konstruktorze obekt w parametrze spring traktuja go jako autowired
    public String getToken() {
        return restTemplate.exchange(
                "http://localhost:8081/v1/authentication/test:test",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                String.class).getBody();
    }
//zobaczyc do testow mockito - tworzy urojone klasy
    //mockito i junit ida w parze
    public AuthClientDto getToken(String username, String password) {
        String credentials = username + ":" + password;
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public AuthClientDto getValidateToken(String username, String password) {
        String credentials = username + ":" + password;
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/validate/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }
    //head(dodatkowe parametry httpentity), body(json zamieniny na dto) i url (adres z wyszukiwarki, tu jest crud)
//adres url moze miec 2000 znakow, mozna go zapchac
    //body nie ma ograniczen, przesylam dtosy
    //moj dtos moze posiadac mniej pol do odczytu
    //json to slownik klucz wartosc
    //dtos sluzy odczytania tego slownika, tych slow ktore mnie interesuja
    //jeden dtos moze odczytywac wiecej jsonow
    //headers - informacje nie sa czescia procesu - przesyla malo danych bo odczyt jest uciazliwy
    //przesylanie body jest oplacalne czasowo
    //przeslany w headers jesyk nie jest zapisany do bazy danych i dane sa istotne podczas polaczenia
    //dodanie do koszyka jest zapisane jsonem do zapis do bazy
    public String getScope() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Sales-Manager", "40%discount");

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        restTemplate.exchange(
                "http://localhost:8081/v1/authentication/scope",
                HttpMethod.GET,
                entity,
                String.class);
        return entity.getBody();
    }

    public AuthClientDto getScopeForToken(String username, String password) {
        String credentials = username + ":" + password;
        HttpEntity<AuthClientDto> entity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/scope/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return entity.getBody();
    }

    public AuthClientDto getTokenForName(String username, String password) {
        String credentials = username + ":" + password;
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/name/" + credentials,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public AuthClientDto getTokenForId(String username, String password) {
        String token = username + ":" + password; //
        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/id/" + token,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public AuthClientDto getTokenSendBody(String username, String password) {
        UserAuthDto userAuthDto = new UserAuthDto(username, password);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
//te string sa wczesniej ustalone
        HttpEntity<UserAuthDto> entity = new HttpEntity<>(userAuthDto, httpHeaders);

        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/credentials/body",
                HttpMethod.POST,
                entity,
                AuthClientDto.class);
        return responseEntity.getBody();//łapie json od R i bierze  moj obiekt authdto i przepisze wartosci z jsona do obiektu
    }

    public AuthClientDto getTokenSendHeaders(String username, String password) {
        UserAuthDto userAuthDto = new UserAuthDto(username, password);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
        HttpEntity<UserAuthDto> entity = new HttpEntity<>(userAuthDto, httpHeaders);

        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/credentials/headers",
                HttpMethod.POST,
                entity,
                AuthClientDto.class);
        return responseEntity.getBody();
    }

    public AuthClientDto getTokenSendParams(String username, String password) {
        UserAuthDto userAuthDto = new UserAuthDto(username, password);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
        HttpEntity<UserAuthDto> entity = new HttpEntity<>(userAuthDto, httpHeaders);

        ResponseEntity<AuthClientDto> responseEntity = restTemplate.exchange(
                "http://localhost:8081/v1/authentication/credentials/{uuid}/{username}/{password}",
                HttpMethod.POST,
                entity,
                AuthClientDto.class);
        return responseEntity.getBody();
    }
}

