/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Deret Fibonacci Ikhsan : ");
        int a = 0;
        int b = 1;
        int hasil = 0, c;
        
        c = input.nextInt();
        for(int i=1; i<=c; i++){
            a = b;
            b = hasil;
            System.out.print(hasil+" ");
            hasil = a+b;
        }
    }
    
}
