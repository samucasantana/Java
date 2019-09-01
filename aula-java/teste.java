package app;
import java.util.*;
// constructor
public class Teste{
    public class Peca {
        
        private String nome;
    
        //parametros
        public String getNome(){
            return nome;
        }
        //parametros
        public void setNome(String nome){
            this.nome = nome;
        }
       
    }
    //interface da Pilha (conjunto de operações que está classe deverá realizar)
    // parametrizando a classe, assim podemos dizer qual tipo de objeto queremos
    public class Pilha<T>{
        //criando objeto da classe LinkedList
        /**
         * generalizando a inserção de dados para que nossa classe 
         * possa inserir todo tipo de dado, utilizaremos a classe Objetc
         * que todas as classes herdam 
         * 
         * List<T> funciona como um parâmetro/variável em todo o escope de 
         * nossa classe 
         * 
         *  */ 
        
        private LinkedList<T> objetos = new LinkedList<T>();
        //métodos públicos
        public void insere(T t){
            // adicionando items a pilha no final da lista
            this.objetos.add(t);
        }
        public T remove(){
            // removendo o ultimo elemento
            // caso a pilha esteja vazia ocerrerá um erro 
            //IndexOutOfBoundsException
           return this.objetos.remove(this.objetos.size() - 1);
        }
        public boolean vazia(){
            return this.objetos.size() == 0;
        }
    }
    public static void main(String[] args) {
        Pilha<Peca> pilha = new Pilha<Peca>();
    
        Peca peca = new Peca();
        pilha.insere(peca);
    
      //  Peca pecaRemove = pilha.remove();
    
        if (pilha.vazia()) {
          System.out.println("A pilha está vazia");
        }
    
        Pilha<String> pilha2 = new Pilha<String>();
        pilha2.insere("Adalberto");
        pilha2.insere("Maria");
    
        String maria = pilha2.remove();
        String adalberto = pilha2.remove();
    
        System.out.println(maria);
        System.out.println(adalberto);
      }

    }
    
