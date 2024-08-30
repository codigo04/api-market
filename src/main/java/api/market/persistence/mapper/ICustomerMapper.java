package api.market.persistence.mapper;

import api.market.domain.Customer;
import api.market.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {

    @Mappings({
            @Mapping(source = "clienteId",target = "customerId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "apellido",target = "lastName"),
            @Mapping(source = "direccion",target = "address"),
            @Mapping(source = "correoElectronico",target = "mail")

    })
    Customer toCustomer(Cliente cliente);
    List<Customer> toCustomers(List<Cliente> clientes);

    @InheritInverseConfiguration
    Cliente toCliente(Customer customer);
}
