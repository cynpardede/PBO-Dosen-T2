/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Pengurangan {
    public static void main (String[]args){
        int x,y,z;
        x= 42;
        y= x--; //y=(42), lalu x = y-1 (x=41)
        
        System.out.println("Nilai x: "+x);//41
        System.out.println("Nilai y: "+y); //42
        
        z = --x; //z = x-1 (x->40)
        
        System.out.println("Nilai x: "+x); //40
        System.out.println("Nilai z: "+z); //40
                
    }
}
