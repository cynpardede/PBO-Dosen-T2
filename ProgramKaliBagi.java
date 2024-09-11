/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

public class ProgramKaliBagi {
    public static int kaliDua(int n){
        return n << 1;
    } 
    public static int bagiDua(int n){
        return n >> 1;
    }
    public static void main(String[]args){
        int angka = 0;
        int hasilKali = kaliDua(angka);
        int hasilBagi = bagiDua(angka);
        
        System.out.println("Perkalian "+ angka +"dengan 2= "+hasilKali);
        System.out.println("Pembagian "+ angka + "dengan 2= "+hasilBagi);
    } 
}
