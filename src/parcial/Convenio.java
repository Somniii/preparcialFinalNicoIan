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
    //Lo hago asi porque sino me parece raro
    public void setPrecioConvenio() {
        this.precioConvenio = calculaPrecioConvenio();
    }

    public PrestadorMedico getPrestador() {
        return prestador;
    }

    public void setPrestador(PrestadorMedico prestador) {
        this.prestador = prestador;
    }
    public double calculaPrecioConvenio() {
        return prestador.getPrecioPractica() + 5000;
    }
}
