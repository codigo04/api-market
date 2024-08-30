package api.market.domain.repository;


import api.market.domain.Product;




import java.util.List;
import java.util.Optional;


public interface IProductRepository {

    List<Product> getAll();

    Optional<List<Product>> getByCategory(int categoryId);

    Optional<List<Product>> getStock(int quantity);

    Optional<Product> getByProductId(int productId);


    Product save(Product product);

    void delete(int productId);
}
