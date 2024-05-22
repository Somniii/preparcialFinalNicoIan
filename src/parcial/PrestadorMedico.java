package parcial;

public class PrestadorMedico {
    private  String nombrePrestador;
    private String tipo;
    private String practica;
    private double precioPractica;

    public PrestadorMedico() {
    }

    public PrestadorMedico(String nombrePrestador, String practica, double precioPractica, String tipo) {
        this.nombrePrestador = nombrePrestador;
        this.practica = practica;
        this.precioPractica = precioPractica;
        this.tipo = tipo;
    }

    public String getNombrePrestador() {
        return nombrePrestador;
    }

    public void setNombrePrestador(String nombrePrestador) {
        this.nombrePrestador = nombrePrestador;
    }

    public String getPractica() {
        return practica;
    }

    public void setPractica(String practica) {
        this.practica = practica;
    }

    public double getPrecioPractica() {
        return precioPractica;
    }

    public void setPrecioPractica(double precioPractica) {
        this.precioPractica = precioPractica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
