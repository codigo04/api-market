package api.market.web.controller;

import api.market.persistence.ClienteRepository;
import api.market.persistence.crud.IClienteCrudRepository;
import api.market.persistence.entity.Cliente;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping("/IdCliente/{id}")
    public Optional<List<Cliente>> getPorCliente(@PathVariable("id") String idCiente){
        return clienteRepository.getByClienteId(idCiente);
    }



}
