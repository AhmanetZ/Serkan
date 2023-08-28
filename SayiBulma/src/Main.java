public class Main {
    public static void main(String[] args) {
       int[] number=new int[]{1,4,5,7,8,9,3};
       int aranacak=0;
       boolean varmı=false;
       for(int i:number){
           if (i == aranacak) {
               varmı = true;
               break;
           }


       }
       if(varmı)
           System.out.println("Sayı Bulundu");
       else
           System.out.println("Aradığın sayı bulunamadı");
}}