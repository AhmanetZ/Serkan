
import java.util.ArrayList;

public class Test {
    public static void yazdır(ArrayList<String> a){
        for(int i = 0;i<a.size();i++){
            System.out.println("Element: "+(i+1 )+" "+a.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Futbol");
        arraylist.add("Basketbol");

       arraylist.add("Hentbol");
        arraylist.add("Buz Hokeyi");
        arraylist.add("Golf");
        /* arraylist.remove("Golf");//dizideki bir elemanı silmek için kullanılır.*/
        //System.out.println(arraylist.indexOf("Futbol"));//Elemanın dizideki yerini öğremek için kullanılır.
        //arraylist.set(3, "Okçuluk");//lisstedeki elemanı güncellemek için kullanılır.
       // for (int i = 0; i < arraylist.size(); i++) {
        //    System.out.println(arraylist.get(i));
        //}
        //  System.out.println(arraylist.get(3));//istediğin indeksi yazdırmak için kullanılır.
        //System.out.println(arraylist.size());//listenin kaç elemandan oluştuğunu gösterir.
yazdır(arraylist);
    }
}
