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
    public void setPrecioConvenio(PrestadorMedico prestador) {
        this.precioConvenio = calculaPrecioConvenio(prestador);
    }

    public PrestadorMedico getPrestador() {
        return prestador;
    }

    public void setPrestador(PrestadorMedico prestadorMedicoAuxiliar) {
        this.prestador = prestador;
    }
    public double calculaPrecioConvenio(PrestadorMedico prestadorMedicoAuxiliar) {
        return prestadorMedicoAuxiliar.getPrecioPractica() + 5000;
    }
}
