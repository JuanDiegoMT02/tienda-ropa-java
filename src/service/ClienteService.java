/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author john2
 */
public class ClienteService {
    private List<Cliente> clientes;
    
    public ClienteService() {
        clientes = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public List<Cliente> obtenerClientes() {
        return clientes;
    }
    
    public Cliente buscarCliente(int id) {
    for (Cliente c : clientes) {
        if (c.getId() == id) {
            return c;
        }
    }
    return null;
    }
    
    public void eliminarCliente(int id) {
        clientes.removeIf(c -> c.getId() == id);
    }
    
    public void actualizarCliente(int id, String nombre, String telefono) {
        Cliente c = buscarCliente(id);

    if (c != null) {
        c.setNombre(nombre);
        c.setTelefono(telefono);
    }
}
}
