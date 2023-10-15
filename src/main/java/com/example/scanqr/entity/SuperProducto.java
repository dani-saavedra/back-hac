package com.example.scanqr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class SuperProducto {

  @Id
  private int id;
  @ManyToOne
  private Producto producto;
  @ManyToOne
  private Supermercado supermercado;
  @Column
  private int precio;
}
