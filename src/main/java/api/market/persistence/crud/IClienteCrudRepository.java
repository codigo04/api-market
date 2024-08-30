package api.market.persistence.crud;

import api.market.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface IClienteCrudRepository extends CrudRepository<Cliente,String> {


    public Optional<List<Cliente>> findAllByClienteId(String clienteId);


}
