package com.mycompany.curva2026;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dmiranda
 */
public class Calculadora {
    
    public int sumar(int a, int b){
     return a+b;   
    }
    
    public int restar(int a, int b)
    {
        return a-b;
    }
    
    public int multiplicar(int a, int b)
    {
        return a*b;
    }
    
    public double dividir(int a, int b)
    {
       
if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) a / b;

        
    }
}
