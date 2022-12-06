package cr.ac.ucr.sa.rp.examen2.domain;

public class ProductoHardware extends Producto {
    private String lugarEnsamble;

    public ProductoHardware() {

    }

    public ProductoHardware(int idProducto, String descripcion, float precio, String lugarEnsamble) {
        super(idProducto, descripcion, precio);
        this.lugarEnsamble = lugarEnsamble;
    }
}
