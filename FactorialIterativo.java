public class FactorialIterativo{

private static int Factorial(int num){
    int fact = 1;
    if(num != 0){
        for (int i=num; i>0; i--){
            fact = fact*i;
        } 
    }
    return fact;
}


public static void main(String[] args){
    int numero = 5;
    int resultado;

    resultado = Factorial(numero);
    System.out.println("El factorial de "+numero+" es: "+resultado);
    }
}