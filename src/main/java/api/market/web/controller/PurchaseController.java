package api.market.web.controller;

import api.market.domain.Purchase;
import api.market.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

   // @GetMapping("/cliente/{dni}")
    //public Optional<List<Purchase>> getByCustomer (@PathVariable("dni") String dni){

      //          return purchaseService.getByCustomer(dni);
   // }


    @GetMapping("/cliente/{dni}")
    public ResponseEntity<List<Purchase>> getByCustomer (@PathVariable("dni") String dni){

        return  purchaseService.getByCustomer(dni).map(compras -> new ResponseEntity<>(compras, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    

}
