public class CostumerManager {
    private BaseLogger logger;
    public CostumerManager(BaseLogger logger){
        this.logger=logger;
    }
    public void Add(){
        System.out.println("Ürün Başarılı Bir Şekilde Eklendi");
        this.logger.Log(": Log Mesajı");
    }
}
