package parcial;

public class AnalisisBioquimico implements OrdenDeConsulta{
    private String estadoAuditoria;
    private  double facturacion = 50;
    private int unidadesBioquimicas;

    public AnalisisBioquimico() {
    }

    public AnalisisBioquimico(String estadoAuditoria, double facturacion, int unidadesBioquimicas) {
        this.estadoAuditoria = estadoAuditoria;
        this.facturacion = facturacion;
        this.unidadesBioquimicas = unidadesBioquimicas;
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

    public int getUnidadesBioquimicas() {
        return unidadesBioquimicas;
    }

    public void setUnidadesBioquimicas(int unidadesBioquimicas) {
        this.unidadesBioquimicas = unidadesBioquimicas;
    }
    public double calcularCosto(Convenio conv){
        return conv.getPrecioConvenio()+(unidadesBioquimicas*facturacion);
    }

}
