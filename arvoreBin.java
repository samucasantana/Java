/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no;

/**
 *
 * @author samuel.silva
 */
public class No {
    
     int elemento;
    No esquerda, direita;
    No (int e){
        elemento= e;
        esquerda= null;
        direita= null;
    }
public class Arvore{
    private No raiz;
        public Arvore ( ){
            raiz=null;
        }
    public void percursoProfundidade (No n){
        if (n!= null){
            System.out.println(n.elemento);
            percursoProfundidade (n.esquerda);
            percursoProfundidade (n.direita);
        }
    }
    public void percursoSimentrico (No m){
        if (m!= null){
            percursoProfundidade (m.esquerda);
            System.out.println(m.elemento);
            percursoProfundidade (m.direita);
        }
    }
    public void percursoPosOrdem (No b){
        if (b!= null){
            percursoProfundidade (b.esquerda);
            percursoProfundidade (b.direita);
            System.out.println(b.elemento);
           
        }
    }
    public void adicionaElemento(int e){
        No novo = new No(e);
    if (raiz == null)
        raiz = novo;
    else{
        No aux1=raiz, aux2=raiz;
        while (aux1 != null){
        aux2=aux1;
        if (e<aux1.elemento)
        aux1=aux1.esquerda;
        else if (e>aux1.elemento)
        aux1=aux1.direita;
    }
    if (e == aux2.elemento)
        System.out.println("Elemento já existe");
    else{
    if (e < aux2.elemento) aux2.esquerda = novo;
    if (e > aux2.elemento) aux2.direita = novo;
           System.out.println("Elemento Incluído");
         }
        } 
    }
    public void verifica(int e){
        No aux=raiz;
        while (aux != null){
        if (e<aux.elemento)
            aux=aux.esquerda;
        else if (e>aux.elemento)
            aux=aux.direita;
        else
            System.out.println("elelel");
        }
    }
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arvore e = new arvore();
    }
    
}
