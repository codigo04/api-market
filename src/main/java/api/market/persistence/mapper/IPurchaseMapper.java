package api.market.persistence.mapper;

import api.market.domain.Purchase;
import api.market.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IPurchaseMapper{
    @Mappings({
            @Mapping(source = "idCompra",target = "purchaseId"),
            @Mapping(source = "clienteId",target = "customerId"),
            @Mapping(source = "fecha",target = "date"),
            @Mapping(source = "medioPago",target = "paymetPurchase"),
            @Mapping(source = "comentario",target = "comment"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "comprasProductosC",target = "items")
    })
    Purchase toPurchase(Compra compra);

    List<Purchase> toPurchases(List<Compra> compra);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}
