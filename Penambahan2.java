/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Penambahan2 {
    public static void main(String[] args) {
        int w,x,y,z;
        x = 5;
        w = 5;
        y = 8-x++; //y=5-5, (x+1); x=6
        z = 8-++w; //w+1 = 6; z = 8-6
        
        System.out.println("Nilai x: "+x); //6
        System.out.println("Nilai y: "+y); //3
        System.out.println("Nilai z: "+z); //2
        System.out.println("Nilai w: "+w); //6
    }
    
}
