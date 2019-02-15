/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt2;

/**
 *

 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class HDT2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCalculator calculadora;
        calculadora = new MyCalculator();
        
        MyStack<Integer> fifo;
        fifo = new MyStack<Integer>();
        
        String archivo; 
        FileReader lector;
        BufferedReader lector1;
        String datos;
        try{
            lector = new FileReader(archivo);
            lector1 = new BufferedReader(lector);
            while ((datos=lector1.readLine())!=null){
                String partes[] = datos.split(" ");
                for (int i=0; i<partes.length; i++){
                    try{
                        fifo.push(Integer.parseInt(partes[i]));
                    }
                    catch(NumberFormatException e){
                       if (partes[i]=="+" || partes[i]=="-" || partes[i]=="*" || partes[i]=="/" ){
                            int resultado;
                            try{
                                resultado = calculadora.calculate(fifo.pop(), fifo.pop(), partes[i]);
                                fifo.push(resultado);
                            }
                            catch(ArithmeticException c){

                            }
                        } 
                    }  
                }
            }  
        }
        catch(FileNotFoundException e){
            
        }
        catch(IOException e){
            
        }
        
        
        
    }
    
}
