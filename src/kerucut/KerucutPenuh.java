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
    public double tinggi, garisPelukis, A, B;

    public KerucutPenuh(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public double menghitungVolumeKerucut(){
        return (1/3)*super.menghitungLuasLingkaran()*tinggi;
    }
    
    public double menghitungLuasPermukaanKerucut(){
        A = Math.pow(r, 2);
        B = Math.pow(tinggi, 2);
        garisPelukis = Math.sqrt(A+B);
                
        return (garisPelukis*super.PHI*r)+super.menghitungLuasLingkaran();
    }
    
}
