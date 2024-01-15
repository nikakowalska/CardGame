package pl.dicedev.game.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.dto.TestDto;
@RequestMapping("Ala")
@RestController
public class TestController {

    @RequestMapping(value = "s1",method = RequestMethod.GET)
    //@ResponseBody gdy nie wpiszesz Restcontroller, a controller
    public TestDto getString1(){
        TestDto testDto = new TestDto();
        testDto.setName("Ala");
        testDto.setAge(18);
        return testDto;
    }
    //TE DWIE METODY DZIALAJA TAK SAMO, wysylaja cos w swiat, sa odpo na żądanie
    @GetMapping("s2")
    public String getString2(){
        return "s2";
    }
    //tomcat uruchamia aplikacje i nia zarzadza, kiedys z takiej aplikacji trzeba bylo zrobic var i lokalnie miec var, teraz jest to w springu
    //teraz aplikacje sie dokeryzuje i ona startuje w tym dokerze
    //localhost8080/s1 to żądanie na get (na gecie) w przegladarkach, to domyslne zachowanie przegladarki, jednak
    //niekoniecznie wykonywac żądania na przegladarce ,

    @PostMapping("s3/{id}")
    public String getPost(@PathVariable("id") String name){return "s3"+name;}
    //pobranie przez dev wyboru uzytkownika w aplikacji
    @PostMapping("s4/{name}/{b}")//pamietac ze jesli cos ma byc zmienna musi byc w nawiasie klamrowym
    public String getPost2(@PathVariable String name, @PathVariable String b){return "s4"+name+b;}
    //pathvavariable ma zadanie sprawdzic w mappingu adresu url, ktory przychodzi, znaleznie miejsca name,
    //nazwa w nawiasach klamrowych musi odpowiadac nazwie zmiennej
}
//nazwa s4 moze byc dluga
