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
public class RotiManis extends Roti{
    // atribut
    public double komposisiTotalRotiManis = 2350;
    public double doughRotiManis = 50;
    public double pcsRotiManis = komposisiTotalRotiManis / doughRotiManis;
    public double tepungTeriguManis = 1000 / pcsRotiManis;
    public double gulaPasirManis = 150 / pcsRotiManis;
    public double butterManis = 150 / pcsRotiManis;
    public double ragiManis = 20 / pcsRotiManis;
    public double susuBubukManis = 300 / pcsRotiManis;
    public double susuCairManis = 250 / pcsRotiManis;
    public double telurManis = 80 / pcsRotiManis;
    public double esBatuManis = 400 / pcsRotiManis;
    DecimalFormat df=new DecimalFormat("#,###.00");
    
    // methods
    public double hargaKomposisiRotiManis(){ // per pcs
        double tepungTerigu = this.hargaTepungTerigu * this.tepungTeriguManis;
        double gulaPasir = this.hargaGulaPasir * this.gulaPasirManis;
        double butter = this.hargaButter * this.butterManis;
        double ragi = this.hargaRagi * this.ragiManis;
        double susuBubuk = this.hargaSusuBubuk * this.susuBubukManis;
        double susuCair = this.hargaSusuCair * this.susuCairManis;
        double telur = this.hargaTelur * this.telurManis;
        double esBatu = this.hargaEsBatu * this.esBatuManis;
        double totalHargaKomposisi = tepungTerigu + gulaPasir + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        return totalHargaKomposisi;
    }
    
    public double tambahanVarian1(){
        double beratKejuVarian1 = 5;
        double beratCoklatVarian1 = 10;
        double hargaBahanVarian1 = beratKejuVarian1 * this.hargaKeju + beratCoklatVarian1 * this.hargaCoklat;
        return hargaBahanVarian1;
    }
    
    public double tambahanVarian2(){
        double beratRedBeanVarian2 = 10;
        double beratKrimVanillaVarian2 = 5;
        double hargaBahanVarian2 = beratRedBeanVarian2 * this.hargaSelaiRedBean + beratKrimVanillaVarian2 * this.hargaKrimVanilla;
        return hargaBahanVarian2;
    }
    public double tambahanVarian3(){
        double beratKejuVarian3 = 10;
        double beratSosisVarian3 = 10;
        double hargaBahanVarian3 = beratKejuVarian3 * this.hargaKeju + beratSosisVarian3 * this.hargaSosis;
        return hargaBahanVarian3;
    }
    
    public void perhitunganVarian1(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian1());
        double harga = this.hargaKomposisiRotiManis() + this.tambahanVarian1() + profit;
        double hargaNonProfit = this.hargaKomposisiRotiManis() + this.tambahanVarian1();
        System.out.println("===================================================");
        System.out.println("-------*****PESANAN ROTI MANIS VARIAN 1*****-------");
        System.out.println("Harga Non Profit Roti Manis Varian 1: Rp " + df.format(Math.round(hargaNonProfit)));
        System.out.println("Profit Roti Manis Varian 1          : Rp " + df.format(Math.round(profit)));
        System.out.println("Harga Jual Roti Manis Varian 1      : Rp " + df.format(Math.round(harga)));
    }
    
    public double hargaVarian1(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian1());
        double harga = this.hargaKomposisiRotiManis() + this.tambahanVarian1() + profit;
        return harga;
    }
    public double profitVarian1(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian1());
        return profit;
    }

    public void perhitunganVarian2(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian2());
        double harga = this.hargaKomposisiRotiManis() + this.tambahanVarian2() + profit;
        double hargaNonProfit = this.hargaKomposisiRotiManis() + this.tambahanVarian2();
        System.out.println("===================================================");
        System.out.println("-------*****PESANAN ROTI MANIS VARIAN 2*****-------");
        System.out.println("Harga Non Profit Roti Manis Varian 2: Rp " + df.format(Math.round(hargaNonProfit)));
        System.out.println("Profit Roti Manis Varian 2          : Rp " + df.format(Math.round(profit)));
        System.out.println("Harga Jual Roti Manis Varian 2      : Rp " + df.format(Math.round(harga)));
    }
    
    public double hargaVarian2(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian2());
        double harga = this.hargaKomposisiRotiManis() + this.tambahanVarian2() + profit;
        return harga;
    }
    
    public double profitVarian2(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian2());
        return profit;
    }
    
    public void perhitunganVarian3(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian3());
        double harga = this.hargaKomposisiRotiManis() + this.tambahanVarian3() + profit;
        double hargaNonProfit = this.hargaKomposisiRotiManis() + this.tambahanVarian3();
        System.out.println("===================================================");
        System.out.println("-------*****PESANAN ROTI MANIS VARIAN 3*****-------");
        System.out.println("Harga Non Profit Roti Manis Varian 3: Rp " + df.format(Math.round(hargaNonProfit)));
        System.out.println("Profit Roti Manis Varian 3          : Rp " + df.format(Math.round(profit)));
        System.out.println("Harga Jual Roti Manis Varian 3      : Rp " + df.format(Math.round(harga)));
    }
    public double hargaVarian3(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian3());
        double harga = this.hargaKomposisiRotiManis() + this.tambahanVarian3() + profit;
        return harga;
    }
    
    public double profitVarian3(){
        double profit = 0.5 * (this.hargaKomposisiRotiManis() + this.tambahanVarian3());
        return profit;
    }
}
