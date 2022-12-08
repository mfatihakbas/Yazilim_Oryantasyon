
package com.mycompany.yazilimoryantasyonodev2;

import java.util.Scanner;

public class YazilimOryantasyonOdev2 {

    public static void main(String[] args) {
    
    // KULLANICIDAN YER DEĞİŞİMİ VE SÜRENİN ALINMASI İLE ORTALAMA SÜRATİ HESAPLAYAN PROGRAM
    
    System.out.println("KULLANICIDAN YER DEĞİŞİMİ VE SÜRENİN ALINMASI İLE ORTALAMA SÜRATİ HESAPLAYAN PROGRAM");
    System.out.println("*************************************************************************************");
    System.out.println("/n/n");
    
    Scanner input=new Scanner (System.in);
    
    System.out.println("Alınan mesafeyi metre cinsinden giriz: Örn: 100,30m");
    double metre=input.nextDouble();
    
    System.out.println("Girdiğiniz mesafeyi ne kadar sürede gittiğinizi saniye cinsinde giriniz: ");
    double saniye=input.nextDouble();
    
    double ortHiz=metre/saniye;
    
    System.out.println("Ortalama hızınız: "+ortHiz);
    
        
    }
}
