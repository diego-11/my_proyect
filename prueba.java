import java.util.Scanner;

class prueba {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        int num1; int num2; 

        System.out.println("Ingrese el primer numero: ");
        num1= entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2= entrada.nextInt();

        double suma=num1+num2;
        double resta= num1-num2;
        double multiplicacion =num1* num2;
        double division= num1/num2;
        double modulo = num1%num2;

        

        System.out.println("lA suma de los numero es "+suma);
        System.out.println("lA resta de los numero es "+resta);
        System.out.println("lA division de los numero es "+division);
        System.out.println("lA multiplicacion de los numero es "+multiplicacion);
        System.out.println("El modulo de los numero es "+modulo);


        




    }
}