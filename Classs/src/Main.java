public class Main {
    public static void main(String[] args) {
CostumerManager costumerManager=new CostumerManager();
costumerManager.Add();
costumerManager.Remove();
costumerManager.Update();
 int sayi1=10;
 int sayi2=20;
 sayi2=sayi1;
 sayi1=30;
 System.out.println(sayi2);
 int[] sayılar1=new int[]{1,2,3,4};
 int[] sayılar2=new int[]{5,6,7,8};
 sayılar2=sayılar1;
 sayılar1[0]=35;
 System.out.println(sayılar2[0]);
    }
}