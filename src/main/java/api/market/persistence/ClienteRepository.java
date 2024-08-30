package api.market.persistence;

import api.market.persistence.crud.IClienteCrudRepository;
import api.market.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {

    @Autowired
    private IClienteCrudRepository  iClienteCrudRepository;


    public Optional<List<Cliente>> getByClienteId(String clienteId){

        return iClienteCrudRepository.findAllByClienteId(clienteId);
    };
}
