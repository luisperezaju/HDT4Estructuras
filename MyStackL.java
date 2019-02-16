import java.util.ArrayList;

public class MyStackL<E> implements Stack<E>{
protected AbstractList<E> miLista;
    
    public MyStackL(AbstractList<E> lista){
    
        //Crea un vector tamaño 10 y cuando alcance el maximo le suma 2 
    miLista = lista;
    
    }
    
    @Override
    public void push(E item){
    		
        //añade un elemento
        miLista.add(item); 
    }
   
    @Override
   public E pop(){
       //returna y elimina el ultimo elemento
       return miLista.remove(miLista.size()-1);
   }
   
    @Override
   public E peek(){
       //retorna el ultimo valor 
       return miLista.get(miLista.size()-1);
   }
   
    @Override
   public boolean empty(){
       //retorna true/false dependiendo si esta vacio
       return size()==0;
   }
   
    @Override
   public int size(){
       //retorna el tamaño del vector
       return miLista.size();
   }  
}

