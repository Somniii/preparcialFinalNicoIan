package parcial;

public class Convenio {
    private PrestadorMedico prestador;
    private double precioConvenio;

    public Convenio() {
    }

    public Convenio(double precioConvenio, PrestadorMedico prestador) {
        this.precioConvenio = precioConvenio;
        this.prestador = prestador;
    }

    public double getPrecioConvenio() {
        return precioConvenio;
    }

    public void setPrecioConvenio(double precioConvenio) {
        this.precioConvenio = precioConvenio;
    }

    public PrestadorMedico getPrestador() {
        return prestador;
    }

    public void setPrestador(PrestadorMedico prestador) {
        this.prestador = prestador;
    }
}
