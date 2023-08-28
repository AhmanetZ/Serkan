
package com.mycompany.bankacilikuygulamasi;

/**
 *İnstagram Coding Teknologi
 * @author Serkan
 */
public class main {
    public static void main(String[] args) {
       /* Account account=new Account();
        account.setBakiye(1200);
        account.setHesapNo("21A");
        account.setIsim("Serkan");
        account.setMail("serkanaydin.hsyn@gmail.com");
        account.setTelefonNo("+905436716807");*/
       Account account2=new Account("12EW", 1200.0, "Serkan", "serkanaydin.hsyn@gmail.com", "151515451451");
       account2.paraCekme(2000);
        
    }
    
}
