import java.text.DecimalFormat;
import javax.swing.*;

public class Degraus {

    public static void main(String[] args) 
    {
        
        double CM, M, Q, D ;
 
		//Entrada de Dados
		CM = Double.parseDouble (JOptionPane.showInputDialog("Quantas centímetros possui o degrau?"));
  
		//Processamento
		M = (CM/100);
		Q =(M/5000);
		

		JOptionPane.showMessageDialog(null,"Para você estar a uma altura de 5 quilometros é necessário subir "+Q+" degraus");
	
        
    }
}
