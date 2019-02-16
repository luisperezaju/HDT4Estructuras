import java.util.ArrayList;
import java.util.Vector;

public class MyStackA<E> implements Stack<E>{
protected ArrayList<E> miArrayList;
    
    public MyStackA(){
    
        //Crea un vector tamaño 10 y cuando alcance el maximo le suma 2 
    miArrayList = new ArrayList<E>();
    
    }
    
    @Override
    public void push(E item){
    		
        //añade un elemento
        miArrayList.add(item); 
    }
   
    @Override
   public E pop(){
       //returna y elimina el ultimo elemento
       return miArrayList.remove(miArrayList.size()-1);
   }
   
    @Override
   public E peek(){
       //retorna el ultimo valor 
       return miArrayList.get(miArrayList.size()-1);
   }
   
    @Override
   public boolean empty(){
       //retorna true/false dependiendo si esta vacio
       return size()==0;
   }
   
    @Override
   public int size(){
       //retorna el tamaño del vector
       return miArrayList.size();
   }  
}
