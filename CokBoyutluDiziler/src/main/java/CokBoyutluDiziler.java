


import java.util.Scanner;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class CokBoyutluDiziler {

    public static void main(String[] args) {
        int [][] arrays=new int [3][3];
        Scanner scanner =new Scanner(System.in);
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Lütfen Dizinize bir değer ekleyin: ");
                arrays[i][j]=scanner.nextInt();
            }
        }
        System.out.println("*************************** ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
}
