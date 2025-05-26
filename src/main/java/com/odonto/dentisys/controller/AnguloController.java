package com.odonto.dentisys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odonto.dentisys.model.Angulo;
import com.odonto.dentisys.service.AnguloService;

@RestController
@RequestMapping("/api/angulos")
public class AnguloController {

    @Autowired
    private AnguloService anguloService;

    @GetMapping
    public ResponseEntity<List<Angulo>> getAllAngulos() {
        return ResponseEntity.ok(anguloService.findAll());
    }

    @GetMapping("/ultimo")
    public ResponseEntity<Angulo> getUltimoAngulo() {
        return ResponseEntity.ok(anguloService.findLast());
    }

    @PostMapping
    public ResponseEntity<Angulo> createAngulo(@RequestBody Angulo angulo) {
        return ResponseEntity.ok(anguloService.save(angulo));
    }
}