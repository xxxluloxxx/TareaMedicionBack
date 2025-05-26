package com.odonto.dentisys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.odonto.dentisys.model.Angulo;
import com.odonto.dentisys.repository.AnguloRepository;

@Service
public class AnguloService {

    @Autowired
    private AnguloRepository anguloRepository;

    @Transactional(readOnly = true)
    public List<Angulo> findAll() {
        return anguloRepository.findTop20ByOrderByIdDesc();
    }

    @Transactional(readOnly = true)
    public Angulo findLast() {
        return anguloRepository.findTopByOrderByIdDesc();
    }

    @Transactional
    public Angulo save(Angulo angulo) {
        return anguloRepository.save(angulo);
    }
}