public class Main {
    public static void main(String[] args) {
        char not='D';//java büyük küçük haarfe duyarlıdır;
        switch (not){
            case 'A':System.out.println( "Mükemmel bir not :  Geçtiniz");
            break;
            case 'B':System.out.println( "İyi bir not :  Geçtiniz");
                break;
            case 'C':System.out.println( "Orta bir not :  Geçtiniz");
                break;
            case 'D':System.out.println( "Kötü bir not :  Kaldınız");
                break;
            default:System.out.println("Hatalı bir not girdiniz");
        }
    }
}