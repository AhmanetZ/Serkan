
import java.util.InputMismatchException;
import java.util.Scanner;



class kartException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Girmiş Olduğunuz değerde karakter bulunamadı");
       
    }


/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Main {
   
    
    
}
   private static  Kart[][] kartlar=new Kart[4][4];
    
    public static void main(String[] args) throws kartException {
        
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
        
        while(oyunBittimi()==false){
            oyunTahtası();
            tahminEt();
        }
    }
    public static void tahminEt() throws kartException{
        Scanner scanner =new Scanner (System.in);
        try{
        System.out.println("birinci tahimininizi arada bir boşluk olacka şekilde giriniz(Örnek:A T): ");
        int i1=scanner.nextInt();
        int j1=scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        if(kartlar[i1][i1]==null)
        {
            throw new kartException();
        }
        oyunTahtası();
        
         System.out.println("ikinci tahimininizi arada bir boşluk olacka şekilde giriniz(Örnek:A T): ");
        int i2=scanner.nextInt();
        int j2=scanner.nextInt();
        if(kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger())
        {
            System.out.println("Doğru Tahmin.Tebrikler.....");
            kartlar[i2][j2].setTahmin(true);
        }
        else {
            System.out.println("Yanlış tahminde bulundunz.Daha Dikkatli olunuz...");
             kartlar[i1][j1].setTahmin(false);
        }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Hatalı bir işlem yaptınız...");
        }
        
        
    }
    public static boolean oyunBittimi(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()==false){
                    return false;
                }
            }
        }
        return true;
    }
    

    public static void oyunTahtası(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" |"+kartlar[i][j].getDeger()+"|");
                }
                else{
                    System.out.print(" |"+"| ");
                }
            }
            System.out.println(" ");
        }
        
        
    }
}
