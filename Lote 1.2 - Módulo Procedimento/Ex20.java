import javax.swing.JOptionPane;
public class Ex20 {
    public static void main(String args[]){
        int a, c;
        double b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C: "));
        CalculaBhaskara(a, (int) b, c);
    }
    public static void CalculaBhaskara(int a, int c, double b){
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0){
            JOptionPane.showMessageDialog(null, "Não possui raiz");
        }
        else if (delta == 0){
            double x1 = (- b + Math.sqrt(delta))/(2 * a);
            JOptionPane.showMessageDialog(null, "O valor da raiz é: " + x1);
        }
        else{
            double x1 = (- b + Math.sqrt(delta))/(2 * a);
            double x2 = (- b - Math.sqrt(delta))/(2 * a);
            JOptionPane.showMessageDialog(null, "O valor da primeira raiz é: " + x1);
            JOptionPane.showMessageDialog(null, "O valor da segunda raiz é: " + x2);
        }    
    }
}
