package parcial;

public class Afiliado {
    private long DNI;
    private String nombre;
    private String apellido;
    private int cantidadOrdenMes;
    private OrdenDeConsulta[] orden;

    public Afiliado() {
    }

    public Afiliado(String apellido, int cantidadOrdenMes, long DNI, String nombre, OrdenDeConsulta[] orden) {
        this.apellido = apellido;
        this.cantidadOrdenMes = cantidadOrdenMes;
        this.DNI = DNI;
        this.nombre = nombre;
        this.orden = orden;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCantidadOrdenMes() {
        return cantidadOrdenMes;
    }

    public void setCantidadOrdenMes(int cantidadOrdenMes) {
        this.cantidadOrdenMes = cantidadOrdenMes;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public OrdenDeConsulta[] getOrden() {
        return orden;
    }

    public void setOrden(OrdenDeConsulta[] orden) {
        this.orden = orden;
    }


}
