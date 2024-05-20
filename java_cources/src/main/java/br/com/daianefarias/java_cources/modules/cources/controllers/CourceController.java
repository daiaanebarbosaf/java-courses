package br.com.daianefarias.java_cources.modules.cources.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daianefarias.java_cources.modules.cources.CourceEntity;

@RestController
@RequestMapping("/cource")
public class CourceController {

    @PostMapping("/")
    public void create(@RequestBody CourceEntity courceEntity){
        System.out.println("Curso");
        System.out.println(courceEntity.getName());
    }
}
