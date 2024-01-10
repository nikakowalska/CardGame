package pl.dicedev.game.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.dicedev.game.dto.TestDto;

@RestController
public class TestController {

    @RequestMapping(value = "s1",method = RequestMethod.GET)
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
}
