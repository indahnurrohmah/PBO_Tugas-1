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
public class Bola extends Lingkaran{

    public Bola(double r) {
        super(r);
    }
    
    public double menghitungVolumeBola(){
        return super.menghitungLuasLingkaran()*r*4/3;
    }
    
    public double menghitungLuasPermukaanBola(){
        return 4*super.menghitungLuasLingkaran();
    }
}
