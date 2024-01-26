package com.jmansicidor.springboo.tapirest.service;

import com.jmansicidor.springboo.tapirest.model.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findBy(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
}
