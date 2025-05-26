package com.odonto.dentisys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.odonto.dentisys.model.Emg;
import com.odonto.dentisys.repository.EmgRepository;

@Service
public class EmgService {

    @Autowired
    private EmgRepository emgRepository;

    @Transactional(readOnly = true)
    public List<Emg> findAll() {
        return emgRepository.findTop20ByOrderByIdDesc();
    }

    @Transactional
    public Emg save(Emg emg) {
        return emgRepository.save(emg);
    }
}