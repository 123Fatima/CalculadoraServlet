
package calculadora;

import java.util.Scanner;


public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operando oper = new Operando();
       Scanner sc = new Scanner(System.in);
       double numA,numB,res1 = 0;
       int op = 0;
       String res = null;
       
        do{
        System.out.println("SELECCIONA UNA DE LAS SIGUIENTES OPCIONES");
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Multiplicacion");
        System.out.println("4.-Division");
        System.out.println("5.-Potencia");
        System.out.println("6.-Raiz Cuadrada");
           System.out.println("Inserta la opcion");
           op= sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Inserta numero1");
                numA= sc.nextInt();
                System.out.println("Inserta numero2");
                numB= sc.nextInt();
                res1=oper.suma(numA, numB);
                break;
            case 2:
                System.out.println("Inserta numero1");
                numA= sc.nextInt();
                System.out.println("Inserta numero2");
                numB= sc.nextInt();
                res1=oper.restar(numA, numB);
               
                break;
            case 3:
                System.out.println("Inserta numero1");
                numA= sc.nextInt();
                System.out.println("Inserta numero2");
                numB= sc.nextInt();
                res1=oper.multi(numA, numB);
                break;
            case 4:
                System.out.println("Inserta numero1");
                numA= sc.nextInt();
                System.out.println("Inserta numero2");
                numB= sc.nextInt();
                res1=oper.dividir(numA, numB);
                break;
            case 5:
                System.out.println("Inserta numero1");
                numA= sc.nextInt();
                System.out.println("Inserta numero2");
                numB= sc.nextInt();
                res1=oper.potencia(numA, numB);
                break;
            case 6:
                System.out.println("Inserta numero1");
                numA= sc.nextInt();
                res1=oper.raiz(numA);
        }
        
        System.out.println("Tu resultado es +"  + res1);
        System.out.println("Deseas continuar");
           res = sc.next();
        }
        while(res.equalsIgnoreCase("Si"));
        
        
    }
    

}
