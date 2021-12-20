package org.fabriciotakaki.domain.entity;

import org.apache.tomcat.jni.Local;

import java.math.BigDecimal;

public class Pedido {

    private Integer id;
    private Cliente cliente;
    private Local dataPedido;
    private BigDecimal total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Local getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Local dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
