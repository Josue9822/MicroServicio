package com.idat.Microservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Microservicio.model.Aula;



@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer>{

}
