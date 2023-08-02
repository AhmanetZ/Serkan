public class Main {
    public static void main(String[] args) {

        String [] ogrenciler=new String[4];
        ogrenciler[0]="Ahmet";
        ogrenciler[1]="Mehmet";
        ogrenciler[2]="Veli";
        ogrenciler[3]="Kasım";
        System.out.println(ogrenciler[0]);
        System.out.println(ogrenciler[1]);
        System.out.println(ogrenciler[2]);
        System.out.println(ogrenciler[3]);
        System.out.println("*************************");
        for (int i=0;i<ogrenciler.length;i++)
        {
            System.out.println(ogrenciler[i]);

        }

    }
}