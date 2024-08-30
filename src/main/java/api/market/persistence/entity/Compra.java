package api.market.persistence.entity;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Column(name = "id_compra")
    @Id
    private Integer idCompra;

    @Column(name = "dni")
    private String clienteId;

    private Date fecha;

    @Column(name = "medio_pago")
    private  Character medioPago;   //1 = efectivo 0 2 = tarjeta

    private String comentario;

    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "dni",insertable = false,  updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra")
    private List<CompraProducto> comprasProductosC;


    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Character medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<CompraProducto> getComprasProductosC() {
        return comprasProductosC;
    }

    public void setComprasProductosC(List<CompraProducto> comprasProductosC) {
        this.comprasProductosC = comprasProductosC;
    }
}
