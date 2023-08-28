public class Main {
    public static void main(String[] args) {
Product product=new Product();
product.setId(1);
product.setName("Casper");
product.setUnitPrice(12500);
product.setExlaption("Bilgisayar");
product.setStokAmount(5);
ProductManger productManger=new ProductManger();
productManger.add(product);
System.out.println(product.getKod());

    }
}