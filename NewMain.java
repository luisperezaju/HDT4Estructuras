/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *

 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCalculator calculadora;
        calculadora = new MyCalculator();

        MyStack<Integer> fifo;
        fifo = new MyStack<>();
        int resultado;
        try{
                String miarchivo="C://Users/DIANA/Documents/postfix.txt";
                FileReader lector;
                BufferedReader lector1;
                String datos;
                try{
                        lector = new FileReader(miarchivo);
                        lector1 = new BufferedReader(lector);
                        while ((datos=lector1.readLine())!=null){
                            String[] partes = datos.split("");
                            for (int i=0; i<partes.length; i++){
                                if ((partes[i].equals("+"))||(partes[i].equals("-"))||(partes[i].equals("*"))||(partes[i].equals("/"))){
                                        resultado = calculadora.calculate(fifo.pop(), fifo.pop(), partes[i]);
                                        fifo.push(resultado);
                                        //jTextField1.setText( partes[i]);  
                                }
                                else{
                                    fifo.push(Integer.parseInt(partes[i]));
                                }
                                
                                //jTextField1.setText( partes[i]);
                                   
                                //jTextField1.setText( partes[i]);
                                
                                
                                        
                                    
                                }  
                            }
                        }
                        lector1.close();
                    }
                    catch(FileNotFoundException e){

                    }
                    catch(IOException e){

                    }
        System.out.println(fifo.peek());
    }
    
}
