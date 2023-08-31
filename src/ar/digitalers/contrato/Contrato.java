package contrato;

import java.util.Date;

import cliente.Cliente;
import producto.Producto;

public class Contrato{

    private Long id;
    private Producto producto;
    private Cliente cliente;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String estado;


    
    public Contrato(Long id, Producto producto, Cliente cliente, Date fecha_inicio, Date fecha_fin, String estado) {
        this.id = id;
        this.producto = producto;
        this.cliente = cliente;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public Date getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
   

    



    
}