package cr.ac.ucr.sa.rp.examen2.domain;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellidos;


    public Cliente(int idCliente, String nombre, String apellidos) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
