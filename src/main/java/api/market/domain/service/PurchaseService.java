package api.market.domain.service;

import api.market.domain.Purchase;
import api.market.domain.repository.IPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    public IPurchaseRepository iPurchaseRepository;

    public Optional<List<Purchase>> getByCustomer (String dni){

        return iPurchaseRepository.getByCustomer(dni);
    }
}
