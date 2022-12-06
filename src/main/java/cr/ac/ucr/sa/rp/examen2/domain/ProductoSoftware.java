package cr.ac.ucr.sa.rp.examen2.domain;

public class ProductoSoftware extends Producto {
    private String version;

    public ProductoSoftware() {
    }

    public ProductoSoftware(int idProducto, String descripcion, float precio, String version) {
        super(idProducto, descripcion, precio);
        this.version = version;
    }
}
