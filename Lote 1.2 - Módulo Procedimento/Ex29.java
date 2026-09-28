import javax.swing.JOptionPane;
public class Ex29 {
    public static void main(String args[]){
        int tipo;
        double VI,VC = 0;
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento: (1=Poupança 2=Renda fixa)"));
        VI = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        CalculaRendimento(tipo, VI, VC);
    }
    public static void CalculaRendimento(int tipo, double VI, double VC){
        if(tipo == 1){
            VC = (VI * 1.03);
            JOptionPane.showMessageDialog(null, "O valor corrigido do investimento é R$: "+ VC);
        }
        else if(tipo == 2){
            VC = (VI * 1.05);
            JOptionPane.showMessageDialog(null, "O valor corrigido do investimento é R$: "+ VC);
        }
        else{
            JOptionPane.showMessageDialog(null, "Tipo de investimento inválido!");
        }    
    }  
}
