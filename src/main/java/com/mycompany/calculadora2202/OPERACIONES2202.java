/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora2202;

/**
 *
 * @author karla
 */
import javax.swing.JOptionPane;
public class OPERACIONES2202 {
     //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int modulo;
    
    //Métodos
    
   public void leerNumeros(){
       numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el núm 1"));
       numero2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el núm 2"));
    }
   //Método de suma
        
 public void sumar(){
     suma=numero1+numero2;
 }
    //Método de restar
 public void resta(){
     resta=numero1-numero2;
 }
    //Método de multiolicación
 public void multilicacion(){
     multiplicacion=numero1*numero2;
 }
    //Método de división
 public void division(){
     division=numero1/numero2;
 }
    //Modulo 
 public void modulo(){
     modulo=numero1%numero2;
 
 }         
 public void mostrarResultados(){
     System.out.println("La suma es "+suma);
     System.out.println("La resta es "+resta);
     System.out.println("La multiplicacion es "+multiplicacion);
     System.out.println("La division es "+division);
     System.out.println("El modulo es "+ modulo);
 }
 }   
    