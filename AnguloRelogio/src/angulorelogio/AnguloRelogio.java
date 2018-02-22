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
        // 
        do{
            System.out.println("Digite apenas as horas: " );
            horas = ler.nextInt();
        } while((horas < 0) || (horas >= 24));
    
        do{
            System.out.println("Digite apenas os minutos: " );
            minutos = ler.nextInt();
        
        } while((minutos < 0) || (minutos >= 60));
   
        
        ang = angulo.retornaAnguloRelogio(horas, minutos);
        System.out.println("Angulo entre o ponteiro das horas e dos minutos é de :" + ang + " graus");
    }
    
    public long retornaAnguloRelogio(int horas, int minutos){
        long anguloHoras, anguloMinutos, anguloPecorridoHora, anguloFinal;
        anguloMinutos = minutos*6;       
        if(horas >= 12 ){
            horas = horas-12; 
        } 
        anguloHoras = horas*30;
        anguloPecorridoHora = anguloMinutos/12;
        if(anguloMinutos > anguloHoras){
            anguloFinal = anguloMinutos - anguloHoras -anguloPecorridoHora;
        }else{
             anguloFinal = anguloHoras - anguloPecorridoHora -anguloMinutos;
        }
        
        if(anguloFinal < 0){
            
          
            anguloFinal = 360 + anguloFinal;
            
        }
    
    return anguloFinal;
    }
    
}