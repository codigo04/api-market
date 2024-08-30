package api.market.persistence.crud;

import api.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface IProductoCrudRepository extends CrudRepository<Producto,Integer> {


    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);


   List<Producto> findByCodigoBarras(String codigoBarras);

   Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int catidadStock, int estado);


}

