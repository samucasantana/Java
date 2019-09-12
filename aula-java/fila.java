/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Arrays;

/**
 *
 * @author samuel.silva
 */
public class Fila {
    int[] fila = new int[6]; 
    int index = 0;
    
    
    public void Add(){
        for(int i = 0; i < fila.length; i++){
            fila[i] = i;
        }
    }
    
    // function necessaria para remover um elemento do array
    // vai dar erro se o array for vazio
     public static int[] removeElement(int[] fila,int element){
         int[] arr = new int[fila.length-1];
         for(int i = 0, k = 0; i < fila.length; i++){
             // se existir um index ele continua e revome o index
             if(i == element){
                 continue;
             }
             arr[k++] = fila[i];
         }
         return arr;
   }
     
    public int[] Remove(int[] arr, int element){
        return arr = removeElement(arr, element);
    } 
    public boolean Empty(){
        if(fila == null){
            return true;
        }
        return false;
    }
    public int[] Show(){
        // encapsulando com toString para retorna a String do array
        System.out.println(Arrays.toString(fila));
        return fila;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pegando o array
        int[] arr = { 1, 2, 3, 4, 5 }; 
        Fila filll = new Fila();
        filll.Add();
        filll.Empty();
        filll.Remove(arr, 0);
        filll.Show();
    }
    
}
