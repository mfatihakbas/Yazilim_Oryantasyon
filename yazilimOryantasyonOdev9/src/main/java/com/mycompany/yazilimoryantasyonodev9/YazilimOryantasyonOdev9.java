
package com.mycompany.yazilimoryantasyonodev9;

import java.util.Scanner;

public class YazilimOryantasyonOdev9 {
    /*
    geometri menüsü programı
    içerikler:
        daire çevresi hesaplama
        dörtgen çevresi hesaplama
        daire alanı hesaplama        
        düzgün dörtgen alanı hesaplama
        dik üçgen alanı hesaplama
    */ 
               
    public static void main(String[] args) {
        System.out.println("**************************Geometri Menüsü Programı**************************");
        System.out.println("Menüler:");
        
        System.out.println("1- Daire ");
        System.out.println("2- Üçgen ");
        System.out.println("3- Dikdörtgen ");
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("İşlemler yapmak istediğiniz geometrik şeklin numarasını giriniz: ");
        int sekil=input.nextInt();
        
        switch (sekil) {
            case 1:
                final double pi= 3.14;
                System.out.println("a- Dairenin Alanını Hesaplama ");
                System.out.println("b- Dairenin Çevresini Hesaplama ");
                
                System.out.println("Yapmak istediğiniz işlemin başındaki harfi giriniz: ");
                String islem=input.next();
                
                switch (islem) {
                    case "a":
                        System.out.println("Dairenin yarı çapını giriniz: ");
                        double yaricap=input.nextDouble();
                        double alan= pi*yaricap*yaricap;                        
                        System.out.println("Alan= "+alan);
                        break;
                    
                    case "b":
                        System.out.println("Dairenin yarı çapını giriniz: ");
                        double yaricap1=input.nextDouble();
                        double cevre= 2*pi*yaricap1;                        
                        System.out.println("Çevre= "+cevre);
                        break;
                        
                    default:
                        System.out.println("Hatalı bir giriş yaptınız");
                        break;
                } 
            break;
            
            case 2: 
                System.out.println("a- Üçgenin çevresini hesaplama ");
                System.out.println("b- Dik üçgenin alanını hesaplama ");
                
                System.out.println("Yapmak istediğiniz işlemin başındaki harfi giriniz: ");
                String islem1=input.next();
                
                switch (islem1) {
                    case "a":
                        System.out.println("Üçgenin kenarlarını giriniz: ");
                        double kenar1=input.nextDouble();
                        double kenar2=input.nextDouble();
                        double kenar3=input.nextDouble();
                        double cevre= kenar1+kenar2+kenar3;                        
                        System.out.println("Çevre= "+cevre);
                        break;
                    
                    case "b":
                        System.out.println("Kenarın ve o kenarı dik kesen kenarız uzunluklarını giriniz: ");
                        double kenar=input.nextDouble();
                        double dikKenar=input.nextDouble();
                        double alan= kenar*dikKenar/2;                        
                        System.out.println("Alan= "+alan);
                        break;
                        
                    default:
                        System.out.println("Hatalı bir giriş yaptınız");
                        break;
                }
            break;
            
            case 3: 
                System.out.println("a- Dörtgenin çevresini hesaplama ");
                System.out.println("b- Düzgün dörtgenin alanını hesaplama ");
                
                System.out.println("Yapmak istediğiniz işlemin başındaki harfi giriniz: ");
                String islem2=input.next();
                
                switch (islem2) {
                    case "a":
                        System.out.println("Dörtgenin kenarlarını giriniz: ");
                        double kenar1=input.nextDouble();
                        double kenar2=input.nextDouble();
                        double kenar3=input.nextDouble();
                        double kenar4=input.nextDouble();
                        double cevre= kenar1+kenar2+kenar3+kenar4;                        
                        System.out.println("Çevre= "+cevre);
                        break;
                    
                    case "b":
                        System.out.println("Birbirini dik kesen iki kenarın uzunluğunu giriniz ");
                        double kenar=input.nextDouble();
                        double dikKenar=input.nextDouble();
                        double alan= kenar*dikKenar;                        
                        System.out.println("Alan= "+alan);
                        break;
                        
                    default:
                        System.out.println("Hatalı bir giriş yaptınız");
                        break;
                }    
            break;   
                
            default:
                System.out.println("Hatalı bir giriş yaptınız");  
            break;
        }
    }
}
