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
public class KerucutPenuh extends Lingkaran {
    public double tinggi, garisPelukis, a, b;

    public KerucutPenuh(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public double menghitungVolumeKerucut(){
        return (super.menghitungLuasLingkaran()*tinggi)/3;
    }
    
    public double menghitungLuasPermukaanKerucut(){
        a = Math.pow(r, 2);
        b = Math.pow(tinggi, 2);
        garisPelukis = Math.sqrt(a+b);
                
        return (garisPelukis*super.PHI*r)+super.menghitungLuasLingkaran();
    }
    
}
