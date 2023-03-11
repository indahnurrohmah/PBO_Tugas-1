/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

/**
 *
 * @author HP
 */
public class Lingkaran {
    protected final double PHI = 3.14;
    protected double r, luas, keliling;

    public Lingkaran(double r) {
        this.r = r;
    }
    
    public double menghitungLuasLingkaran() {
        luas = PHI*r*r;
        return luas;
    }
    protected double menghitungKelilingLingkaran(){
        keliling = PHI*2*r;
        return keliling;
    }
}
