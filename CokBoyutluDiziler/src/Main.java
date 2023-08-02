public class Main {
    public static void main(String[] args) {
       String[][] sehirler=new String[3][3];
        sehirler[0][0]="Ankara";
        sehirler[0][1]="Konya";
        sehirler[0][2]="Yozgat";
        sehirler[1][0]="Adıyaman";
        sehirler[1][1]="Gaziantep";
        sehirler[1][2]="Şanlıurfa";
        sehirler[2][0]="İzmir";
        sehirler[2][1]="Aydın";
        sehirler[2][2]="Manisa";
        for (int i=0;i<3;i++){
            System.out.println("*************************************");
            for (int j=0;j<3;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}