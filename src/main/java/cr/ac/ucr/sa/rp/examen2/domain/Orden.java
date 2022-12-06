package cr.ac.ucr.sa.rp.examen2.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
    private int numOrden;
    private Date fechaOrden;
    private List<ItemOrden> itemes;
    private Cliente cliente;

    public Orden() {
        itemes = new ArrayList<>();
    }

    public Orden(int numOrden, Date fechaOrden, List<ItemOrden> itemes, Cliente cliente) {
        this.numOrden = numOrden;
        this.fechaOrden = fechaOrden;
        this.itemes = itemes;
        this.cliente = cliente;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public List<ItemOrden> getItemes() {
        return itemes;
    }

    public void setItemes(List<ItemOrden> itemes) {
        this.itemes = itemes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "numOrden=" + numOrden +
                ", fechaOrden=" + fechaOrden +
                ", itemes=" + itemes +
                ", cliente=" + cliente +
                '}';
    }
}
