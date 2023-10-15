package com.example.scanqr.controller;

import com.example.scanqr.controller.dto.ProductoDTO;
import com.example.scanqr.entity.Categoria;
import com.example.scanqr.entity.Producto;
import com.example.scanqr.repository.CategoriaRepository;
import com.example.scanqr.repository.ProductoRepository;
import com.example.scanqr.repository.SuperProductoRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

  private final CategoriaRepository categoriaRepository;
  private final SuperProductoRepository superProductoRepository;

  private final ProductoRepository productoRepository;

  public ProductoController(CategoriaRepository categoriaRepository,
      SuperProductoRepository superProductoRepository, ProductoRepository productoRepository) {
    this.categoriaRepository = categoriaRepository;
    this.superProductoRepository = superProductoRepository;
    this.productoRepository = productoRepository;
  }

  @GetMapping("/")
  public String defaults() {
    return "";
  }

  @GetMapping("/categorias")
  public List<Categoria> categoria() {
    return categoriaRepository.findAll();
  }

  @GetMapping(path = "/tienda/{tienda}/productos")
  public List<ProductoDTO> productosPorTienda(@PathVariable int tienda) {
    return superProductoRepository.findSuperProductoBySupermercadoId(tienda).stream()
        .map(superProducto -> new ProductoDTO(superProducto.getProducto().getNombre(),
            superProducto.getProducto().getCategoria().getNombre(),
            superProducto.getSupermercado().getNombre(),
            superProducto.getPrecio(),
            superProducto.getProducto().getMarca()))
        .toList();
  }

  @GetMapping(path = "/categoria/{categoria}/productos")
  public List<ProductoDTO> productoPorCategoria(@PathVariable int categoria) {
    return productoRepository.findByCategoriaId(categoria).stream()
        .map(producto -> new ProductoDTO(producto.getNombre(),
            producto.getCategoria().getNombre(),
            null, null, producto.getMarca()
        )).toList();
  }

  @GetMapping(path = "/producto")
  public List<ProductoDTO> filtrarProductos(@RequestParam String nombre) {
    return productoRepository.findByNombreContains(nombre).stream()
        .map(
            producto -> new ProductoDTO(producto.getNombre(), null, null, null, producto.getMarca()))
        .toList();
  }


}
