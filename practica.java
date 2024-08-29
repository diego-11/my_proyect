
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

        // int num ;
        // String message;

        // num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        // message= (num%2==0) ? "Es un numero par": "Es un numero  impar ";
        // JOptionPane.showMessageDialog(null,message);

        int num1,num2;

        num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        if (num1>num2){
            JOptionPane.showMessageDialog(null,"El numero mayor es "+num1);
        }
        else if (num1<num2){
            JOptionPane.showMessageDialog(null,"El numero mayor es "+num2);
        }
        else {
            JOptionPane.showMessageDialog(null,"Los numero son iguales ");
        }


        



    }
}
