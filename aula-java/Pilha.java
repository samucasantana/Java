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
    int index = 0;
    
    
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
     
    public int[] Remove(int[] arr, int element){
        return arr = removeElement(arr, element);
    } 
    public boolean Empty(){
        // verificando se a pilha está cheia ou vazia
        if(pilha == null){
            // se estiver vazia retorna true
            return true;
        }
        return false;
    }
    public int[] Show(){
        // encapsulando com toString para retorna a String do array
        System.out.println(Arrays.toString(pilha));
        return pilha;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pegando o array
        int[] arr = { 1, 2, 3, 4, 5 }; 
        // estanciando a classe para tornar ela usavel 
        Pilha Stack = new Pilha();
        Stack.Add();
        Stack.Empty();
        Stack.Remove(arr, 0);
        Stack.Show();
    }
    
}
