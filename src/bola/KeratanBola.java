/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;
import lingkaran.Lingkaran;

public class KeratanBola extends Lingkaran {
    public double rAtas, rBawah, tinggi;

    public KeratanBola(double rAtas, double rBawah, double tinggi, double r) {
        super(r);
        this.rAtas = rAtas;
        this.rBawah = rBawah;
        this.tinggi = tinggi;
    }
    public double menghitungVolumeKeratanBola(){
        return super.PHI*tinggi/6*(Math.pow(tinggi, 2)+3*Math.pow(rAtas, 2)+3*Math.pow(rBawah, 2));
    }
    
    public double menghitungLuasSelimutKeratanBola(){
        return super.menghitungKelilingLingkaran()*tinggi;
    }
}
