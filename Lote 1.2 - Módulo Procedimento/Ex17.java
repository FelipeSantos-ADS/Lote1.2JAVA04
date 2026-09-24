import javax.swing.JOptionPane;
public class Ex17 {
    public static void main(String args[]){
        double t, v;
        t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo em horas: "));
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade em km/h: "));
        VelocidadeMedia(t, v);
    }    
        public static void VelocidadeMedia(double t, double v){
            double d = t * v;
            double l = d / 12;
            JOptionPane.showMessageDialog(null, "Foi gasto " + l + " litros de combustível");
        }     
}  

