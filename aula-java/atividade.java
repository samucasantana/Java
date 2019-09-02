/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inverte;
import java.util.*;

/**
 *
 * @author pedro.gomes
 */
public class Inverte {
    public Object[] pilha;
    public int posicao;
    // construtor 
   public Inverte(){
       this.posicao = -1;
       this.pilha = new Object[10];
    }
   
    public boolean isEmpty(){
        if(this.posicao == -1){
            return true;
        }
        return false;
    }
    public int size(){
        if(this.isEmpty()){
            return 0;
        }
        return this.posicao + 1;
    }
    public void Add(Object valor){
        if(this.posicao < this.pilha.length -1){
            this.pilha[++posicao] = valor;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inverte inverte = new Inverte();
        for(int i = 0; i < inverte.pilha.length; i++){
            inverte.Add(i);
           // for(int j = 10; j > inverte.pilha.length; j--){
            //    this.pilha[i] == inverte.pilha[j];
           // }
        }
    }
      
    
}
