package parcial;

import java.util.Scanner;

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

    public PrestadorMedico crearPrestadorMedico(Scanner scan){
        System.out.println("Ingrese nombre del prestador");
        String nombre = scan.nextLine();
        System.out.println("Ingrese tipo de prestador");
        String tipo = scan.nextLine();
        System.out.println("Ingrese la practica del prestador");
        String practica = scan.nextLine();
        System.out.println("Ingrese el precio de la practica del prestador");
        double precioPractica = scan.nextDouble();
        return  new PrestadorMedico(nombre , practica , precioPractica, tipo);
    }
}
