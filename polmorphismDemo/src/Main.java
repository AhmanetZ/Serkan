public class Main {
    public static void main(String[] args) {
//       BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger(),new PhoneLogger()};
//       for (BaseLogger logger:loggers){
//           logger.Log(": Log Message");
//       }
        CostumerManager costumerManager=new CostumerManager(new DatabaseLogger());
        costumerManager.Add();
    }
}