/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Cliente;

/**
 *
 * @author john2
 */
public interface IClienteService {
     void agregarCliente(Cliente cliente);

    List<Cliente> obtenerClientes();

    Cliente buscarCliente(int id);

    void eliminarCliente(int id);

    void actualizarCliente(
        int id,
        String nombre,
        String telefono
    );
    
}
