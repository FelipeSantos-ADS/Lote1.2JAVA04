import javax.swing.JOptionPane;
public class Ex19 {
    public static void main(String args[]){
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        CalculaMaior(x, y);
    }
    public static void CalculaMaior(double x, double y){
        if (x > y){
            double maior = x;
            JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
        }
        else{
            double maior = y;
            JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
        }    
    }
    
}
