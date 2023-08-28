package com.mycompany.idmanprogrami;

import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Instagram Code Tekonogi
 *
 * @author Serkan
 */
public class IdmanProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz");
        System.out.println("*********************************");
        String idmanlar = "Hareket Türleri\n"
                + "Burpe\n"
                + "Puspuh\n"
                + "Situp\n"
                + "Squat";
        System.out.println(idmanlar);
        System.out.print("Burpe Sayısı: ");
        int burpe = scanner.nextInt();
        System.out.print("Puhpuh Sayısı: ");
        int puspuh = scanner.nextInt();
        System.out.print("Situp Sayısı: ");
        int situp = scanner.nextInt();
        System.out.print("Squat Sayısı: ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        Idman ıdman = new Idman(burpe, puspuh, situp, squat);
        System.out.println("İdman Başlıyor Hazır olun");
        int i = 1;
        try (FileWriter writer = new FileWriter("Log.txt")) {
            writer.write("İdman Programı....\n");
            writer.write("Yapılan Burpe Sayısı: " + ıdman.getBurpeeSayısı() + " \n");
            writer.write("Yapılan Puspuh Sayısı: " + ıdman.getPuspuhSayısı()+ " \n");
            writer.write("Yapılan Situp Sayısı: " + ıdman.getSitupSayısı()+ " \n");
            writer.write("Yapılan Squat Sayısı: " + ıdman.getSquatSayısı()+ " \n");

            while (ıdman.ıdmanBittimi() == false) {
                System.out.print("Hareket Türü(Burpe,Puspuh,Situp,Squat): ");
                String hareketTuru = scanner.nextLine();
                System.out.print("Bu hareketten kaç defa yapacaksın: ");
                int hareketSayı = scanner.nextInt();
                scanner.nextLine();
                ıdman.harekerYap(hareketTuru, hareketSayı);
                
                writer.write(i+".İşlem------>Hareket: "+hareketTuru+"Sayı: "+hareketSayı);
                i++;

            }
        } catch (IOException ex) {
            Logger.getLogger(IdmanProgrami.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
