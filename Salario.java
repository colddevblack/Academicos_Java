import java.text.DecimalFormat;
import javax.swing.*;

public class Salario {

    public static void main(String[] args) 
    {
        
        double IMP , SB, SL, GRAT  ;
 
		//Entrada de Dados
		SB = Double.parseDouble (JOptionPane.showInputDialog("Digite o Salário Bruto"));
  
		//Processamento
	
		GRAT = (SB*10)/100;
        IMP  = (SB*20)/100;
		SL = SB+GRAT-IMP;
        DecimalFormat df = new DecimalFormat("0.00");  
        String str = df.format(SL);

		JOptionPane.showMessageDialog(null,"O Salário Líquido é " +str);
	
	
  
        
    }
}
