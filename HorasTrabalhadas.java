import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class HorasTrabalhadas {

    public static void main(String[] args) 
    {
        
        double HT , VH, THB  ;
 
		//Entrada de Dados
		HT = Double.parseDouble (JOptionPane.showInputDialog("Quantas Horas o Funcionário Trabalhou. Represente em número Inteiro"));
        VH = Double.parseDouble (JOptionPane.showInputDialog("Quanto o Funcionário recebe por hora"));
  
		//Processamento
	
		THB = (HT*VH);
        DecimalFormat df = new DecimalFormat("0.00");  
        String str = df.format(THB);

		JOptionPane.showMessageDialog(null,"O valor total que o funcionário deve receber é R$"+str);
	
	
  
        
    }
}