import javax.swing.JOptionPane;
public class Ex27 {
    public static void main(String args[]){
         int voltas;
        double extensao, tempo;
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração em minutos: "));
        CalculaVM(voltas, extensao, tempo);
    }
    public static void CalculaVM(int voltas, double extensao, double tempo){
        double distanciaKm = (voltas * extensao) / 1000.0;
        double tempoHoras = tempo / 60.0;
        double vm = distanciaKm / tempoHoras;
        JOptionPane.showMessageDialog(null, "A velocidade média é de " + vm + " Km/h");
    }
    
}
