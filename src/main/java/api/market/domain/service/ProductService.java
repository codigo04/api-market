package api.market.domain.service;

import api.market.domain.Product;
import api.market.domain.repository.IProductRepository;

import api.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private IProductRepository repository;



    public List<Product> getAll() {

       return repository.getAll();
    }

    public Optional<List<Product>> getByCategory(int categoryId) {

        return repository.getByCategory(categoryId);
    }

    public Optional<List<Product>> getStock(int quantity) {

       return repository.getStock(quantity);
    }


    public Optional<Product>  getByProductId(int productId){

        return  repository.getByProductId(productId);
    }

    public Product save(Product product) {


        return repository.save(product);
    }

    public boolean delete(int productId) {

      if (repository.getByProductId(productId).isPresent()){
          repository.delete(productId);
          return true;
      }else {
          return false;
      }

    }








}
