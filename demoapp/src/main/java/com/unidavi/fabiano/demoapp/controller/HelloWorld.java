package com.unidavi.fabiano.demoapp.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {

    @GetMapping("/helloworld")
    public String imprimeHelloWorld(){
        String mensagem = "Hello World";
        return mensagem;
    }


    @GetMapping("/resultadoatividade")
    public String imprimeHelloWorld2(){
        String mensagem = "Hello World";
        return mensagem;
    }

}
