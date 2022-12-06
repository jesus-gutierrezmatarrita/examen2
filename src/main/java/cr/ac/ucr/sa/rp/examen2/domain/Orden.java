package cr.ac.ucr.sa.rp.examen2.domain;

import java.util.Date;
import java.util.List;

public class Orden {
    private int numOrden;
    private Date fechaOrden;
    private List<ItemOrden> itemes;
    private Cliente cliente;
}
