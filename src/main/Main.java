/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
import tabung.Tabung;
import kerucut.KerucutPenuh;
import kerucut.KerucutTerpancung;
import bola.Bola;
import bola.JuringBola;
import bola.KeratanBola;
import bola.TemberengBola;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        char pilihMenu, ulangiMenu;
        double tinggi, jari, sudut, jariAtas, jariBawah;
        //untuk kerucut terpancung
        double jariTutup;
        
        
        Scanner input = new Scanner(System.in);
        
        do{
        
        System.out.println("==========\nMenu Utama\n==========");
        System.out.println("1. Hitung Tabung");
        System.out.println("2. Hitung Kerucut"); 
        System.out.println("3. Hitung Bola");
        System.out.println("0. Exit");
        System.out.print("Pilih: ");
        pilihMenu = input.next().charAt(0);
        
        switch (pilihMenu){
            case '0' :
                System.exit(0);
                break;
            case '1' :  
                System.out.println("=============\nHitung Tabung\n=============");
                System.out.print("Input Jari-jari: ");
                jari = input.nextDouble();  
                System.out.print("Input Tinggi: ");
                tinggi = input.nextDouble();  
                
                Tabung tabung = new Tabung(tinggi, jari);
                
                System.out.println("Luas Permukaan Tabung = " + tabung.menghitungLuasPermukaanTabung());
                System.out.println("Volume Tabung = " + tabung.menghitungVolumeTabung());
                
                break;

            case '2' : 
                System.out.println("==============\nHitung Kerucut\n==============");
                System.out.println("1. Hitung Kerucut Penuh");
                System.out.println("2. Hitung Kerucut Terpancung");
                System.out.print("Pilih: ");
                pilihMenu = input.next().charAt(0);
                
                if(pilihMenu=='1'){
                    System.out.print("Input Jari-jari: ");
                    jari = input.nextDouble();  
                    System.out.print("Input Tinggi: ");
                    tinggi = input.nextDouble();  
                
                    KerucutPenuh kerucutPenuh = new KerucutPenuh(tinggi, jari);
                
                    System.out.println("Luas Permukaan Kerucut Penuh = " + kerucutPenuh.menghitungLuasPermukaanKerucut());
                    System.out.println("Volume Kerucut Penuh = " + kerucutPenuh.menghitungVolumeKerucut());
                
                }
                
                else if(pilihMenu=='2'){
                    System.out.print("Input Jari-jari Alas: ");
                    jari = input.nextDouble();  
                    System.out.print("Input Jari-jari Tutup: ");
                    jariTutup = input.nextDouble();  
                    System.out.print("Input Tinggi: ");
                    tinggi = input.nextDouble();  
                
                    KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(jari, jariTutup, tinggi);
                
                    System.out.println("Luas Permukaan Kerucut Terpancung = " + kerucutTerpancung.menghitungLuasPermukaanKerucutTerpancung());
                    System.out.println("Volume Kerucut Terpancung = " + kerucutTerpancung.menghitungVolumeKerucutTerpancung());
                
                }
                
                else{
                    System.out.println("Pilihan yang dimasukkan salah.\n");
                }              
                break;
                
            case '3' :
                System.out.println("===========\nHitung Bola\n===========");
                System.out.println("1. Hitung Bola");
                System.out.println("2. Hitung Juring Bola");
                System.out.println("3. Hitung Keratan Bola");
                System.out.println("4. Hitung Tembereng Bola");
                System.out.print("Pilih: ");
                pilihMenu = input.next().charAt(0);
                
                switch(pilihMenu){
                    case '1' :
                        System.out.print("Input Jari-jari: ");
                        jari = input.nextDouble();  
                        
                        Bola bola = new Bola(jari);
                        
                        System.out.println("Luas Permukaan Bola = " + bola.menghitungLuasPermukaanBola());
                        System.out.println("Volume Bola = " + bola.menghitungVolumeBola());
                
                        break;
                    case '2' :
                        break;
                    case '3' :
                        System.out.print("Input Jari-jari Bola: ");
                        jari = input.nextDouble();
                        System.out.print("Input Jari-jari Lingkaran Atas: ");
                        jariAtas = input.nextDouble();
                        System.out.print("Input Jari-jari Lingkaran Bawah: ");
                        jariBawah = input.nextDouble();
                        System.out.print("Input Tinggi Keratan: ");
                        tinggi = input.nextDouble();
                        
                        KeratanBola keratan = new KeratanBola(jariAtas, jariBawah, tinggi, jari);
                        
                        System.out.println("Luas Selimut Keratan Bola = " + keratan.menghitungLuasSelimutKeratanBola());
                        System.out.println("Volume Keratan Bola = " + keratan.menghitungVolumeKeratanBola());
                        
                        break;
                    case '4' :
                        System.out.print("Input Jari-jari Bola: ");
                        jari = input.nextDouble();
                        System.out.print("Input Tinggi Tembereng: ");
                        tinggi = input.nextDouble();
                        
                        TemberengBola tembereng = new TemberengBola(tinggi, jari);
                        
                        System.out.println("Luas Permukaan Tembereng Bola = " + tembereng.menghitungLuasPermukaanTemberengBola());
                        System.out.println("Volume Tembereng Bola = " + tembereng.menghitungVolumeTemberengBola());
                        
                        break;
                    default :
                        System.out.println("Pilihan yang dimasukkan salah. Silakan ulangi.\n");
                        break;
                }
                
                break;
            default : 
                System.out.println("Input salah. Silakan ulangi.");
                break;
        }
        
            do{
                System.out.println("Ulangi?(Ya: 1||Tidak: 0)");
                ulangiMenu = input.next().charAt(0);
            }while(ulangiMenu != '1' && ulangiMenu != '0');    
        
            
        }while(ulangiMenu == '1');
    }
            
}
