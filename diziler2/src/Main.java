public class Main {
    public static void main(String[] args) {

    double[] numbers=new double[]{1.4,5.6,7.8,8.9,2.4};
    double total=0;
    for (double number:numbers)
    {
        total=total+number;
    }
    System.out.println(total);
    }
}