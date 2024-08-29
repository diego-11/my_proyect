
import javax.swing.JOptionPane;
//package condicionales;

public class practica {
    public static void main(String[] args) {
         int numero, dato=5;

        //  numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero; "));

        //  if (numero!=dato){
        //     JOptionPane.showMessageDialog(null,"El numero es diferente 5");
        //  }
         
        //  else {
        //     JOptionPane.showMessageDialog(null,"El numero es  5 ");
        //  }

        int num ;
        String message;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        message= (num%2==0) ? "Es un numero par": "Es un numero  impar ";
        JOptionPane.showMessageDialog(null,message);


        



    }
}
