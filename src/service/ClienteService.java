/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;
import service.JsonUtil;
import java.util.Arrays;


/**
 *
 * @author john2
 */
public class ClienteService implements IClienteService {
    private List<Cliente> clientes;
    
    private final String ARCHIVO = "clientes.json";
    
    public ClienteService() {
        Cliente[] datos =
        JsonUtil.cargar(ARCHIVO, Cliente[].class);

    if (datos != null) {

        clientes = new ArrayList<>(
            java.util.Arrays.asList(datos)
        );

    } else {

        clientes = new ArrayList<>();
    }
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        JsonUtil.guardar(ARCHIVO, clientes);
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
        JsonUtil.guardar(ARCHIVO, clientes);
    }
    
    public void actualizarCliente(int id, String nombre, String telefono) {
        Cliente c = buscarCliente(id);
        JsonUtil.guardar(ARCHIVO, clientes);

    if (c != null) {
        c.setNombre(nombre);
        c.setTelefono(telefono);
    }
}
}
