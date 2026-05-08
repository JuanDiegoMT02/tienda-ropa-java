/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Producto;

/**
 *
 * @author john2
 */
public interface IProductoService {
    
    void guardarProducto(Producto producto);

    List<Producto> getListaProductos();

    Producto buscarPorCodigo(String codigo);

    void eliminarProducto(String codigo);

    void actualizarProducto(
        String codigo,
        String nombre,
        String talla,
        String color,
        double precio,
        int stock
    );
    
}
