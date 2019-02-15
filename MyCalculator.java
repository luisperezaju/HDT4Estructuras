/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt2;

/**
 *

 */
public class MyCalculator implements Calculator {
    
    @Override
    public int calculate (int num1, int num2, String op){
        //recibe dos numeros y un operador 
        //dependiendo del operador asi sera la operacion que realice
        // en resta y division se intercambian los operandos por el orden de las operaciones 
        int resultado;
        resultado = 0;
        switch (op){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num2 - num1;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num2 / num1;
                break;
        }
        return resultado;
    }
    
}
