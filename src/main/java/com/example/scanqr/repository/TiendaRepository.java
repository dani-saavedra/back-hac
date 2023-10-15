package com.example.scanqr.repository;


import com.example.scanqr.entity.Supermercado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<Supermercado, Integer> {

}
