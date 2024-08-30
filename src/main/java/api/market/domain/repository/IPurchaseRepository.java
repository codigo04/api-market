package api.market.domain.repository;

import api.market.domain.Purchase;
import api.market.persistence.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface IPurchaseRepository{

     Optional<List<Purchase>> getByCustomer(String dni);
}
