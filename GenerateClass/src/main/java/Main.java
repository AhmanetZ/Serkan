
/**
 * Instagram Code Teknologi
 *
 * @author Serkan
 */
public class Main {

    public static void main(String[] args) {
        Character[] karakter = {'J', 'A', 'V', 'A'};
        String[] diller = {"Java", "C#", "C++", "PHP"};
        Integer[] sayılar = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Ögrenci[] öğrenci = {new Ögrenci("Serkan"), new Ögrenci("Fatma"), new Ögrenci("Ferhat"), new Ögrenci("Meryem")};

        /* CharYazdır.yazdır(karakter);
    StringYazdır.yazdır(diller);
    İntageryazdır.yazdır(sayılar);
    ÖgrenciYazdır.yazdır(öğrenci);*/
        YazdırmaSınıfı<Character> yazdır = new YazdırmaSınıfı<Character>();
        YazdırmaSınıfı<String> yazdır1=new YazdırmaSınıfı<String>();
         YazdırmaSınıfı<Integer> yazdır2 = new YazdırmaSınıfı<Integer>();
          YazdırmaSınıfı<Ögrenci> yazdır3 = new YazdırmaSınıfı<Ögrenci>();
          
          yazdır.yazdır(karakter);
          yazdır1.yazdır(diller);
          yazdır2.yazdır(sayılar);
          yazdır3.yazdır(öğrenci);

    }
}
