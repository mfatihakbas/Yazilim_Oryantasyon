
package com.mycompany.yazilimoryantasyonodev8;

import java.util.Scanner;

public class YazilimOryantasyonOdev8 {

    public static void main(String[] args) {
    // Basit hesap makinası programı
    
        System.out.println("***Bu hesap makinası gireceğiniz iki sayı arasında işlem yapabilmektedir***");
        System.out.println("/n");
        System.out.println("*********************************************************************");
        
        Scanner input=new Scanner (System.in);
        System.out.println("1. sayıyı giriniz");
        double sayi1 = input.nextDouble();
        
        System.out.println("Yapmak istediğiniz işlemi giriniz Örn: + - * /");
        String islem = input.next(); // next line yazmamamızın sebebi sadece işareti almak istememiz
        
        System.out.println("2. sayıyı giriniz");
        double sayi2 = input.nextDouble();
        double sonuc;
                
        switch(islem) {
            case "+": 
                sonuc=sayi1+sayi2;
                System.out.println("Sonuç= "+sonuc);
                break;
            
            case "-": 
                sonuc=sayi1-sayi2;
                System.out.println("Sonuç= "+sonuc);
                break;
                         
            case "*": 
                sonuc=sayi1*sayi2;
                System.out.println("Sonuç= "+sonuc);
                break;
            
            case "/": 
                sonuc=sayi1/sayi2;
                System.out.println("Sonuç= "+sonuc);
                break;
                
            default:
                System.out.println("Hatalı bir giriş yaptınız");
                break;
        }
    
    
    }
}
