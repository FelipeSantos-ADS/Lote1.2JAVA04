import javax.swing.JOptionPane;
public class Ex24 {
    public static void main(String args[]){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        ValidaDivisao(x);
    }
    public static void ValidaDivisao(int x){
       if(x % 2 == 0 && x % 3 == 0){
            JOptionPane.showMessageDialog(null, "O número é divisível por 2 e 3!");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número não é divisível por 2 e 3!");
        }
    }        
}    

