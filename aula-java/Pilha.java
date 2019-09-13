/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Arrays;

/**
 *
 * @author samuel.silva
 */
public class Pilha {
    int[] pilha = new int[6]; 

    
    // adicionando valores para o array não iniciar vazio 
    public void Add(){
        for(int i = 0; i < pilha.length; i++){
            pilha[i] = i;
        }
    }
    
    // function necessaria para remover um elemento do array
    // vai dar erro se o array for vazio
     public static int[] removeElement(int[] pilha,int element){
         int[] arr = new int[pilha.length-1];
         for(int i = 0, k = 0; i < pilha.length; i++){
             // se existir um index ele continua e revome o index
             if(i == element){
                 continue;
             }
             arr[k++] = pilha[i];
         }
         return arr;
   }
     
    public boolean Empty(){
        // verificando se a pilha está cheia ou vazia
        if(pilha == null){
            // se estiver vazia retorna true
            return true;
        }
        return false;
    }
    public int[] remove(int[] arr, int element){
        arr = removeElement(pilha, element);
        return arr;
    }
   
    /**
     * @param args the command line arguments
     */
    /*
    * Lembrando que na pilha o primeiro elemento que entra e o último que sai 
    *  int[] arr = {0,1,2,3,4,5};
    * 0 = primeiro elemento e 5 = último elemento 
    */
    public static void main(String[] args) {
        // declarando qual vai ser o valor excluido
        int element= 5;
        int[] arr = {0,1,2,3,4,5};
        // instânciando a classe para chamar os métodos 
        Pilha Stack = new Pilha();
        Stack.Add();
        Stack.Empty();
        System.out.println(Arrays.toString(Stack.remove(arr, element)));
        
    }
    
}
