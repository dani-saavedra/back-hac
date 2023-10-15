package com.example.scanqr.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

  private String nombre;
  private String categoria;
  private String supermercado;
  private Integer precio;
  private String marca;
}
