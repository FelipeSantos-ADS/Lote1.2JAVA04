import javax.swing.JOptionPane;
public class Ex28 {
    public static void main(String args[]){
        double PA,VM;
        PA = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
        VM = Integer.parseInt(JOptionPane.showInputDialog("Digite a média de venda mensal do produto: "));
        CalcularNPreco(PA, VM);
    }
    public static void CalcularNPreco(double PA, double VM){
        double NP;
       if(VM < 500 && PA < 30){
            NP = (PA * 1.10);
            JOptionPane.showMessageDialog(null, "O novo preço do produto é: R$" + NP);
        }
        else if(VM >= 500 && VM < 1000 && PA >= 30 && PA < 80){
            NP = (PA * 1.15);
            JOptionPane.showMessageDialog(null, "O novo preço do rpoduto é: R$" + NP);
        }
        else if(VM >= 1000 && PA >= 80){
            NP = (PA * 0.95);
            JOptionPane.showMessageDialog(null, "O novo preço do produto é: R$" + NP);
        }
        else{
            NP = PA;
            JOptionPane.showMessageDialog(null, "O novo preço do rpoduto é: R$" + NP);
        }
    }
}
