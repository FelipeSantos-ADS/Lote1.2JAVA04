import javax.swing.JOptionPane;
public class Ex21 {
    public static void main(String args[]){
        double n1, n2, n3, n4;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
        CalculaMedia(n1, n2, n3, n4);
    }
    public static void CalculaMedia(double n1, double n2, double n3, double n4){
        double media = (n1 + n2 + n3 + n4) / 4;
        if (media >= 6.0){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else if (media >= 3.0 ){
            JOptionPane.showMessageDialog(null, "Exame");
        }
        else{
            JOptionPane.showMessageDialog(null, "Retido");
        }    
    } 
}
