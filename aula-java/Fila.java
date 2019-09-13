package app;
import java.util.Arrays;

public class Fila{
    int[] fila = new int[10];

    public int[] Add(){
        for(int i = 0; i < fila.length; i++){
            fila[i] = i;
        }
        return fila;
    }  

    public boolean IsEmpty(){
        if(fila == null){
            System.out.println("Erro lista vazia");
        }
        return false;
    }

    public static int[] RemoveElement(int[] fila, int index){
        // criando cópia do array
        int[] arr = new int[fila.length -1];
        for(int i =0, k = 0; i < fila.length; i++){
            if(i == index){
                continue;
            }

            arr[k++] = fila[i];
        }
        return arr;

    }
    public int[] remove(int[] fila, int index){
        int[] arr = RemoveElement(fila, index);
        return arr;
    }
    /*
    * A base é a mesma da Pilha só que agora o primeiro elemento que entra 
    * é o primeiro a sair 
    */
    public static void main(String[] args){
        int index = 0;
        Fila fil = new Fila();
        fil.Add();
        fil.IsEmpty();
        int[] fila = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(fil.remove(fila, index)));
        }
}
