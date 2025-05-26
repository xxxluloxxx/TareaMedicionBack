package com.odonto.dentisys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odonto.dentisys.model.Emg;
import com.odonto.dentisys.service.EmgService;

@RestController
@RequestMapping("/api/emg")
public class EmgController {

    @Autowired
    private EmgService emgService;

    @GetMapping
    public ResponseEntity<List<Emg>> getAllEmg() {
        return ResponseEntity.ok(emgService.findAll());
    }

    @PostMapping
    public ResponseEntity<Emg> createEmg(@RequestBody Emg emg) {
        return ResponseEntity.ok(emgService.save(emg));
    }
}