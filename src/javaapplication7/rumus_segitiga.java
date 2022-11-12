package javaapplication7;

import java.util.Scanner;

public class rumus_segitiga {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double alas, tinggi, sisimiring, keliling, luas;
    System.out.print("masukkan alas anda=");
    alas=input.nextInt();
    System.out.print("masukkan tinggi anda=");
    tinggi=input.nextInt();
    sisimiring=(int) Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi, 2));
    System.out.println("nilai sisimiring anda="+ sisimiring);
    keliling= alas + tinggi + sisimiring;
    System.out.println("keliling segitiga anda adalah="+ keliling);
    luas= 0.5 * alas * tinggi;
    System.out.println("luas segitiga anda ialah="+ luas);
    }
        
    }
