/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsandsort;

/**
 *
 * @author vita
 */
public class Zmogus {

    private String vardas;
    private String pavarde;

    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
//cia persirasem metodo equals() veikima
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Zmogus)) {
            return false;
        }
        //sitoj vietoj mes galim kastint, nes isitikinom, kad tas objektas yra zmogus
        //i o ziuresim per zmogaus prizme, todel matysim visus kintamuosius, kurie yra deklaruoti zmoguje
        Zmogus z = (Zmogus)o;
        
        if (!this.vardas.equals(z.vardas)) {
            return false;
        }
        if (!this.pavarde.equals(z.pavarde)) {
            return false;
        }
        return true;
    }
    
    
    
    

}
