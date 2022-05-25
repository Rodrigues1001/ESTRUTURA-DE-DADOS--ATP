import com.mycompany.pucprojeto.Lista;
import com.mycompany.pucprojeto.No;

public class Main{
    
    public static void main(String[] args){
        
       Lista lista = new Lista();
       
       lista.inserePrimeiro(55);
       lista.inserePrimeiro(30);
       No no1 = lista.getPrimeiro();
       lista.insereDepois(no1, 35);
       lista.insereUltimo(100);
       
       lista.mostrar();
       System.out.println("Todos inseridos ");
       System.out.println("Removido Primeiro o " + lista.removePrimeiro().getInfo());
       lista.mostrar();
       System.out.println("O escolhido para remover foi o " + lista.getPrimeiro().getProximo().getInfo());
       lista.removeDepois(lista.getPrimeiro().getProximo());
       lista.mostrar();
       System.out.println("Removido ultimo " + lista.removeUltimo().getInfo());
       lista.mostrar();
       
       lista.inserePrimeiro(45);
       System.out.println("Inserido para busca ");
       lista.mostrar();
