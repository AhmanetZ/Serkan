public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

}
public static void sayiBulmaca(){
        int[] number=new int[]{1,3,4,5,7,9,0};
        int aranacak=8;
        boolean varmı=false;
        for (int i:number){
            if(i==aranacak){
                varmı=true;
                break;
            }
        }
        if (varmı){
            mesajVer(aranacak);
        }
        else
            System.out.println("Sayı bu dizide mevcut değil");
}
//methot isimleri camel casing olarak yazılır.
public static void mesajVer(int aranacak){
        System.out.println("Aradağın Sayı Bulundu"+aranacak);
}
}