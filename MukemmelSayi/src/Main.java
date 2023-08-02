public class Main {
    public static void main(String[] args) {
        int sayi=25;
        int kalan=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                kalan=kalan+i;
            }
        }
        if (kalan==sayi){
            System.out.println(sayi+" Mükemmel Sayı");
        }
        else
            System.out.println(sayi+" Mükemmel Sayı Değil");
    }
}