/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;
import java.util.Scanner;
import berat.*;
import komposisi.*;
import java.text.DecimalFormat;
/**
 *
 * @author ASUS
 */
public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        // ROTI MANIS VARIAN 1
        System.out.print("Masukkan Jumlah Roti Manis Varian 1 : ");
        int jmlManis1 = input.nextInt();
        
        RotiManis rm1 = new RotiManis();
        rm1.perhitunganVarian1();
        System.out.println("===================================================");
        System.out.println("Jumlah Pesanan                      : " + jmlManis1);
        double totalHargaManis1 = rm1.hargaVarian1() * jmlManis1;
        System.out.println("Harga Pesanan Roti Manis Varian 1   : Rp " + df.format(Math.round(totalHargaManis1)));
        double totalProfitManis1 = rm1.profitVarian1() * jmlManis1;
        System.out.println("Total Profit Roti Manis Varian 1    : Rp " + df.format(Math.round(totalProfitManis1)));
        System.out.println("===================================================");
        BeratRotiManis brm1 = new BeratRotiManis();
        double tepungTeriguManis1 = Math.ceil((brm1.tepungTerigu() *  jmlManis1)*100)/100;
        double gulaPasirManis1 = Math.ceil((brm1.gulaPasir() * jmlManis1)*100)/100;
        double butterManis1 = Math.ceil((brm1.butter() * jmlManis1)*100)/100;
        double ragiManis1 = Math.ceil((brm1.ragi() * jmlManis1)*100)/100;
        double susuBubukManis1 = Math.ceil((brm1.susuBubuk() * jmlManis1)*100)/100;
        double susuCairManis1 = Math.ceil((brm1.susuCair() * jmlManis1)*100)/100;
        double telurManis1 = Math.ceil((brm1.telur() * jmlManis1)*100)/100;
        double esBatuManis1 = Math.ceil((brm1.esBatu() * jmlManis1)*100)/100;
        double kejuManis1 = Math.ceil((brm1.kejuVarian1() * jmlManis1)*100)/100;
        double coklatManis1 = Math.ceil((brm1.coklatVarian1() * jmlManis1)*100)/100;
        double totalBeratManis1 = Math.round(tepungTeriguManis1 + gulaPasirManis1 + butterManis1 + ragiManis1 + susuBubukManis1 + susuCairManis1 + telurManis1 + esBatuManis1 + kejuManis1 + coklatManis1);
        System.out.println("Berat Tepung Terigu                 : " + tepungTeriguManis1 + " gram");
        System.out.println("Berat Gula Pasir                    : " + gulaPasirManis1 + " gram");
        System.out.println("Berat Butter                        : " + butterManis1 + " gram");
        System.out.println("Berat Ragi                          : " + ragiManis1 + " gram");
        System.out.println("Berat Susu Bubuk                    : " + susuBubukManis1 + " gram");
        System.out.println("Berat Susu Cair                     : " + susuCairManis1 + " gram");
        System.out.println("Berat Telur                         : " + telurManis1 + " gram");
        System.out.println("Berat Es Batu                       : " + esBatuManis1 + " gram");
        System.out.println("Berat Keju                          : " + kejuManis1 + " gram");
        System.out.println("Berat Coklat                        : " + coklatManis1 + " gram");
        System.out.println("------------------------------------------------  +");
        System.out.println("Total Berat                         : " + totalBeratManis1 + " gram");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("");
        
        
        // ROTI MANIS VARIAN 2
        System.out.print("Masukkan Jumlah Roti Manis Varian 2 : ");
        int jmlManis2= input.nextInt();
        
        RotiManis rm2 = new RotiManis();
        rm1.perhitunganVarian2();
        System.out.println("===================================================");
        System.out.println("Jumlah Pesanan                      : " + jmlManis2);
        double totalHargaManis2 = rm2.hargaVarian2() * jmlManis2;
        System.out.println("Harga Pesanan Roti Manis Varian 2   : Rp " + df.format(Math.round(totalHargaManis2)));
        double totalProfitManis2 = rm1.profitVarian2() * jmlManis2;
        System.out.println("Total Profit Roti Manis Varian 2    : Rp " + df.format(Math.round(totalProfitManis2)));
        System.out.println("===================================================");
        BeratRotiManis brm2 = new BeratRotiManis();
        double tepungTeriguManis2 = Math.ceil((brm2.tepungTerigu() * jmlManis2)*100)/100;
        double gulaPasirManis2 = Math.ceil((brm2.gulaPasir() * jmlManis2)*100)/100;
        double butterManis2 = Math.ceil((brm2.butter()* jmlManis2)*100)/100;
        double ragiManis2 = Math.ceil((brm2.ragi() * jmlManis2)*100)/100;
        double susuCairManis2 = Math.ceil((brm2.susuCair() * jmlManis2)*100)/100;
        double susuBubukManis2 = Math.ceil((brm2.susuBubuk() * jmlManis2)*100)/100;
        double telurManis2 = Math.ceil((brm2.telur() * jmlManis2)*100)/100;
        double esBatuManis2 = Math.ceil((brm2.esBatu() * jmlManis2)*100)/100;
        double redBeanManis2 = Math.ceil((brm2.redBeanVarian2()* jmlManis2)*100)/100;
        double vanillaManis2 = Math.ceil((brm2.krimVanillaVarian2() * jmlManis2)*100)/100;
        double totalBeratManis2 = Math.round(tepungTeriguManis2 + gulaPasirManis2 + butterManis2 + ragiManis2 + susuBubukManis2 + susuCairManis2 + telurManis2 + esBatuManis2 + redBeanManis2 + vanillaManis2);
        System.out.println("Berat Tepung Terigu                 : " + tepungTeriguManis2 + " gram");
        System.out.println("Berat Gula Pasir                    : " + gulaPasirManis2 + " gram");
        System.out.println("Berat Butter                        : " + butterManis2 + " gram");
        System.out.println("Berat Ragi                          : " + ragiManis2 + " gram");
        System.out.println("Berat Susu Bubuk                    : " + susuBubukManis2 + " gram");
        System.out.println("Berat Susu Cair                     : " + susuCairManis2 + " gram");
        System.out.println("Berat Telur                         : " + telurManis2 + " gram");
        System.out.println("Berat Es Batu                       : " + esBatuManis2 + " gram");
        System.out.println("Berat Selai Red Bean                : " + redBeanManis2 + " gram");
        System.out.println("Berat Krim Vanilla                  : " + vanillaManis2 + " gram");
        System.out.println("------------------------------------------------  +");
        System.out.println("Total Berat                         : " + totalBeratManis2 + " gram");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("");
        
        // ROTI MANIS VARIAN 3
        System.out.print("Masukkan Jumlah Roti Manis Varian 3 : ");
        int jmlManis3= input.nextInt();
        
        RotiManis rm3 = new RotiManis();
        rm1.perhitunganVarian3();
        System.out.println("===================================================");
        System.out.println("Jumlah Pesanan                      : " + jmlManis3);
        double totalHargaManis3 = rm3.hargaVarian3() * jmlManis3;
        System.out.println("Harga Pesanan Roti Manis Varian 3   : Rp " + df.format(Math.round(totalHargaManis3)));
        double totalProfitManis3 = rm1.profitVarian3() * jmlManis3;
        System.out.println("Total Profit Roti Manis Varian 3    : Rp " + df.format(Math.round(totalProfitManis3)));
        System.out.println("===================================================");
        BeratRotiManis brm3 = new BeratRotiManis();
        double tepungTeriguManis3 = Math.ceil((brm3.tepungTerigu() * jmlManis3)*100)/100;
        double gulaPasirManis3 = Math.ceil((brm3.gulaPasir() * jmlManis3)*100)/100;
        double butterManis3 = Math.ceil((brm3.butter()* jmlManis3)*100)/100;
        double ragiManis3 = Math.ceil((brm3.ragi() * jmlManis3)*100)/100;
        double susuCairManis3 = Math.ceil((brm3.susuCair() * jmlManis3)*100)/100;
        double susuBubukManis3 = Math.ceil((brm3.susuBubuk() * jmlManis3)*100)/100;
        double telurManis3 = Math.ceil((brm3.telur() * jmlManis3)*100)/100;
        double esBatuManis3 = Math.ceil((brm3.esBatu() * jmlManis3)*100)/100;
        double kejuManis3 = Math.ceil((brm3.kejuVarian3() * jmlManis3)*100)/100;
        double sosisManis3 = Math.ceil((brm3.sosisVarian3() * jmlManis3)*100)/100;
        double totalBeratManis3 = Math.round(tepungTeriguManis3 + gulaPasirManis3 + butterManis3 + ragiManis3 + susuBubukManis3 + susuCairManis3 + telurManis3 + esBatuManis3 + kejuManis3 + sosisManis3);
        System.out.println("Berat Tepung Terigu                 : " + tepungTeriguManis3 + " gram");
        System.out.println("Berat Gula Pasir                    : " + gulaPasirManis3 + " gram");
        System.out.println("Berat Butter                        : " + butterManis3 + " gram");
        System.out.println("Berat Ragi                          : " + ragiManis3 + " gram");
        System.out.println("Berat Susu Bubuk                    : " + susuBubukManis3 + " gram");
        System.out.println("Berat Susu Cair                     : " + susuCairManis3 + " gram");
        System.out.println("Berat Telur                         : " + telurManis3 + " gram");
        System.out.println("Berat Es Batu                       : " + esBatuManis3 + " gram");
        System.out.println("Berat Keju                          : " + kejuManis3 + " gram");
        System.out.println("Berat Sosis                         : " + sosisManis3 + " gram");
        System.out.println("------------------------------------------------  +");
        System.out.println("Total Berat                         : " + totalBeratManis3 + " gram");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("");
        
        
        // ROTI TAWAR VARIAN 1
        System.out.print("Masukkan Jumlah Roti Tawar Varian 1 : ");
        int jmlTawar1 = input.nextInt();
        
        RotiTawar rt1 = new RotiTawar();
        rt1.perhitunganVarian1();
        System.out.println("===================================================");
        System.out.println("Jumlah Pesanan                      : " + jmlTawar1);
        double totalHargaTawar1 = rt1.hargaVarian1() * jmlTawar1;
        System.out.println("Harga Pesanan Roti Tawar Varian 1   : Rp " + df.format(Math.round(totalHargaTawar1)));
        double totalProfitTawar1 = rt1.profitVarian1() * jmlTawar1;
        System.out.println("Total Profit Roti Tawar Varian 1    : Rp " + df.format(Math.round(totalProfitTawar1)));
        System.out.println("===================================================");
        BeratRotiTawar brt1 = new BeratRotiTawar();
        double tepungTeriguTawar1 = Math.ceil((brt1.tepungTerigu() * jmlTawar1)*100)/100;
        double gulaPasirTawar1 = Math.ceil((brt1.gulaPasir() * jmlTawar1)*100)/100;
        double butterTawar1 = Math.ceil((brt1.butter()* jmlTawar1)*100)/100;
        double ragiTawar1 = Math.ceil((brt1.ragi() * jmlTawar1)*100)/100;
        double susuBubukTawar1 = Math.ceil((brt1.susuBubuk() * jmlTawar1)*100)/100;
        double susuCairTawar1 = Math.ceil((brt1.susuCair() * jmlTawar1)*100)/100;
        double telurTawar1 = Math.ceil((brt1.telur() * jmlTawar1)*100)/100;
        double esBatuTawar1 = Math.ceil((brt1.esBatu() * jmlTawar1)*100)/100;
        double coklatTawar1 = Math.ceil((brt1.coklatVarian1() * jmlTawar1)*100)/100;
        double totalBeratTawar1 = Math.round(tepungTeriguTawar1 + gulaPasirTawar1 + butterTawar1 + ragiTawar1 + susuBubukTawar1 + susuCairTawar1 + telurTawar1 + esBatuTawar1 + coklatTawar1);
        System.out.println("Berat Tepung Terigu                 : " + tepungTeriguTawar1 + " gram");
        System.out.println("Berat Gula Pasir                    : " + gulaPasirTawar1 + " gram");
        System.out.println("Berat Butter                        : " + butterTawar1 + " gram");
        System.out.println("Berat Ragi                          : " + ragiTawar1 + " gram");
        System.out.println("Berat Susu Bubuk                    : " + susuBubukTawar1 + " gram");
        System.out.println("Berat Susu Cair                     : " + susuCairTawar1 + " gram");
        System.out.println("Berat Telur                         : " + telurTawar1 + " gram");
        System.out.println("Berat Es Batu                       : " + esBatuTawar1 + " gram");
        System.out.println("Berat Coklat                        : " + coklatTawar1 + " gram");
        System.out.println("------------------------------------------------  +");
        System.out.println("Total Berat                         : " + totalBeratTawar1 + " gram");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("");
        
        // ROTI TAWAR VARIAN 2
        System.out.print("Masukkan Jumlah Roti Tawar Varian 2 : ");
        int jmlTawar2 = input.nextInt();
        
        RotiTawar rt2 = new RotiTawar();
        rt2.perhitunganVarian2();
        System.out.println("===================================================");
        System.out.println("Jumlah Pesanan                      : " + jmlTawar2);
        double totalHargaTawar2 = rt2.hargaVarian2() * jmlTawar2;
        System.out.println("Harga Pesanan Roti Tawar Varian 2   : Rp " + df.format(Math.round(totalHargaTawar2)));
        double totalProfitTawar2 = rt2.profitVarian2() * jmlTawar2;
        System.out.println("Total Profit Roti Tawar Varian 2    : Rp " + df.format(Math.round(totalProfitTawar2)));
        System.out.println("===================================================");
        BeratRotiTawar brt2 = new BeratRotiTawar();
        double tepungTeriguTawar2 = Math.ceil((brt2.tepungTerigu() * jmlTawar2)*100)/100;
        double gulaPasirTawar2 = Math.ceil((brt2.gulaPasir() * jmlTawar2)*100)/100;
        double butterTawar2 = Math.ceil((brt2.butter()* jmlTawar2)*100)/100;
        double ragiTawar2 = Math.ceil((brt2.ragi() * jmlTawar2)*100)/100;
        double susuBubukTawar2 = Math.ceil((brt2.susuBubuk() * jmlTawar2)*100)/100;
        double susuCairTawar2 = Math.ceil((brt2.susuCair() * jmlTawar2)*100)/100;
        double telurTawar2 = Math.ceil((brt2.telur() * jmlTawar2)*100)/100;
        double esBatuTawar2 = Math.ceil((brt2.esBatu() * jmlTawar2)*100)/100;
        double kejuTawar2 = Math.ceil((brt2.kejuVarian2() * jmlTawar2)*100)/100;
        double totalBeratTawar2 = Math.round(tepungTeriguTawar2 + gulaPasirTawar2 + butterTawar2 + ragiTawar2 + susuBubukTawar2 + susuCairTawar2 + telurTawar2 + esBatuTawar2 + kejuTawar2);
        System.out.println("Berat Tepung Terigu                 : " + tepungTeriguTawar2 + " gram");
        System.out.println("Berat Gula Pasir                    : " + gulaPasirTawar2 + " gram");
        System.out.println("Berat Butter                        : " + butterTawar2 + " gram");
        System.out.println("Berat Ragi                          : " + ragiTawar2 + " gram");
        System.out.println("Berat Susu Bubuk                    : " + susuBubukTawar2 + " gram");
        System.out.println("Berat Susu Cair                     : " + susuCairTawar2 + " gram");
        System.out.println("Berat Telur                         : " + telurTawar2 + " gram");
        System.out.println("Berat Es Batu                       : " + esBatuTawar2 + " gram");
        System.out.println("Berat Keju                          : " + kejuTawar2 + " gram");
        System.out.println("------------------------------------------------  +");
        System.out.println("Total Berat                         : " + totalBeratTawar2 + " gram");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("");
        
        // PIZZA
        System.out.print("Masukkan Jumlah Pizza                 : ");
        int jmlPizza = input.nextInt();
        
        Pizza p1 = new Pizza();
        p1.perhitunganPizza();
        System.out.println("===================================================");
        System.out.println("Jumlah Pesanan                      : " + jmlPizza);
        double totalHargaPizza = p1.hargaPizza() * jmlPizza;
        System.out.println("Harga Pesanan Pizza                 : Rp " + df.format(Math.round(totalHargaPizza)));
        double totalProfitPizza = p1.profitPizza() * jmlPizza;
        System.out.println("Total Profit Roti Pizza             : Rp " + df.format(Math.round(totalProfitPizza)));
        System.out.println("===================================================");
        BeratPizza bp1 = new BeratPizza();
        double tepungTeriguPizza = Math.ceil((bp1.tepungTerigu() * jmlPizza)*100)/100;
        double gulaPasirPizza = Math.ceil((bp1.gulaPasir() * jmlPizza)*100)/100;
        double butterPizza = Math.ceil((bp1.butter()* jmlPizza)*100)/100;
        double ragiPizza = Math.ceil((bp1.ragi() * jmlPizza)*100)/100;
        double susuBubukPizza = Math.ceil((bp1.susuBubuk() * jmlPizza)*100)/100;
        double susuCairPizza = Math.ceil((bp1.susuCair() * jmlPizza)*100)/100;
        double telurPizza = Math.ceil((bp1.telur() * jmlPizza)*100)/100;
        double esBatuPizza = Math.ceil((bp1.esBatu() * jmlPizza)*100)/100;
        double kejuPizza = Math.ceil((bp1.kejuPizza() * jmlPizza)*100)/100;
        double sosisPizza = Math.ceil((bp1.sosisPizza() * jmlPizza)*100)/100;
        double smokedBeefPizza = Math.ceil((bp1.smokedBeefPizza() * jmlPizza)*100)/100;
        double bawangBombayPizza = Math.ceil((bp1.bawangBombayPizza() * jmlPizza)*100)/100;
        double totalBeratPizza = Math.round(tepungTeriguPizza + gulaPasirPizza + butterPizza + ragiPizza + susuBubukPizza + susuCairPizza + telurPizza + esBatuPizza + kejuPizza + sosisPizza + smokedBeefPizza + bawangBombayPizza);
        System.out.println("Berat Tepung Terigu                 : " + tepungTeriguPizza + " gram");
        System.out.println("Berat Gula Pasir                    : " + gulaPasirPizza + " gram");
        System.out.println("Berat Butter                        : " + butterPizza + " gram");
        System.out.println("Berat Ragi                          : " + ragiPizza + " gram");
        System.out.println("Berat Susu Bubuk                    : " + susuBubukPizza + " gram");
        System.out.println("Berat Susu Cair                     : " + susuCairPizza + " gram");
        System.out.println("Berat Telur                         : " + telurPizza + " gram");
        System.out.println("Berat Es Batu                       : " + esBatuPizza + " gram");
        System.out.println("Berat Keju                          : " + kejuPizza + " gram");
        System.out.println("Berat Sosis                         : " + sosisPizza + " gram");
        System.out.println("Berat Smoked Beef                   : " + smokedBeefPizza + " gram");
        System.out.println("Berat Bawang Bombay                 : " + bawangBombayPizza + " gram");
        System.out.println("------------------------------------------------  +");
        System.out.println("Total Berat                         : " + totalBeratPizza + " gram");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("");
    }
    
}
