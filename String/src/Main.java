import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj="Neden bunu şuan yapıyorsun?";
        System.out.println(mesaj.length());
        System.out.println(mesaj.toUpperCase(Locale.ROOT));//Bütün harfleri büyük yazar.
        System.out.println(mesaj.toLowerCase());//Bütün harfleri küçük yazar.
        System.out.println(mesaj.indexOf('a'));//arattığınız karakterin hangi sırada olduğunu gösterir.
        System.out.println(mesaj.concat("İnanamıyorum"));//istediğiniz kelimeyi cümleye ekler;
        System.out.println(mesaj.charAt(6));//yazdığınız sırada hangi karakter varsa onu gösterir.
        System.out.println(mesaj.startsWith("N"));//Cümle Yazdığımız harfle başlayıp başlamadığnı gösterir.
        System.out.println(mesaj.endsWith("?"));//Cümle Yazdığımız harfle bitip bitmediğini  gösterir.
        System.out.println(mesaj.replace(' ','-' ));//cümleyi yeniden düzenlemek için kullanılır.
        System.out.println(mesaj.substring(4));//Cümlenin nerden başlamasını istiyorsan o zmana kullanıyorsun.
        for (String kelime:mesaj.split(" ")){
            // cümleyi parçalamaya yarıyor.
            System.out.println(kelime);
        }
    }
}