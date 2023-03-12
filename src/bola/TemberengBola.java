/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;
import lingkaran.Lingkaran;
/**
 *
 * @author HP
 */
public class TemberengBola extends Lingkaran {
    public double tinggi;

    public TemberengBola(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public double menghitungVolumeTemberengBola() {
        return (super.PHI*Math.pow(tinggi, 2)/3)*(3*r-tinggi);
    }
    
    public double menghitungLuasPermukaanTemberengBola() {
        return super.menghitungKelilingLingkaran()*tinggi;
    }
}
