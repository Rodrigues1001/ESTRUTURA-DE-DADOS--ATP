package com.mycompany.pucprojeto;

import org.w3c.dom.Node;

public class No {
    
    private int info;
    private No proximo;
    private Node no;
    
    //Construtor;

    public No(int info) {
        this.info = info;
        this.proximo = null;
    }

    public No() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //gatter setter
    
    public int getInfo(){
        return info;
    }
    public void setInfo(int info){
        this.info = info;
    }
    
    public No getProximo(){
        return proximo;
    }
    
    public void setProximo(No proximo){
        this.proximo = proximo;
     }
    
}
