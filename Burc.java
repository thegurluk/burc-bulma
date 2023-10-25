import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("lütfen ayın kaçında doğduğunuzu giriniz:");
        int gun= input.nextInt();

        System.out.print("lütfen kaçıncı ayda doğduğunuzu giriniz:");
        int ay=input.nextInt();

        if(ay==1){
            if(gun>=1 && gun<20){
                System.out.println("burcunnuz oğlak");
            } else if (gun>=20 && gun<=31) {
                System.out.println("burcunuz kova");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==2) {
            if(gun>=1 && gun<21){
                System.out.println("burcunnuz kova");
            } else if (gun>=21 && gun<=29) {
                System.out.println("burcunuz balık");
            }else {
                System.out.println("hatalı gün girdiniz");
            }

        } else if (ay==3) {
            if(gun>=1 && gun<21){
                System.out.println("burcunnuz balık");
            } else if (gun>=21 && gun<=31) {
                System.out.println("burcunuz koç");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==4) {
            if(gun>=1 && gun<21){
                System.out.println("burcunnuz koç");
            } else if (gun>=21 && gun<=30) {
                System.out.println("burcunuz boğa");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==5) {
            if(gun>=1 && gun<31){
                System.out.println("burcunnuz boğa");
            } else if (gun>=21 && gun<=31) {
                System.out.println("burcunuz ikizler");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==6) {
            if(gun>=1 && gun<22){
                System.out.println("ikizler koç");
            } else if (gun>=22 && gun<=30) {
                System.out.println("burcunuz yengeç");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==7) {
            if(gun>=1 && gun<23){
                System.out.println("burcunnuz yengeç");
            } else if (gun>=23 && gun<=31) {
                System.out.println("burcunuz aslan");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==8) {
            if(gun>=1 && gun<24){
                System.out.println("burcunnuz aslan");
            } else if (gun>=24 && gun<=31) {
                System.out.println("burcunuz başak");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==9) {
            if(gun>=1 && gun<24){
                System.out.println("burcunnuz başak");
            } else if (gun>=24 && gun<=30) {
                System.out.println("burcunuz terazi");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==10) {
            if(gun>=1 && gun<24){
                System.out.println("burcunnuz terazi");
            } else if (gun>=24 && gun<=31) {
                System.out.println("burcunuz akrep");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==11) {
            if(gun>=1 && gun<23){
                System.out.println("burcunnuz akrep");
            } else if (gun>=23 && gun<=30) {
                System.out.println("burcunuz yay");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        } else if (ay==12) {
            if(gun>=1 && gun<22){
                System.out.println("burcunnuz yay");
            } else if (gun>=22 && gun<=31) {
                System.out.println("burcunuz oğlak");
            }else {
                System.out.println("hatalı gün girdiniz");
            }
        }else {
            System.out.println("hatalın ay girdiniz.");
        }
    }
}
