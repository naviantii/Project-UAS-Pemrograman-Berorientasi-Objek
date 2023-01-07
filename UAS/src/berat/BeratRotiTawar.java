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
public class BeratRotiTawar {
    // atribut
    public double komposisiTotalRotiTawar = 2065;
    public double doughRotiTawar = 400;
    public double komposisiPcs = komposisiTotalRotiTawar / doughRotiTawar;
    public double beratTepungTerigu = 1000 / komposisiPcs;
    public double beratGulaPasir = 125 / komposisiPcs;
    public double beratButter = 100 / komposisiPcs;
    public double beratRagi = 20 / komposisiPcs;
    public double beratSusuBubuk = 250 / komposisiPcs;
    public double beratSusuCair = 200 / komposisiPcs;
    public double beratTelur = 70 / komposisiPcs;
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
    
    public double coklatVarian1(){
        return 80;
    }
    
    public double kejuVarian2(){
        return 80;
    }
}
