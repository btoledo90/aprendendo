package br.com.concrete.aprendendo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendendo")
public class AprendendoController {


    @GetMapping("/oi")
    public ResponseEntity <String> oi () {
        return new ResponseEntity<> ("{\n" +
                "\n" +
                "\"nome\": \"Bruno\",\n" +
                "\n" +
                "\"empresa\": \"Concrete\",\n" +
                "\n" +
                "\"cargo\": \"Desenvolvedor Backend\"\n" +
                "\n" +
                "}", HttpStatus.OK);
    }

    @PostMapping("/tchau")
    public String tchau() {
        return "Tchau";
    }


}
