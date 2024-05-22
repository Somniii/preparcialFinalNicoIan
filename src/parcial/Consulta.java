package parcial;

public class Consulta implements  OrdenDeConsulta{
    private String estadoAuditoria;
    private  double facturacion = 500;

    public Consulta() {
    }

    public Consulta(String estadoAuditoria, double facturacion) {
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
