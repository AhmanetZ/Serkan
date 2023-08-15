/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopatm;


public class Main {
  public static void main(String[] args)
  {
      ATM atm=new ATM();
      Hesap hesap=new Hesap("Serkan","123456",2000);
      
      atm.calıs(hesap);
      System.out.println("Programdan çıkılıyor...");
      
  }    
}
