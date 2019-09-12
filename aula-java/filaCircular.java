/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacircular;

/**
 *
 * @author samuel.silva
 */
public class FilaCircular {
    private int dados[];
    private int inicio;
    private int fim;
    private int tam;
    
    // construtor
    public FilaCircular(int c){
       dados = new int[c];
       inicio = 0;
       fim = 0;
       tam = 0;
    }
    public void adiciona(int e){
        if(dados.length == tam){
            System.out.println("Erro");
        }
        else{
            dados[fim] = e;
            tam++;
            fim=(fim+1)%tam;
        }
    }
    public int remove(){
        int r = -1;
        if(tam==0){
            System.out.println("Erro vazia");
        }else{
            r = dados[inicio];
            inicio=(inicio+1)%tam;
            tam--;
        }
        return r;
    }
    public String toString(){
        String s="";
        int i = inicio;
        for(int c = 1; c <= tam; c++){
            s = s + dados[i]+ "\t";
            i = (i + 1) %tam;
        }
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
