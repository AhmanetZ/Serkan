
/**
 *
 * @author Serkan
 */
public class Main {

    public static void main(String[] args) {

        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void dersCalıs() {
                System.out.println("Ders çalışıyor...");
            }

            @Override
            public void derseGir() {
                System.out.println("Derse giriyorum...");
            }

        };
        ogrenci.dersCalıs();
        ogrenci.derseGir();
        System.out.println("***************************************");
        
        AOgrenci ogrenci2=new AOgrenci("Fatma UÇAR AYDIN",214) {
            @Override
            void kayıtYapılır() {
                System.out.println("Başarılı bir şekilde kayıt yapıldı..."+" İsim: "+getIsim()+" Numara: "+getNumara());
            }
        };
        ogrenci2.kayıtYapılır();
        ogrenci2.selamla();

    }

    public interface IOgrenci {

        void dersCalıs();

        void derseGir();
    }

    public static abstract class AOgrenci {
        
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        

        abstract void kayıtYapılır();
        
        public void selamla(){
            System.out.println("Hoşgeldiniz...");
    }

    }
}
