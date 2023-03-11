/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabung;
import lingkaran.Lingkaran;
/**
 *
 * @author HP
 */
public class Tabung extends Lingkaran{
    public double tinggi;

    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public double menghitungVolumeTabung(){
        return super.menghitungLuasLingkaran()*tinggi;
    }
    
    public double menghitungLuasPermukaanTabung(){
        return (2*super.menghitungLuasLingkaran())+(super.menghitungKelilingLingkaran()*tinggi);
    }
           
}
