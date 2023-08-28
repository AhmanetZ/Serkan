public class Product {
    public String explanation;
    private int stok;
    private  int id;
    private  String name;
    private  double unitPrice;
    private int stokAmount;
    private  String exlaption;
     private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStokAmount() {
        return stokAmount;
    }

    public void setStokAmount(int stokAmount) {
        this.stokAmount = stokAmount;
    }

    public String getExlaption() {
        return exlaption;
    }

    public void setExlaption(String exlaption) {
        this.exlaption = exlaption;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKod() {
        return this.name.substring(0,1)+ id;
    }


}
