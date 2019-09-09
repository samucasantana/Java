/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;



/**
 *
 * @author samuel.silva
 */
/*
* Estrutura básica para a lista encadeada 
*/
public class No {
    // informação armazenada 
    private int info;
    // ponteiro para o próximo elemento da lista
    private No prox;
    
    //gettes 
    public int getInfo(){
        return info;
    }
    
    public No getProx(){
        return prox;
    }
    
    //setters
    public void setProx(No prox){
        this.prox = prox;
    }
    
    public void setInfo(int info){
        this.info = info;
    }
    
    
}
