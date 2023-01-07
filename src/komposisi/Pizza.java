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
public class Pizza extends Roti{
    // atribut
    public double komposisiTotalRotiPizza = 1950;
    public double doughRotiPizza = 190;
    public double pcsRotiPizza = komposisiTotalRotiPizza / doughRotiPizza;
    public double tepungTeriguRotiPizza = 1000 / pcsRotiPizza;
    public double gulaPasirRotiPizza = 100 / pcsRotiPizza;
    public double butterRotiPizza = 100 / pcsRotiPizza;
    public double ragiRotiPizza = 20 / pcsRotiPizza;
    public double susuBubukRotiPizza = 200 / pcsRotiPizza;
    public double susuCairRotiPizza = 180 / pcsRotiPizza;
    public double telurRotiPizza = 50 / pcsRotiPizza;
    public double esBatuRotiPizza = 300 / pcsRotiPizza;
    DecimalFormat df=new DecimalFormat("#,###.00");
    // methods
    public double hargaKomposisiPizza(){ // per pcs
        double tepungTerigu = this.hargaTepungTerigu * this.tepungTeriguRotiPizza;
        double gulaPasir = this.hargaGulaPasir * this.gulaPasirRotiPizza;
        double butter = this.hargaButter * this.butterRotiPizza;
        double ragi = this.hargaRagi * this.ragiRotiPizza;
        double susuBubuk = this.hargaSusuBubuk * this.susuBubukRotiPizza;
        double susuCair = this.hargaSusuCair * this.susuCairRotiPizza;
        double telur = this.hargaTelur * this.telurRotiPizza;
        double esBatu = this.hargaEsBatu * this.esBatuRotiPizza;
        double totalHargaKomposisi = tepungTerigu + gulaPasir + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        return totalHargaKomposisi;
    }
    
    public double tambahanPizza(){
        double beratKejuVarian1 = 30;
        double beratSosisVarian1 = 50;
        double beratSmokedBeefVarian1 = 50;
        double beratBawangBombayVarian1 = 30;
        double hargaBahanVarian1 = beratKejuVarian1 * this.hargaKeju + beratSosisVarian1 * this.hargaSosis + beratSmokedBeefVarian1 * this.hargaSmokedBeef + beratBawangBombayVarian1 * this.hargaBawangBombay ;
        return hargaBahanVarian1;
    }

    public void perhitunganPizza(){
        double profit = 0.5 * (this.hargaKomposisiPizza() + this.tambahanPizza());
        double harga = this.hargaKomposisiPizza() + this.tambahanPizza() + profit;
        double hargaNonProfit = this.hargaKomposisiPizza() + this.tambahanPizza();
        System.out.println("===================================================");
        System.out.println("--------------*****PESANAN PIZZA*****--------------");
        System.out.println("Harga Non Profit Pizza              : Rp " + df.format(Math.round(hargaNonProfit)));
        System.out.println("Profit Pizza                        : Rp " + df.format(Math.round(profit)));
        System.out.println("Harga Jual Pizza                    : Rp " + df.format(Math.round(harga)));
    }
    
    public double hargaPizza(){
        double profit = 0.5 * (this.hargaKomposisiPizza() + this.tambahanPizza());
        double harga = this.hargaKomposisiPizza() + this.tambahanPizza() + profit;
        return harga;
    }
    
    public double profitPizza(){
        double profit = 0.5 * (this.hargaKomposisiPizza() + this.tambahanPizza());
        return profit;
    }
}
