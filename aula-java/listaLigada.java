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
public class Node {
    
    public int dado;
    //objeto do tipo node
    public Node prox;
    
    // construtor 
    public Node(int e){
        dado = e;
        prox = null;
    }
    
    public class listaLigada{
        private Node inicio;
        // declarano o valor nulo
        //embora o java já faça isso por padrão
        public listaLigada(){
            inicio = null;
        }
        public void adicionaInicio(int e){
            // referenciando objeto com parametro
            Node novo = new Node(e);
            novo.prox = inicio;
            inicio = novo;
        }
        public int removeInico(){
            int resp = -1;
            if(inicio == null){
                System.out.println("Erro ! a lista está vazia");
            }
            else{
                resp = inicio.dado;
                inicio = inicio.prox;
                System.out.println(":)");
            }
            return resp;
        }
        public String toString(){
            Node aux = inicio;
            String s = "";
            while(aux != null){
                s = s + aux.dado + " ";
                aux = aux.prox;
            }
            return s;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
