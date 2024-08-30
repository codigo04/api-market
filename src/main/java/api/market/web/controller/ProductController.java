package api.market.web.controller;

import api.market.domain.Product;
import api.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/idCategoria/{id}")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable("id") int categoryId) {

        return productService.getByCategory(categoryId).
                map(products ->new ResponseEntity<>(products,HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{cantidad}")
    public ResponseEntity<List<Product>> getStock(@PathVariable("cantidad") int quantity) {

        return productService.getStock(quantity)
                .map(products -> new ResponseEntity<>(products,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/IdProducto/{id}")
    public Optional<Product>  getByProductId(@PathVariable("id") int productId){

        return  productService.getByProductId(productId);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody  Product product) {

        return new ResponseEntity<>(productService.save(product),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int productId) {

             if (productService.delete(productId)){
                  return new ResponseEntity<>(productService.delete(productId),HttpStatus.OK);
             }else {
                 return new ResponseEntity<>(productService.delete(productId),HttpStatus.NOT_FOUND);
             }

    }
}
