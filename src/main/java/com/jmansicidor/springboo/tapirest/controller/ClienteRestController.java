package com.jmansicidor.springboo.tapirest.controller;

import com.jmansicidor.springboo.tapirest.model.Cliente;
import com.jmansicidor.springboo.tapirest.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200"}) //conexio a angular
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService IclienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return (List<Cliente>) IclienteService.findAll();

    }

    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable Long id){
        return IclienteService.findBy(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente){
        return IclienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente,@PathVariable Long id){
        Cliente clinteActual = IclienteService.findBy(id);
        clinteActual.setApellido(cliente.getApellido());
        clinteActual.setNombre(cliente.getNombre());
        clinteActual.setEdad(cliente.getEdad());
        clinteActual.setEmail(cliente.getEmail());

        return IclienteService.save(clinteActual);

    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        IclienteService.delete(id);
    }

}
