/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerucut;
import lingkaran.Lingkaran;
/**
 *
 * @author HP
 */
public class KerucutTerpancung extends Lingkaran {
    public double rTutup, rAlas, tinggiKT, tinggiKB, tinggiKK, garisPelukis, a, b, luasSelimutKT;
    //KT = Kerucut Terpancung
    //KB = Kerucut Besar
    //KK = Kerucut Kecil

    public KerucutTerpancung(double r, double rTutup, double tinggiKT) {
        super(r);
        rAlas=r;
        this.rTutup = rTutup;
        this.tinggiKT = tinggiKT;
    }
    
    
    
    public double menghitungVolumeKerucutTerpancung() {
        tinggiKK = (tinggiKT*rTutup)/(rAlas-rTutup);
        tinggiKB = tinggiKT+tinggiKK;
        KerucutPenuh kerucutBesar = new KerucutPenuh(tinggiKB, rAlas);
        KerucutPenuh kerucutKecil = new KerucutPenuh(tinggiKK, rTutup);
        return kerucutBesar.menghitungVolumeKerucut() - kerucutKecil.menghitungVolumeKerucut();
    }
    
    public double menghitungLuasPermukaanKerucutTerpancung(){
        a = Math.pow(rAlas-rTutup, 2);
        b = Math.pow(tinggiKT, 2);
        garisPelukis = Math.sqrt(a+b);
        
        Lingkaran lingkaranAlas = new Lingkaran(rAlas);
        Lingkaran lingkaranTutup = new Lingkaran(rTutup);
        
        luasSelimutKT = super.PHI*garisPelukis*(rAlas+rTutup);
        
        return lingkaranAlas.menghitungLuasLingkaran() + lingkaranTutup.menghitungLuasLingkaran() + luasSelimutKT;
        
    }
  
}
