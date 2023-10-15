package com.example.scanqr.repository;

import com.example.scanqr.entity.SuperProducto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperProductoRepository extends JpaRepository<SuperProducto, Integer> {

  List<SuperProducto> findSuperProductoBySupermercadoId(int id);
}
