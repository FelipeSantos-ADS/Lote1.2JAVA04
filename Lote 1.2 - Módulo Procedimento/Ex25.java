import javax.swing.JOptionPane;
public class Ex25 {
    public static void main(String args[]){
        int HI, MI, HF, MF;
        HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início do jogo: "));
        MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de início do jogo: "));
        HF = Integer.parseInt(JOptionPane.showInputDialog("Digite o hora de término do jogo: "));
        MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de término do jogo: "));
        CalculaDuracao(HI, MI, HF, MF);
    }
    public static void CalculaDuracao(int HI, int MI, int HF, int MF){
        int TF, TI, DIF, DH, DM;
        TI = (HI * 60) + MI;
        TF = (HF * 60) + MF;
        if(TF >= TI){
            DIF = TF - TI;
        }    
        else{
            DIF = (TF + 1440) - TI;
        }
        DH = DIF / 60;
        DM = DIF % 60;
        JOptionPane.showMessageDialog(null, "O jogo durou " + DH + " horas e " + DM + " minutos");
    }  
}
