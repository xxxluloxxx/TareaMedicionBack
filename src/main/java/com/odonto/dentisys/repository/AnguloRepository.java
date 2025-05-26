package com.odonto.dentisys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odonto.dentisys.model.Angulo;

@Repository
public interface AnguloRepository extends JpaRepository<Angulo, Long> {
    Angulo findTopByOrderByIdDesc();

    List<Angulo> findTop20ByOrderByIdDesc();
}