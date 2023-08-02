public class Main {
    public static void main(String[] args) {
        int sayi=10;
        boolean asalmı=true;
        for (int i=2; i<sayi ; i++)
        {
            if(sayi%i==0)
            {
                asalmı=false;
            }
            else{

            }

        }
        if(asalmı){
            System.out.println("Girilen Sayı Asal");
        }
        else {
            System.out.println("Girilen Sayı Asal Değil");
        }
    }
}