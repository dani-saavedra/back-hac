package com.example.scanqr.controller;

import com.example.scanqr.entity.Categoria;
import com.example.scanqr.entity.Supermercado;
import com.example.scanqr.repository.CategoriaRepository;
import com.example.scanqr.repository.TiendaRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiendaController {

  private final TiendaRepository tiendaRepository;

  public TiendaController(TiendaRepository tiendaRepository) {
    this.tiendaRepository = tiendaRepository;
  }

  @GetMapping("/supermercados")
  public List<Supermercado> obtenerSuperMercados() {
    return tiendaRepository.findAll();
  }
}
