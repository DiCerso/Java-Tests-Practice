package ejemplo;

public class Calculadora {

    private int ans;

    public Calculadora(){
        ans = 0;
    }
    public int suma(int a , int b){
        ans  = a + b;
        return ans;
    }
    public int resta(int a , int b){
        ans  = a - b;
        return ans;
    }

    public int dividir(int a, int b){
        if(b == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        ans = a / b;
        return ans;
    }

    public int ans(){
        return ans;
    }

    public void clear(){
        ans = 0;
    }

    public static void main(String[] args) {
    }

    }
