
package com.mycompany.yazilimoryantasyonodev3;
import java.util.Scanner;
public class YazilimOryantasyonOdev3 {

    public static void main(String[] args) {
        System.out.println("******************MENÜ********************");
        System.out.println("Bilet=8TL   Mısır=2TL   Kola=2   Su=1TL   ");
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Kaç bilet alacaağınızı giriniz: ");
        int bilet=input.nextInt();
        
        System.out.println("Kaç mısır alacağınızı giriniz: ");
        int mısır=input.nextInt();
        
        System.out.println("Kaç kola alacağınızı giriniz: ");
        int kola=input.nextInt();
        
        System.out.println("Kaç su alacağınızı giriniz: ");
        int su=input.nextInt();
        
        int toplam=bilet*8+mısır*2+kola*2+su*1;
        
        System.out.println("Ödemeniz gereken tutar: "+toplam);
        
        
    }
}
