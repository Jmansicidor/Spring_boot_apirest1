package com.jmansicidor.springboo.tapirest.repository;

import com.jmansicidor.springboo.tapirest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
