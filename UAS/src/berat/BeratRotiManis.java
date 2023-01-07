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
public class BeratRotiManis {
    // atribut
    public double komposisiTotalRotiManis = 2350;
    public double doughRotiManis = 50;
    public double komposisiPcs = komposisiTotalRotiManis / doughRotiManis;
    public double beratTepungTerigu = 1000 / komposisiPcs;
    public double beratGulaPasir = 150 / komposisiPcs;
    public double beratButter = 150 / komposisiPcs;
    public double beratRagi = 20 / komposisiPcs;
    public double beratSusuBubuk = 300 / komposisiPcs;
    public double beratSusuCair = 250 / komposisiPcs;
    public double beratTelur = 80 / komposisiPcs;
    public double beratEsBatu = 400 / komposisiPcs;
    
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
    
    public double kejuVarian1(){
        return 5;
    }
    
    public double coklatVarian1(){
        return 10;
    }
    
    public double redBeanVarian2(){
        return 10;
    }
    
    public double krimVanillaVarian2(){
        return 5;
    }
    
    public double kejuVarian3(){
        return 10;
    }
    
    public double sosisVarian3(){
        return 10;
    }
}
