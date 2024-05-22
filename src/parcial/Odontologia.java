package parcial;

public class Odontologia implements OrdenDeConsulta{
    private String estadoAuditoria;
    private  double facturacion;

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
}
