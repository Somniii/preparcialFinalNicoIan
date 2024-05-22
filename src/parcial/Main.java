package parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Afiliado a = new Afiliado();




        scan.close();
    }
    public static void verificaAuditoria(Afiliado a, OrdenDeConsulta orden, Scanner scan){
        Afiliado aux = a;
        Auditoria auditoria = new Auditoria();
        for (int i=0;i<a.getOrden().length;i++){
            OrdenDeConsulta auxiliar = a.getOrden()[i];
            if(auxiliar instanceof Consulta){
                ((Consulta) auxiliar).setEstadoAuditoria("No Requiere");
            } else if(auxiliar instanceof Odontologia){
                auditoria.verificarAuditoria(orden, scan);
            } else if (auxiliar instanceof AnalisisBioquimico){
                if(((AnalisisBioquimico) auxiliar).getUnidadesBioquimicas()>=10){
                    auditoria.verificarAuditoria(orden, scan);
                } else {
                    ((AnalisisBioquimico) auxiliar).setEstadoAuditoria("No requiere");
                }
            }
        }
    }
}