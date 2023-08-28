public class Main {
    public static void main(String[] args) {
BaseKrediManager[] baseKrediManagers=new BaseKrediManager[]{new OgretmenKrediManager(),new TarımKrediManager(),new ÖrgrenciKrediManager()};
for (BaseKrediManager krediManagers:baseKrediManagers){
    System.out.println(krediManagers.hesapla(1000));
}
    }
}