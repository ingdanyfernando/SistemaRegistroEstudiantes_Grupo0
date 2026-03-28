/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.curva2026;

/**
 *
 * @author dmiranda
 */
public class Curva2026 {

    public static void main(String[] args) {
       Calculadora nuevaCalculadora = new Calculadora();
       
       
try {
        System.out.println(nuevaCalculadora.sumar(5, 10));
        System.out.println(nuevaCalculadora.restar(10, 5));
        System.out.println(nuevaCalculadora.multiplicar(5, 5));
        System.out.println(nuevaCalculadora.dividir(10, 0));
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

}
}
