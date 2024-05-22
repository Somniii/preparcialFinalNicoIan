package parcial;

public class Odontologia implements OrdenDeConsulta{
    private String estadoAuditoria;
    //No se si dejar fijo el precio de facturacion o hacer que una variable que le da valor
    //Lo dejo asi porque ahora es mas flexible , sino cambiar.
    private double  facturacion = 1000;

    public Odontologia() {
    }

    public Odontologia(String estadoAuditoria, double facturacion) {
        this.estadoAuditoria = estadoAuditoria;
        this.facturacion = facturacion;
    }

    public String getEstadoAuditoria() {
        return estadoAuditoria;
    }

    public void setEstadoAuditoria(String estadoAuditoria) {
        this.estadoAuditoria = estadoAuditoria;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }
    public double calcularCosto(Convenio conv){
        return conv.getPrecioConvenio()+facturacion;
    }

}
