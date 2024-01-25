package pl.dicedev.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import pl.dicedev.game.services.TestService;

import java.util.List;

import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "s1", method = RequestMethod.GET)
    public String getString1() {
        return "s1";
    }


    @GetMapping("s2")
    public String getString2() {
        return "s2";
    }

    @GetMapping("requestparam")
    public String getStringPathParam(
            @RequestParam("pies") String pies,
            @RequestParam(value = "kotki", required = false) List<String> kotki //rozdziela sie do tablicy poniewaz jest lista,
    ) {
        return "URI requestparam?pies=" + pies + "&kotki=" + kotki;
    }

    @GetMapping("requestparam/map")
    public String getStringPathParamMap(
            @RequestParam Map<String, String> paramMap
    ) {
        return "URI requestparam/map?" + paramMap;
    }

    @GetMapping("requestheader")
    public String getStringH(
            @RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String language,
            @RequestHeader("MyHeader") String myHeader
    ) {
        return testService.getHeaderRequest(language, myHeader);
    }

    @GetMapping("String")
    public String getString() {
        return testService.getString();
    }

}
