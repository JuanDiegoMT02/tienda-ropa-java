/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Producto;
import model.Venta;
/**
 *
 * @author john2
 */
public interface IVentaService {
    
    void registrarVenta(Venta venta);

    List<Venta> getListaVentas();

    Venta buscarVentaPorId(int idVenta);

    void eliminarVenta(int idVenta);

    void agregarProductoAVenta(
        int idVenta,
        Producto producto,
        int cantidad
    );
}
