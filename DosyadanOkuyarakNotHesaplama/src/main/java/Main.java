
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Serkan
 */
public class Main {

    public static String harfNotu(String isim, int vize1, int vize2, int finalNotu) {
        String cıktı = " ";
        double toplamNot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalNotu * 4 / 10.0);

        if (toplamNot >= 90) {
            cıktı = isim + " bu dersten AA puan aldı";
        } else if (toplamNot >= 85) {
            cıktı = isim + " bu dersten AB puan aldı";
        } else if (toplamNot >= 80) {
            cıktı = isim + " bu dersten BB puan aldı";
        } else if (toplamNot >= 75) {
            cıktı = isim + " bu dersten BC puan aldı";
        } else if (toplamNot >= 70) {
            cıktı = isim + " bu dersten CC puan aldı";
        } else if (toplamNot >= 65) {
            cıktı = isim + " bu dersten CD puan aldı";
        } else if (toplamNot >= 60) {
            cıktı = isim + " bu dersten DD puan aldı";
        } else if (toplamNot >= 55) {
            cıktı = isim + " bu dersten DF puan aldı";
        } else if (toplamNot < 55) {
            cıktı = isim + " bu dersten FF puan aldı";
        }
        return cıktı;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("dosya.txt")); FileWriter write = new FileWriter("harfNotu.txt")) {

            while (scanner.hasNextLine()) {

                String ögrenciBilgileri = scanner.nextLine();
                String[] ögrenciArray = ögrenciBilgileri.split(",");
               
                int vize1 = Integer.valueOf(ögrenciArray[1]);
                int vize2 = Integer.valueOf(ögrenciArray[2]);
                int finalNotu = Integer.valueOf(ögrenciArray[3]);
                
              String cikti=harfNotu(ögrenciArray[0], vize1, vize2, finalNotu);
              write.write(cikti+"  \n");

            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya oluşturulurken hata oluştu.");

        } catch (IOException ex) {
            System.out.println("Bilgiler kayıt edilirken hata oluştu.");

        }

    }

    private static String harfNotu(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
