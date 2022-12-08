
package com.mycompany.yazilimoryantasyonodev10;


public class YazilimOryantasyonOdev10 {
    // İlk 10 Fibonacci sayısını yazdıran program
    public static void main(String[] args) {
        System.out.println("İlk 10 fibonacci sayısı: ");
       
        int a=1;
        int b=1;        
            
        System.out.print("  "+a);
        System.out.print("  "+b);      
        
        for(int i=1; i<=8; i++){
            
            int c=a+b;
            a=b;
            b=c;
            System.out.print("  "+c);
        }
        
        
        
        
    }
}
