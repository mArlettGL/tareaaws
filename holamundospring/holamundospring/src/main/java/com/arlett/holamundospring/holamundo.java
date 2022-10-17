package com.arlett.holamundospring;
import org.Springframework.web.bind.annotation.RequestMapping;
import org.Springframework.web.bind.annotation.RestController;

@RestController
public class holamundo {
    @RequestMapping("/")
    public String hola(){
        return "Hola Mundo";
    }
}