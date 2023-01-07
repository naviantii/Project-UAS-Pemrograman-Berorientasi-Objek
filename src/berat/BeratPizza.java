/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berat;
/**
 *
 * @author ASUS
 */
public class BeratPizza {
    // atribut
    public double komposisiTotalPizza = 1950;
    public double doughPizza = 190;
    public double komposisiPcs = komposisiTotalPizza / doughPizza;
    public double beratTepungTerigu = 1000 / komposisiPcs;
    public double beratGulaPasir = 100 / komposisiPcs;
    public double beratButter = 100 / komposisiPcs;
    public double beratRagi = 20 / komposisiPcs;
    public double beratSusuBubuk = 200 / komposisiPcs;
    public double beratSusuCair = 180 / komposisiPcs;
    public double beratTelur = 50 / komposisiPcs;
    public double beratEsBatu = 300 / komposisiPcs;
    
    // method
    public double tepungTerigu(){
        return beratTepungTerigu;
    }
    
    public double gulaPasir(){
        return beratGulaPasir;
    }
    
    public double butter(){
        return beratButter;
    }
    
    public double ragi(){
        return beratRagi;
    }
    
    public double susuBubuk(){
        return beratSusuBubuk;
    }
    
    public double susuCair(){
        return beratSusuCair;
    }
    
    public double telur(){
        return beratTelur;
    }
    
    public double esBatu(){
        return beratEsBatu;
    }
    
    public double kejuPizza(){
        return 30;
    }
    
    public double sosisPizza(){
        return 50;
    }
    
    public double smokedBeefPizza(){
        return 50;
    }
    
    public double bawangBombayPizza(){
        return 30;
    }
}
