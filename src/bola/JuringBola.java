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
public class JuringBola extends Lingkaran{
    public double sudutPusat;

    public JuringBola(double sudutPusat, double r) {
        super(r);
        this.sudutPusat = sudutPusat;
    }
    
    public double menghitungLuasJuringBola() {
        return (sudutPusat/360)*super.menghitungLuasLingkaran();
    }
    
    public double menghitungKelilingJuringBola() {
        return ((sudutPusat/360)*super.menghitungKelilingLingkaran())+(2*r);
    }
}
