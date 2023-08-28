
package com.mycompany.composition;

/**
 *
 * @author Serkan
 */
public class Bilgisayar {
    private Monitor monitor;
    private Kasa kasa;
    private Aanakart aanakart;

      
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    /**
     * @return the aanakart
     */
    public Aanakart getAanakart() {
        return aanakart;
    }

    /**
     * @param aanakart the aanakart to set
     */
    public void setAanakart(Aanakart aanakart) {
        this.aanakart = aanakart;
    }
    
}
