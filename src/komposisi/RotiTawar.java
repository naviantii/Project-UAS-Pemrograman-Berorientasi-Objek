/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;
import java.text.DecimalFormat;
/**
 *
 * @author ASUS
 */
public class RotiTawar extends Roti {
    // atribut
    public double komposisiTotalRotiTawar = 2065;
    public double doughRotiTawar = 400;
    public double pcsRotiTawar = komposisiTotalRotiTawar / doughRotiTawar;
    public double tepungTeriguTawar = 1000 / pcsRotiTawar;
    public double gulaPasirTawar = 125 / pcsRotiTawar;
    public double butterTawar = 100 / pcsRotiTawar;
    public double ragiTawar = 20 / pcsRotiTawar;
    public double susuBubukTawar = 250 / pcsRotiTawar;
    public double susuCairTawar = 200 / pcsRotiTawar;
    public double telurTawar = 70 / pcsRotiTawar;
    public double esBatuTawar = 300 / pcsRotiTawar;
    DecimalFormat df=new DecimalFormat("#,###.00");
    // methods
    public double hargaKomposisiRotiTawar(){ // per pcs
        double tepungTerigu = this.hargaTepungTerigu * this.tepungTeriguTawar;
        double gulaPasir = this.hargaGulaPasir * this.gulaPasirTawar;
        double butter = this.hargaButter * this.butterTawar;
        double ragi = this.hargaRagi * this.ragiTawar;
        double susuBubuk = this.hargaSusuBubuk * this.susuBubukTawar;
        double susuCair = this.hargaSusuCair * this.susuCairTawar;
        double telur = this.hargaTelur * this.telurTawar;
        double esBatu = this.hargaEsBatu * this.esBatuTawar;
        double totalHargaKomposisi = tepungTerigu + gulaPasir + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        return totalHargaKomposisi;
    }
    
    public double tambahanVarian1(){
        double beratCoklatVarian1 = 80;
        double hargaBahanVarian1 = beratCoklatVarian1 * this.hargaCoklat;
        return hargaBahanVarian1;
    }
    
       public double tambahanVarian2(){
        double beratKejuVarian2 = 80;
        double hargaBahanVarian2 = beratKejuVarian2 * this.hargaKeju;
        return hargaBahanVarian2;
    }
    

    public void perhitunganVarian1(){
        double profit = 0.5 * (this.hargaKomposisiRotiTawar() + this.tambahanVarian1());
        double harga = this.hargaKomposisiRotiTawar() + this.tambahanVarian1() + profit;
        double hargaNonProfit = this.hargaKomposisiRotiTawar() + this.tambahanVarian1();
        System.out.println("===================================================");
        System.out.println("-------*****PESANAN ROTI TAWAR VARIAN 1*****-------");
        System.out.println("Harga Non Profit Roti Tawar Varian 1: Rp " + df.format(Math.round(hargaNonProfit)));
        System.out.println("Profit Roti Tawar Varian 1          : Rp " + df.format(Math.round(profit)));
        System.out.println("Harga Jual Roti Tawar Varian 1      : Rp " + df.format(Math.round(harga)));
    }
    
    public double hargaVarian1(){
        double profit = 0.5 * (this.hargaKomposisiRotiTawar() + this.tambahanVarian1());
        double harga = this.hargaKomposisiRotiTawar() + this.tambahanVarian1() + profit;
        return harga;
    }
    public double profitVarian1(){
        double profit = 0.5 * (this.hargaKomposisiRotiTawar() + this.tambahanVarian1());
        return profit;
    }

    public void perhitunganVarian2(){
        double profit = 0.5 * (this.hargaKomposisiRotiTawar() + this.tambahanVarian2());
        double harga = this.hargaKomposisiRotiTawar() + this.tambahanVarian2() + profit;
        double hargaNonProfit = this.hargaKomposisiRotiTawar() + this.tambahanVarian2();
        System.out.println("===================================================");
        System.out.println("-------*****PESANAN ROTI TAWAR VARIAN 2*****-------");
        System.out.println("Harga Non Profit Roti Tawar Varian 2: Rp " + df.format(Math.round(hargaNonProfit)));
        System.out.println("Profit Roti Tawar Varian 2          : Rp " + df.format(Math.round(profit)));
        System.out.println("Harga Jual Roti Tawar Varian 2      : Rp " + df.format(Math.round(harga)));
    }
    
    public double hargaVarian2(){
        double profit = 0.5 * (this.hargaKomposisiRotiTawar() + this.tambahanVarian2());
        double harga = this.hargaKomposisiRotiTawar() + this.tambahanVarian2() + profit;
        return harga;
    }
    
    public double profitVarian2(){
        double profit = 0.5 * (this.hargaKomposisiRotiTawar() + this.tambahanVarian2());
        return profit;
    }
}
