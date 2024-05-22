package parcial;

import java.util.Scanner;

public class Auditoria {
    private String resultadoAuditoria;
    public Auditoria() {
    }

    public Auditoria(String resultadoAuditoria) {
        this.resultadoAuditoria = resultadoAuditoria;
    }

    public String getResultadoAuditoria() {
        return resultadoAuditoria;
    }

    public void setResultadoAuditoria(String resultadoAuditoria) {
        this.resultadoAuditoria = resultadoAuditoria;
    }

    public void verificarAuditoria(OrdenDeConsulta orden, Scanner scan){
        OrdenDeConsulta aux = orden;
        if( aux instanceof AnalisisBioquimico){
            int opc = 0;
            System.out.println("Desea aprobar esta orden? 1=si " +
                    "/n 2=no " +
                    "/n cualquier otro numero sera considerado como un no");
            opc=scan.nextInt();
            if(opc==1){
                ((AnalisisBioquimico) aux).setEstadoAuditoria("Aprobado");
            }else{
                ((AnalisisBioquimico) aux).setEstadoAuditoria("Denegado");
            }
        } else if (aux instanceof Odontologia){
            ((Odontologia) aux).setEstadoAuditoria("Aprobado");
        }
    }
}
