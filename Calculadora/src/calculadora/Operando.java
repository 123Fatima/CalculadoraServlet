
package calculadora;

public class Operando {
 double numA,numB,Res;

 

 
   
   
 
    public double suma(double numA, double numB){
    Res= numA+numB;   
    return Res;
    }

   
    public double multi(double numA, double numB){
    Res= numA*numB;   
    return Res;  
    }
    
    public double dividir(double numA, double numB){
        Res=  (numA/numB);
        return Res;
    }
    
    public double restar(double numA, double numB){
        Res=numA-numB;
        return Res;
    }
    
    public double potencia(double numA, double numB){
       Res=Math.pow(numA, numB);
       return  Res;
    }
    
    public double raiz(double numA){
     Res=  Math.sqrt(numA);
        return Res;
    }
    
    public double tangente(double numA){
        Res= Math.tan(numA);
        return Res;
    }
    
    public double seno (double numA){
        Res= Math.sin(numA);
        return Res;
    }
}
