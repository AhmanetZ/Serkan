
package com.mycompany.idmanprogrami;

/**
 *
 * @author Serkan
 */
public class Idman {
    private int burpeeSayısı;
    private int puspuhSayısı;
    private int situpSayısı;
    private int squatSayısı;

    /**
     * @return the burpeeSayısı
     */
    public Idman(int burpeeSayısı,int puspuhSayısı,int situpSayısı,int squatSayısı)
    {
        this.burpeeSayısı=burpeeSayısı;
        this.puspuhSayısı=puspuhSayısı;
        this.situpSayısı=situpSayısı;
        this.squatSayısı=squatSayısı;
    }
    public int getBurpeeSayısı() {
        return burpeeSayısı;
    }

    /**
     * @param burpeeSayısı the burpeeSayısı to set
     */
    public void setBurpeeSayısı(int burpeeSayısı) {
        this.burpeeSayısı = burpeeSayısı;
    }

    /**
     * @return the puspuhSayısı
     */
    public int getPuspuhSayısı() {
        return puspuhSayısı;
    }

    /**
     * @param puspuhSayısı the puspuhSayısı to set
     */
    public void setPuspuhSayısı(int puspuhSayısı) {
        this.puspuhSayısı = puspuhSayısı;
    }

    /**
     * @return the situpSayısı
     */
    public int getSitupSayısı() {
        return situpSayısı;
    }

    /**
     * @param situpSayısı the situpSayısı to set
     */
    public void setSitupSayısı(int situpSayısı) {
        this.situpSayısı = situpSayısı;
    }

    /**
     * @return the squatSayısı
     */
    public int getSquatSayısı() {
        return squatSayısı;
    }

    /**
     * @param squatSayısı the squatSayısı to set
     */
    public void setSquatSayısı(int squatSayısı) {
        this.squatSayısı = squatSayısı;
    }
    public  void harekerYap(String hareketTuru,int hareketSayı){
        if(hareketTuru.equals("Burpe"))
        {
            burpeYap(hareketSayı);
        }
        else if(hareketTuru.equals("Puspuh"))
        {
            puspuhYap(hareketSayı);
        }
        else if(hareketTuru.equals("Situp"))
        {
            situpYap(hareketSayı);
        }
         else if(hareketTuru.equals("Squat"))
        {
            squatYap(hareketSayı);
        }
         else {
             System.out.println("Geçersiz bir Hareket Türü Seçtiniz...");
         }
    }
    public void burpeYap(int hareketSayı){
       if(burpeeSayısı==0) 
       {
           System.out.println("Yapacak Burpe Hareketi Kalmadı.");
       }
       if(burpeeSayısı-hareketSayı<0)
       {
           System.out.println("Tebrikler Hedefiniz Geçtiniz.");
       }
       else {
           burpeeSayısı-=hareketSayı;
           System.out.println("Kalan Burpe Sayısı: "+burpeeSayısı);
       }
    }
    public void  puspuhYap(int hareketSayı){
       if(puspuhSayısı==0) 
       {
           System.out.println("Yapacak Puspuh Hareketi Kalmadı.");
       }
       if(puspuhSayısı-hareketSayı<0)
       {
           System.out.println("Tebrikler Hedefiniz Geçtiniz.");
       }
       else {
           puspuhSayısı-=hareketSayı;
           System.out.println("Kalan Puspuh Sayısı: "+puspuhSayısı);
       }
    }
      public void  situpYap(int hareketSayı){
       if(situpSayısı==0) 
       {
           System.out.println("Yapacak Situp Hareketi Kalmadı.");
       }
       if(situpSayısı-hareketSayı<0)
       {
           System.out.println("Tebrikler Hedefiniz Geçtiniz.");
       }
       else {
           situpSayısı-=hareketSayı;
           System.out.println("Kalan Situp Sayısı: "+situpSayısı);
       }}
       public void  squatYap(int hareketSayı){
       if(squatSayısı==0) 
       {
           System.out.println("Yapacak Squat Hareketi Kalmadı.");
       }
       if(squatSayısı-hareketSayı<0)
       {
           System.out.println("Tebrikler Hedefiniz Geçtiniz.");
       }
       else {
           squatSayısı-=hareketSayı;
           System.out.println("Kalan Squat Sayısı: "+squatSayısı);
       }}
    public boolean ıdmanBittimi(){
        return (burpeeSayısı==0)&&(puspuhSayısı==0)&&(situpSayısı==0)&&(squatSayısı==0);
    }
}
