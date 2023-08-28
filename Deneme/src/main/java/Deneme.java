
import java.util.Scanner;


public class Deneme {

    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen Boy Uzunluğunuzu Giriniz:");
		double boy=scanner.nextDouble();
		System.out.println("Lütfen Kilonuzu Giriniz:");
		double kilo=scanner.nextDouble();
		double BKI=kilo/boy*boy;
		System.out.println("Beden Kitle İndeksiniz: "+BKI);
		
    }
}
