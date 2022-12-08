
package com.mycompany.yazilimoryantasyonodev5;

import java.util.Scanner;

public class YazilimOryantasyonOdev5 {

    public static void main(String[] args) {
        // Girilen sayıyı 5'e ve 3'e bölünüp bölünememesine göre sınıflandıran program
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayıyı Giriniz");
        int sayi=input.nextInt();
        
        if(sayi%5==0){
            
            if(sayi%3==0){
                System.out.println(sayi + " sayısı 3'ün ve 5'in ortak katıdır");
            }
            else{
                System.out.println(sayi + " sayısı 5'in katıdır");
            }    
            
        
        }
        else{
            if(sayi%3==0){               
            System.out.println(sayi + " sayısı 3'ün katıdır");
        }
            else{
                System.out.println(sayi + " sayısı 3'ün veya 5'in katı değildir");
        }
            }
            
        
    }
        
}

