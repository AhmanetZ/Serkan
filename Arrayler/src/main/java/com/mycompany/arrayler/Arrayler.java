

package com.mycompany.arrayler;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Arrayler {
    public static void arrayleriGöster(int[]array){
        for(int i=0; i<array.length;i++){
        System.out.println("Dizi elemanı"+(i+1)+" " +array[i]);}
    } 
    public static double arrayOrtalama(int []array){
        int toplam=0;
        for (int i=0;i<array.length;i++){
            toplam=toplam+array[i];
        }
        return ((double)toplam/array.length);
    }

    public static void main(String[] args) {
        
        int[] a ={10,20,35,45,69,85,74};
        arrayleriGöster(a);
        System.out.println("Dizinin ortalaması: "+arrayOrtalama(a));

    }
}
