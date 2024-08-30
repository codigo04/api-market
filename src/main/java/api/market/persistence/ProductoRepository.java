package api.market.persistence;

import api.market.domain.Product;
import api.market.domain.repository.IProductRepository;
import api.market.persistence.crud.IProductoCrudRepository;
import api.market.persistence.entity.Producto;
import api.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements IProductRepository {

   @Autowired
    private IProductoCrudRepository iProductoCrudRepository;

    @Autowired
    private ProductMapper mapper;
    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) iProductoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int contegoryId) {
        List<Producto> productos =  iProductoCrudRepository.findByIdCategoriaOrderByNombreAsc(contegoryId);

        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getStock(int quantity) {

      Optional<List<Producto>> productos = iProductoCrudRepository.findByCantidadStockLessThanAndEstado(quantity,0);


        return productos.map(productos1 -> mapper.toProducts(productos1));
    }

    @Override
    public Optional<Product> getByProductId(int productId) {

        Optional<Producto> productos = iProductoCrudRepository.findById(productId);

        return productos.map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);

        return mapper.toProduct(producto);
    }

    @Override
    public void delete(int productId) {

       iProductoCrudRepository.deleteById(productId);
    }


//    List<Producto>  getAll(){
//        return (List<Producto>) iProductoCrudRepository.findAll();
//    }
//
//    List<Producto> getPorCategoriaOrdenado(int idCategoria){
//
//        return iProductoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
//    }
//
//
//
//
//    List<Producto> getPorBarras(String codigoBarras){
//
//        return iProductoCrudRepository.findByCodigoBarras(codigoBarras);
//    }
//
//
//    Optional<List<Producto>> getPorCantidad(int cantidad){
//
//        return iProductoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,0);
//    }
//
//    Optional<Producto> getPorProducto(int idProducto){
//
//        return iProductoCrudRepository.findById(idProducto);
//    }
//
//
//    Producto save(Producto producto){
//
//        return iProductoCrudRepository.save(producto);
//    }
//
//    void delate(int idProducto){
//
//       iProductoCrudRepository.deleteById(idProducto);
//    }

}
