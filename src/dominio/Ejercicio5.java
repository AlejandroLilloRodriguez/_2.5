package dominio;

public class Ejercicio5 {
    public static double media (int []lista,int i){
        if(i==0)
            return lista[i];
        else
            return (lista[i]+media(lista,i-1));

    }
}
