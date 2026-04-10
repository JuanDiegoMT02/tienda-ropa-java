/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author john2
 */
public class Venta {
    private int id;
    private Cliente cliente;
    private List<DetalleVenta> detalles;

    public Venta() {
    }

    public Venta(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
    
    public void agregarDetalle(DetalleVenta detalle) {
    detalles.add(detalle);
    }
    
    public double calcularTotal() {
        double total = 0;

        for (DetalleVenta d : detalles) {
            total += d.getSubtotal();
    }

    return total;
    }
}
