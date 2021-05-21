package equalsandsort;

import java.util.ArrayList;
import java.util.List;

public class EqualsAndSort {

    public static void main(String[] args) {
        
        /*
        
        Zmogus z1 = new Zmogus("Jonas", "Jonaitis");
        Zmogus z2 = new Zmogus("Jonas", "Jonaitis");
        //kitas, nes ir tokie patys parametrai, tai yra skirtingi objektai
        if (z1 == z2) {
            System.out.println("tas pats");
        }else{
            System.out.println("Kitas");
        }
        //kitas, nes ir tokie patys parametrai, tai yra skirtingi objektai, pries pakeiciant metodo veikima
        //po pakeitimo tas pats, nes lyginom tik vardus su pavardem
        if (z1.equals(z2)) {
            System.out.println("tas pats");
        }else{
            System.out.println("kitas");
        }
        
        
        String s1 = "abc";
        String s2 = "def";
        
        System.out.println(s1);
        System.out.println(s2);
        
        if (s1.compareTo(s2) > 0) {
            System.out.println("didesnis s1 (didejimo tvarka)");
            System.out.println(s1);
            System.out.println(s2);
        }else {
            System.out.println("didsnis s2 (mazejimo tvarka)");
            System.out.println(s2);
            System.out.println(s1);
            
        }
    
        */
        
        List l = new ArrayList();
        l.add("Labas");
        l.add("Pasauli");
        l.add("kaip");
        l.add("tau");
        l.add("sekasi");
        l.add("?");
        System.out.println(l);
    }
}
