import javax.swing.JOptionPane;
public class Ex16 {
    public static void main (String args[]){
        double horas, valor_hora, desconto;
        int dependentes; 
        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
        valor_hora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
        desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual desconto: "));
        dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));
        CalcularSalario(horas, valor_hora, desconto, dependentes);
    }    
        public static void CalcularSalario(double h, double vHora, double desc, int dep){
            double sal_bruto = h * vHora;
            double sal_liquido = sal_bruto * (1 - desc / 100);
            double sal_final = sal_liquido + (dep * 100);
            JOptionPane.showMessageDialog(null, "O salário á receber é R$: " + sal_final);
        }    
}
