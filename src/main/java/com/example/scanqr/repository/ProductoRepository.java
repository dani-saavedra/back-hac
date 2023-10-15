package com.example.scanqr.repository;

import com.example.scanqr.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

  List<Producto> findByCategoriaId(int idCategoria);

  List<Producto> findByNombreContains(String nombre);
}
