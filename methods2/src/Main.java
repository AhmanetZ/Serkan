public class Main {
    public static void main(String[] args) {
        int toplam =topla(1,6,9,8,10,15);
        System.out.println(toplam);
        

        }

        public static int topla ( int...sayılar){
        int toplam = 0;
            for (int sayi : sayılar) {
                toplam += sayi;

            }

            return toplam;
        }
    }