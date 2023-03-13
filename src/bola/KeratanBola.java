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
public class KeratanBola extends Lingkaran{
    public double rAlas, rAtas, rBola, tinggi;

    public KeratanBola(double rAlas, double rAtas, double tinggi, double r) {
        super(r);
        rBola = r;
        this.rAlas = rAlas;
        this.rAtas = rAtas;
        this.tinggi = tinggi;
    }
    
    public double menghitungLuasVolumeKeratanBola() {
        //V=(1/2)*phi*rAlas^2+(1/2)*phi*rAtas^2+(1/6)*phi*t^3
        
        Lingkaran a = new Lingkaran(rAlas);
        Lingkaran b = new Lingkaran(rAtas);
        Lingkaran c = new Lingkaran(tinggi);
        return (a.menghitungLuasLingkaran()/2) + (b.menghitungLuasLingkaran()/2) + (c.menghitungLuasLingkaran()*tinggi/6);
    }
    
    public double menghitungLuasPermukaanKeratanBola() {
        //LP=2*phi*rBola*t
        
        return super.menghitungKelilingLingkaran()*tinggi;
    }
    
    
}
