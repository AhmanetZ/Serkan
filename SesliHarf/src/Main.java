public class Main {
    public static void main(String[] args) {
        char ses='E';
        switch (ses){
            case  'A':
            case 'U':
            case 'O':
            case 'I':
                System.out.println("Kalın Ses Girildi");
            break;
            default:
                System.out.println("Girilen Harf İnce Ses");
        }
    }
}