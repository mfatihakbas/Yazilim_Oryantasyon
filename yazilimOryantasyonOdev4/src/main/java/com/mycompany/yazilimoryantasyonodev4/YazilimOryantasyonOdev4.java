
package com.mycompany.yazilimoryantasyonodev4;

import java.util.Scanner;

public class YazilimOryantasyonOdev4 {

    public static void main(String[] args) {
        //Haftadaki günün numarasına göre hangi gün olduğunu yazdıran program
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Haftanın kaçıncı gününü öğrenmek istersiniz? ");
        
        int sayi=input.nextInt();
        
        switch(sayi){
            
            case 1:
                System.out.println("Pazartesi");
                break;
                
            case 2:      
                System.out.println("Salı");
                break;
                
            case 3:
                System.out.println("Çarşamba");
                break;
                
            case 4:
                System.out.println("Perşembe");
                break;
                
            case 5:
                System.out.println("Cuma");
                break;
            
            case 6:
                System.out.println("Cumartesi");
                break;
            
            case 7:
                System.out.println("Pazar");
                break;
                
            default:
                System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}
