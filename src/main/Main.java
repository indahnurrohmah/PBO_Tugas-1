/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import tabung.Tabung;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Tabung tabung = new Tabung(7,8);
        System.out.println(tabung.menghitungVolumeTabung());
        System.out.println(tabung.menghitungLuasPermukaanTabung());
    }
            
}
