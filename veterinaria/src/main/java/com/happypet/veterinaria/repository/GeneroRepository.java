package com.happypet.veterinaria.repository;

import com.happypet.veterinaria.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
}
