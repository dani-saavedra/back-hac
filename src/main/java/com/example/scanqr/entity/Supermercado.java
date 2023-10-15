package com.example.scanqr.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class Supermercado {

  @Id
  @Column
  private Integer id;
  @Column
  private String nombre;
  @Column
  private String ciudad;
}
