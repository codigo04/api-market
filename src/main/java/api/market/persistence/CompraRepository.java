package api.market.persistence;

import api.market.domain.Purchase;
import api.market.domain.repository.IPurchaseRepository;
import api.market.persistence.crud.ICompraCrudRepository;
import api.market.persistence.entity.Compra;
import api.market.persistence.mapper.IPurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements IPurchaseRepository {

    @Autowired
    private ICompraCrudRepository compraCrudRepository;

    @Autowired
    private IPurchaseMapper mapper;



    @Override
    public Optional<List<Purchase>> getByCustomer(String dni) {

        return compraCrudRepository.findByclienteId(dni).map(compras -> mapper.toPurchases(compras));
    }

   // public Optional<List<Compra>> getByCliente(String dni){

     //   Optional<List<Compra>> compras = compraCrudRepository.findByclienteId(dni);

       // return compras;
    //}
}
