/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author ASUS A411UF
 */
public class TerbesarDanterkecil {

    /**
     * @param args the command line arguments
     */

          public static void main(String[] args) {
              // TODO code application logic here

        System.out.println("________Program Nilai Terbesar dan Terkecil Nilai Mahasiswa________");
		System.out.print("Masukkan Nama Petugas : ");
		Scanner scanner = new Scanner(System.in);
                String nama = scanner.next();
                System.out.print("Masukan Banyak Nilai Mahasiswa : ");
                int banyak = scanner.nextInt();
                int[] nilai = new int[banyak];
                System.out.print("Masukan Nilai Mahasiswa ke-" + 1 + " = ");
                nilai[0] = scanner.nextInt();
                int nilaiterbesar = nilai[0];
                int nilaiterkecil = nilai[0];
                for( int i = 1; i < banyak; i++){
                    System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + " = ");
                    nilai[i] = scanner.nextInt();
                    if(nilai[i] > nilaiterbesar)
                        nilaiterbesar = nilai[i];
                    if(nilai[i] < nilaiterkecil)
                        nilaiterkecil = nilai[i];
                }
                
                System.out.println("Nilai terbesar adalah " + nilaiterbesar);
                System.out.println("Nilai terkecil adalah " + nilaiterkecil);
                
                
                
    }
}
 
    

