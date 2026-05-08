/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author john2
 */
public class ProductoService implements IProductoService {
    private List<Producto> listaProductos;
    private final String ARCHIVO = "productos.json";

    public ProductoService() {
         Producto[] datos =
        JsonUtil.cargar(ARCHIVO, Producto[].class);

    if (datos != null) {

        listaProductos = new ArrayList<>(
            java.util.Arrays.asList(datos)
        );

    } else {

        listaProductos = new ArrayList<>();
    }
    }
    
    public void guardarProducto(Producto nuevoProducto) {
        listaProductos.add(nuevoProducto);
        JsonUtil.guardar(ARCHIVO, listaProductos);
    }
    
    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public Producto buscarPorCodigo(String codigo) {
    for (Producto p : listaProductos) {
        if (p.getCodigo().equals(codigo)) {
            return p;
        }
    }
    return null;
}
    
    public void eliminarProducto(String codigo) {
        listaProductos.removeIf(p -> p.getCodigo().equals(codigo));
        JsonUtil.guardar(ARCHIVO, listaProductos);
    }
    
    public void actualizarProducto(String codigo, String nombre, String talla, String color, double precio, int stock) {

    Producto productoEncontrado = buscarPorCodigo(codigo);

    if (productoEncontrado != null) {
        productoEncontrado.setNombre(nombre);
        productoEncontrado.setTalla(talla);
        productoEncontrado.setColor(color);
        productoEncontrado.setPrecio(precio);
        productoEncontrado.setStock(stock);
    }
    JsonUtil.guardar(ARCHIVO, listaProductos);
    }
    
}

