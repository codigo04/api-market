package api.market.persistence.crud;

import api.market.persistence.entity.Compra;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ICompraCrudRepository extends CrudRepository<Compra,Integer> {



    Optional<List<Compra>> findByclienteId(String idCliente);

    }

