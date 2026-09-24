import javax.swing.JOptionPane;
public class Ex18 {
    public static void main(String args[]){
         int x, y;
       x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
       y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
       CalcularDiferenca(x, y);
    } 
       public static void CalcularDiferenca(int x, int y){
           if (x > y){
              JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é: " + (x - y));
            }
            else {
              JOptionPane.showMessageDialog(null, "A difereça do maior pelo menor é: " + (y - x));
            }
        }
}
