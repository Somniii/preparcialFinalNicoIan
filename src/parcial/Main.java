package parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Afiliado a = new Afiliado();


        public static String verificarAuditoria(Afiliado a){
            Afiliado aux = a;
            for (int i=0;i<a.getOrden().length;i++){
                OrdenDeConsulta auxiliar = a.getOrden()[i];
                if(auxiliar instanceof Consulta){
                    ((Consulta) auxiliar).setEstadoAuditoria("Aprobado");
                } else if(auxiliar instanceof Odontologia){
                    ((Odontologia) auxiliar).setEstadoAuditoria(verificarAuditoria);
                } else if (auxiliar instanceof AnalisisBioquimico){
                    if(((AnalisisBioquimico) auxiliar).getUnidadesBioquimicas()>=10){
                        ((AnalisisBioquimico) auxiliar).setEstadoAuditoria(verificarAuditoria);
                    }
                }
            }
        }

        scan.close();
    }
}