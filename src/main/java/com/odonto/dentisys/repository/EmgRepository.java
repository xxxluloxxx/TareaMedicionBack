package com.odonto.dentisys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odonto.dentisys.model.Emg;

@Repository
public interface EmgRepository extends JpaRepository<Emg, Long> {
    List<Emg> findTop20ByOrderByIdDesc();
}