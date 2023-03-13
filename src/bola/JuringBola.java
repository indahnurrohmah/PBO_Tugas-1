/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;
import lingkaran.Lingkaran;
import kerucut.KerucutPenuh;
/**
 *
 * @author HP
 */
public class JuringBola extends Lingkaran{
    public double tinggiTembereng, rTembereng;

    public JuringBola(double tinggiTembereng, double r) {
        super(r);
        this.tinggiTembereng = tinggiTembereng;
    }
    
    public double menghitungVolumeJuringBola() {
        return super.menghitungLuasLingkaran()*tinggiTembereng*2/3;
    }
    
    public double menghitungLuasPermukaanJuringBola() {
        rTembereng = Math.sqrt(Math.pow(r, 2)+ Math.pow((r-tinggiTembereng), 2));
        return super.menghitungKelilingLingkaran()*tinggiTembereng + super.PHI*rTembereng*r;
    }
}
