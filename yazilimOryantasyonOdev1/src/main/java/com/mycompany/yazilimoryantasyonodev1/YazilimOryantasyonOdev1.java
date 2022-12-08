
package com.mycompany.yazilimoryantasyonodev1;
import java.util.Scanner;
public class YazilimOryantasyonOdev1 {

    public static void main(String[] args) {
        // BKİ hesaplayıp kullanıcının sonucunu sınıflandıran program
        
 
        System.out.println("Beden Kitle İndeksi Hesaplama ve Sınıflandırma Programı");
        System.out.println("*********************************************************");
        
        System.out.println("\n\n\n");
        
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("Kütlenizi Kilogram Cinsinden Giriniz");
        double kg = input.nextDouble();
        
        
        System.out.println("Boyunuzu metre cinsinden giriniz: Örn: 1,70");
        double boy = input.nextDouble();
        
        double bki=kg/(boy*boy);
        
        if(bki<18.5){
            System.out.println("BKİ: "+bki+"  "+"ZAYIF");
        }
        
        if(18.5<=bki && 24.9>bki){
            System.out.println("BKİ: "+bki+"  "+"NORMAL");
        }
        
        if(24.9<=bki && 29.9>bki){
            System.out.println("BKİ: "+bki+"  "+"KİLOLU");
        }
        
        if(29<=bki){
            System.out.println("BKİ"+bki+"  "+"OBEZ");
        
        }
        
       
         
            
        
        
        
        
        
        
    }
}
