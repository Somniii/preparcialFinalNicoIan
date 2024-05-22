package parcial;

import java.text.CompactNumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Afiliado a = new Afiliado();

        a = crearAfiliado(scan);
        a = verificaAuditoria(a,scan);
        System.out.println("Sale de verificar auditoria");
        Convenio conv = crearConvenio(scan);
        System.out.println("Sale de verificar convenio");
        mostrarTodoAfiliado(a,conv);
        scan.close();

    }
    public static Afiliado verificaAuditoria(Afiliado a, Scanner scan){
        Auditoria auditoria = new Auditoria();
        for (int i=0;i<a.getOrden().length;i++){
            OrdenDeConsulta auxiliar = a.getOrden()[i];
            if(auxiliar instanceof Consulta){
                ((Consulta) auxiliar).setEstadoAuditoria("No Requiere");
            } else if(auxiliar instanceof Odontologia){
                auditoria.verificarAuditoria(auxiliar, scan);
                ((Odontologia) auxiliar).setEstadoAuditoria(auditoria.getResultadoAuditoria());
            } else if (auxiliar instanceof AnalisisBioquimico){
                System.out.println("Verificando la aprobacion de la orden de analisis bioquimico");
                if(((AnalisisBioquimico) auxiliar).getUnidadesBioquimicas()>=10){
                    auditoria.verificarAuditoria(auxiliar, scan);
                    ((AnalisisBioquimico) auxiliar).setEstadoAuditoria(auditoria.getResultadoAuditoria());

                } else {
                    ((AnalisisBioquimico) auxiliar).setEstadoAuditoria("No requiere");
                }
            }
        }
        return a;
    }
    //DNI , NOMBRE , APELLIDO , CANTIDADDEORDENES(INT) , ORDENDECONSULTA ORDEN
    public static Afiliado crearAfiliado(Scanner scan){
        System.out.println("-----INGRESANDO LOS VALORES DE AFILIADO------");
        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();
        System.out.println("Ingrese su dni");
        long dni = scan.nextLong();
        System.out.println("Ingrese la cantidad de ordenes");
        int cantidadOrdenMes = scan.nextInt();
        OrdenDeConsulta[] orden = new OrdenDeConsulta[cantidadOrdenMes];
        for(int i = 0 ; i <cantidadOrdenMes ; i++){
            orden[i]= crearConsulta(scan);
        }
        return new Afiliado(apellido ,cantidadOrdenMes,dni,nombre,orden);
    }
    public static OrdenDeConsulta crearConsulta(Scanner scan){
        System.out.println("-------INGRESANDO LOS VALORES DE UNA ORDEN--------");
        System.out.println("Que desea:\n1.Analisis bioquimico\n2.Consulta\nOdontologia");
        int opcion  = scan.nextInt();
        while(opcion != 1 && opcion != 2 && opcion != 3){
            System.out.println("Ingreso una opcion invalida , ingrese nuevamente");
            System.out.println("Que desea:\n1.Analisis bioquimico\n2.Consulta\nOdontologia");
            opcion  = scan.nextInt();
        }
        OrdenDeConsulta aux;
        switch (opcion){
            case 1:
                aux = crearAnalisis(scan);

                break;
            case 2:
                aux =  new Consulta();
                break;
            case 3:
                aux = new Odontologia();
                break;
            default:
                aux = null;
                break;
        }
        return aux;
    }

    public static AnalisisBioquimico crearAnalisis(Scanner scan){
        AnalisisBioquimico analisis = new AnalisisBioquimico();
        System.out.println("----Creacion del analisis bioquimico----");
        System.out.println("Cuantas unidades bioqumicas uso");
        analisis.setUnidadesBioquimicas(scan.nextInt());;
        return analisis;
    }
    public static void mostrarOrdenesAfiliado(Afiliado a , Convenio conv){
        for(int i = 0;i < a.getOrden().length;i++){
            OrdenDeConsulta aux = a.getOrden()[i];
            if(aux instanceof Consulta){
                System.out.println("TIPO: CONSULTA");
                System.out.println("FACTURACION DIFERENCIAL: "+((Consulta) aux).getFacturacion());
                System.out.println("AUDITORIA: "+((Consulta) aux).getEstadoAuditoria());
                System.out.println("FACTURACION TOTAL:"+aux.calcularCosto(conv));
            }
            else if(aux instanceof AnalisisBioquimico){
                System.out.println("TIPO: ANALISIS BIOQUIMICO");
                System.out.println("FACTURACION DIFERENCIAL: "+((AnalisisBioquimico) aux).getFacturacion());
                System.out.println("CANTIDAD DE UNIDADES: "+((AnalisisBioquimico) aux).getUnidadesBioquimicas());
                System.out.println("AUDITORIA: "+((AnalisisBioquimico) aux).getEstadoAuditoria());
                System.out.println("FACTURACION TOTAL:"+aux.calcularCosto(conv));

            }
            else if(aux instanceof Odontologia){
                System.out.println("TIPO: ODONTOLOGIA");
                System.out.println("FACTURACION DIFERENCIAL: "+((Odontologia) aux).getFacturacion());
                System.out.println("AUDITORIA: "+((Odontologia) aux).getEstadoAuditoria());
                System.out.println("FACTURACION TOTAL:"+aux.calcularCosto(conv));
            }
        }
    }
    public static void mostrarTodoAfiliado(Afiliado afiliado,Convenio conv){
        System.out.println("-----MOSTRANDO TODO EL AFILIADO--------");
        System.out.println("NOMBRE:"+afiliado.getNombre());
        System.out.println("APELLIDO:"+afiliado.getApellido());
        System.out.println("DNI:"+afiliado.getDNI());
        System.out.println("CANTIDAD DE ORDENES"+afiliado.getCantidadOrdenMes());
        //mostrarConvenio(conv);
        System.out.println("FACTURACION TOTAL");
        mostrarOrdenesAfiliado(afiliado, conv);
    }
    public static Convenio crearConvenio(Scanner scan){
        Convenio conv = new Convenio();
        PrestadorMedico prestadorMedico = crearPrestadorMedico();
        System.out.println("Entra a set precio convenio");
        conv.setPrecioConvenio(prestadorMedico);
        System.out.println("Pasa del get precio convenio de convenio");
        conv.setPrestador(prestadorMedico);
        return conv;
    }
    public static PrestadorMedico crearPrestadorMedico(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre del prestador");
        String nombre = scan.nextLine();
        System.out.println("Ingrese tipo de prestador");
        String tipo = scan.nextLine();
        System.out.println("Ingrese la practica del prestador");
        String practica = scan.nextLine();
        System.out.println("Ingrese el precio de la practica del prestador");
        double precioPractica = scan.nextDouble();
        PrestadorMedico prestador = new PrestadorMedico(nombre , practica , precioPractica, tipo);
        return prestador;
    }
    public static void mostrarConvenio(Convenio conv){
        System.out.println("-----MOSTRANDO TODO EL AFILIADO--------");
        System.out.println("Datos prestador:");
        PrestadorMedico prestador = conv.getPrestador();
        System.out.println("NOMBRE:"+prestador.getNombrePrestador());
        System.out.println("TIPO"+prestador.getTipo());
        System.out.println("PRACTICA"+prestador.getPractica());
        System.out.println("PRECIO PRACTICA"+prestador.getPrecioPractica());
        System.out.println("-----------");
        System.out.println("PRECIO TOTAL CONVENIO:"+conv.getPrecioConvenio());

    }
}