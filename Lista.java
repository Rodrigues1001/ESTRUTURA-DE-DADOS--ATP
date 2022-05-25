package com.mycompany.pucprojeto;
import com.mycompany.pucprojeto.No;

public class Lista {
    private No primeiro;
    private Object primeiroNo;
    
    //Construtor:
    
    public Lista(){
        primeiro = null;
        
    }
    //getter
    public No getPrimeiro() {
        return primeiro;
        
    }
    //Esta vazia:
    public boolean estaVazia(){
       
      if(primeiro == null){
          return true;
      }else {
          return false;
      }
    }
    
    //insere:
    public void inserePrimeiro(int valor){
        No no1 = new No(valor);
        no1.setProximo(primeiro);
        primeiro = no1;
        
    }
    
    //Mostra Listas:
    public void mostrar(){
        if(estaVazia()){
            System.out.println("Lista vazia ");
        }else {
            
            No cursor = primeiro;
            while(cursor != null){
                System.out.println(cursor.getInfo());
                cursor = cursor.getProximo();
            }
        }
    }
    //insere ultimo:
      public void insereUltimo(int valor){
        if(estaVazia()){
            inserePrimeiro(valor);
            
        }else{
            No cursor = primeiro;
            while(cursor.getProximo() !=null){
                cursor = cursor.getProximo();
            }
            No no1 = new No(valor);
            cursor.setProximo(no1);
        }
      }
      //insere depois:
      public void insereDepois(No no, int valor){
          No no1 = new No(valor);
          no1.setProximo(no.getProximo());
          no.setProximo(no1);
          
      }
      //remoção
    
    public No removePrimeiro(){
        
        if(estaVazia()){
            System.out.println("Lista esta Vazia");
            return null;
        }else {
            No cursor = primeiro;
            primeiro = primeiro.getProximo();
            return cursor;
        }
        
    }
    //remove depois
    public void removeDepois(No no){
        
        if(estaVazia()){
            System.out.println("lista Vazia");
            
        }else {
            No anterior = null;
            No cursor = primeiro;
            
            while(cursor.getProximo() !=null){
                
                anterior = cursor;
                cursor = cursor.getProximo();
                
                if(cursor.equals(no)){
                    
                    System.out.println("Removendo  " + cursor.getInfo());
                    
                    anterior.setProximo(cursor.getProximo());
                }
            }
            
        }
    }
    //remove ultimo
    public No removeUltimo(){
        No anterior;
        No no = primeiro;
        
        if(primeiro.getProximo() == null){
            boolean cursor = primeiroNo  == null;
            return no;
                    
        }
        anterior = no;
        boolean ultimo = false;
        while(!ultimo){
            if(no.getProximo()== null){
                ultimo = true;
                anterior.setProximo(null);
            }else {
                anterior = no;
                no = no.getProximo();
            }
            
        }
        return no;
        
    }
    //buscar
    public No buscar(int o){
        No p = primeiro;
        while((p != null) &&(p.getInfo() != o))
          p = p.getProximo();
        return p;
    }
    
    
 }
