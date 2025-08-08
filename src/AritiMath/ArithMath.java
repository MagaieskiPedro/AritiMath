package AritiMath;

public class ArithMath {


    public int soma(int numero1, int numero2){
        return numero1+numero2;
    }
    public int subtracao(int numero1, int numero2){
        return numero1-numero2;
    }
    public int multiplicacao(int numero1, int numero2){
        return numero1 * numero2;
    }
    public double divisao(int numero1, int numero2){
        return (double) numero1 /numero2;
    }

    public int potencia(int base, int expoente){
        int resultado = base;
        int contador = 1;
        while (contador<expoente){
            resultado = resultado*base;
            contador++;
        }
        return resultado;
    }

    public int raiz(int base,int indiceRaiz){
        int resultado = 0;
        for(int i=1;i<=base;i++){

            if(potencia(i,indiceRaiz) == base){
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public int logaritmo(int logaritmo,int base){
        int resultado = 0;
        for(int i = 1; i<logaritmo;i++){
            if(potencia(base,i) == logaritmo){
                resultado = i;
                break;
            }
        }
        return resultado;
    }
}
