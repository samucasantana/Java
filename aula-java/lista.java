/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.Scanner;

/**
 *
 * @author samuel.silva
 */
public class Lista {
    private int vetor[];
    private int tamanho;
    
    // método construtor 
    public Lista(int capMax){
       vetor = new int[capMax];
       tamanho = 0;
    }
    
    // adiciona elemento no inicio 
    public void adicionaInicio(int e){
        if(vetor.length == tamanho){
            System.out.println("erro");
        }else{
            for(int i = tamanho; i > 1; i --){
                vetor[i] = vetor[i-1];
            }
            vetor[0] = e;
            tamanho ++;
        }
    }
    
    // remove o inicio
    public int removeInicio(){
        int resp = -1;
        if(tamanho == 0){
            System.out.println("erro vazio");
        }else{
            resp= vetor[0];
            for(int i =0; i <tamanho; i++){
                vetor[i] = vetor[i+1];
            }
            tamanho--;
        }
        return resp;
    }
    
    //adiciona final 
    public int adicionaFinal(int e){
        if(vetor.length == tamanho){
            System.out.println("erro");
        }else{
          vetor[tamanho] = e;
          tamanho = tamanho + 1;
        }
        return tamanho;
    }
    
    // remove final
    public int removeFinal(int e){
        if(tamanho == 0){
            System.out.println("erro vazio");
        }else{
            vetor[tamanho] = e;
          tamanho = tamanho - 1;
        }
        return tamanho;
    }
    
    // adicona string 
    public String toString(){
        String s="";
        for(int i =0; i < tamanho; i++){
            s = s + vetor[i];
        }
        return s;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
