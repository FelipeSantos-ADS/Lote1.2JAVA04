import javax.swing.JOptionPane;
public class Ex26 {
    public static void main(String args[]){
         int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        VerificaMultiplo(x, y);
    }
    public static void VerificaMultiplo(int x, int y){
        if(x >= y){
            if(x % y == 0){
                JOptionPane.showMessageDialog(null, "O maior número é múltiplo do menor");
            }
            else{
                JOptionPane.showMessageDialog(null, "O maior número não é múltiplo do menor: ");
            }
        }
        else if(y % x == 0 ){
            JOptionPane.showMessageDialog(null, "O maior número é múltiplo do menor");
        }
        else{
            JOptionPane.showMessageDialog(null, "O maior número não é múltiplo do menor: ");
        }    
    }   
}
