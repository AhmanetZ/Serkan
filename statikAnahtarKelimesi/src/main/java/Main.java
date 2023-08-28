/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        Seyirci seyirci1 =new Seyirci("Serkan Aydın");
        Seyirci seyirci2 =new Seyirci("Farhat Aydın");
         
        seyirci1.oyunSeyret();
        System.out.println("Oyuncu Sayısı: "+Seyirci.seyirciSayısı);
                }  
}
