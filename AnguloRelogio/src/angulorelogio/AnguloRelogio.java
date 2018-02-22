/*
 * Problema do Angulo entre os ponteiros do relogio
 *
 * 
 */
package angulorelogio;
import java.util.Scanner;



/**
 *
 * @author João Vitor Pereira
 */
public class AnguloRelogio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int minutos,horas;
        AnguloRelogio angulo = new AnguloRelogio();
        long ang ;
        // Tratamento de erros
        do{
            System.out.println("Digite apenas as horas: " );
            horas = ler.nextInt();
        } while((horas < 0) || (horas >= 24));
        // Tratamento de erros
        do{
            System.out.println("Digite apenas os minutos: " );
            minutos = ler.nextInt();
        
        } while((minutos < 0) || (minutos >= 60));
   
        // Chama função para calcular o angulo
        ang = angulo.retornaAnguloRelogio(horas, minutos);
        System.out.println("Angulo entre o ponteiro das horas e dos minutos é de :" + ang + " graus");
    }
    
    public long retornaAnguloRelogio(int horas, int minutos){
        long anguloHoras, anguloMinutos, anguloPecorridoHora, anguloFinal;
        /** Relogio possui 360 logo, a velocidade do ponteiro de minuto será de 
        * 360/60 = 6 graus por minuto
        *  Utilizando a mesma lógica, a velocidade do ponteiro de horas será de 
        * 360/12 = 30 graus por hora
        * 
        */
        anguloMinutos = minutos*6;       
        if(horas >= 12 ){
            horas = horas-12; 
        } 
        anguloHoras = horas*30;
        anguloPecorridoHora = anguloMinutos/12;
        // Tratamento para deixar sempre o maior angulo positivo
        if(anguloMinutos > anguloHoras){
            anguloFinal = anguloMinutos - anguloHoras -anguloPecorridoHora;
        }else{
             anguloFinal = anguloHoras - anguloPecorridoHora -anguloMinutos;
        }
        // Tratamento para sempre achar o angulo entre HM 
        if(anguloFinal < 0){
            
          
            anguloFinal = 360 + anguloFinal;
            
        }
    
    return anguloFinal;
    }
    
}