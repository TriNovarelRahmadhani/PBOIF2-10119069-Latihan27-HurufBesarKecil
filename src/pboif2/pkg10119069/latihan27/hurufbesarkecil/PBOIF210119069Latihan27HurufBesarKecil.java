/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : Program ini berisi program Huruf besar dan kecil
 */
public class PBOIF210119069Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String asliKata;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        asliKata = scanner.nextLine();
        
        String hurufBesar = asliKata.toUpperCase();
        String hurufKecil = asliKata.toLowerCase();
 
        System.out.println("String awal: " + asliKata);
        System.out.println("String huruf besar: " + hurufBesar);
        System.out.println("String huruf kecil: " + hurufKecil);
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");
        }
    }
