/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Venta;
import java.util.ArrayList;
import java.util.List;
import model.DetalleVenta;
import model.Producto;

/**
 *
 * @author john2
 */
public class VentaService implements IVentaService {
    
    private List<Venta> listaVentas;

    public VentaService() {
        listaVentas = new ArrayList<>();
    }
    
    public void registrarVenta(Venta nuevaVenta) {
        listaVentas.add(nuevaVenta);
    }
    
    public List<Venta> getListaVentas() {
        return listaVentas;
    }
    
    public Venta buscarVentaPorId(int idVenta) {
    for (Venta v : listaVentas) {
        if (v.getId() == idVenta) {
            return v;
        }
    }
    return null;
    }
    
    public void eliminarVenta(int idVenta) {
        listaVentas.removeIf(v -> v.getId() == idVenta);
    }
    
    public void agregarProductoAVenta(int idVenta, Producto producto, int cantidad) {

    Venta venta = buscarVentaPorId(idVenta);

    if (venta != null) {

        DetalleVenta nuevoDetalle = new DetalleVenta(producto, cantidad);

        venta.agregarDetalle(nuevoDetalle);
    }
}
}
