package com.example.scanqr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Producto {

  @Id
  private int id;

  @Column
  private String nombre;

  @ManyToOne
  private Categoria categoria;

  private String marca;
}
