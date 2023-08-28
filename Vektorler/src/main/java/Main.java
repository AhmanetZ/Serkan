
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();
        vector.add("Deneme");
        vector.add("Deneme");
        vector.add("Deneme");
        vector.add("Deneme");
        vector.add("Deneme");
        vector.add("Deneme");
        vector.add("Deneme");
        vector.add("Deneme");

        vector.add("Deneme");

        vector.add("Deneme");

        vector.add("Deneme");

        vector.add("Deneme");

        vector.add("Deneme");

        System.out.println("İlk eleman: "+vector.firstElement());//birinci eleman
        for(String s:vector){
            System.out.println(s);
        }
        
    }

}
