/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author samuel.silva
 */
public class HashTable {
    public int Hash[];
    public HashTable(int caphax){
        Hash = new int[caphax];
    }

   
    public int functionEspalha(int chave){
        return chave -1;
    }
    public int getCaphax(){
        return Hash.length;
    }
    public void add(int chave, int q){
        int i = functionEspalha(chave);
        Hash[i] = q;
    }
    public int Atualiza(int chave,int q){
        int i = functionEspalha(chave);
        
        int r = Hash[i];
        Hash[i] = q;
        return r;
    }
    public String Tostring(){
        String s = "";
        for(int i = 0; i < Hash.length; i++){
            s = s + "\n codigo: " + (i + 1) + " IQ :" + Hash[i];
        }
        return s;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      HashTable hash = new HashTable(5);
      System.out.println(hash.Tostring());
      
    }
    
}
