import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yas,km,tip;
        double tutar,toplamTutar,indYas,indTip,indTutar;
        System.out.println("******************************");
        System.out.println("Uçak Bileti Fiyatı Hesaplama");
        System.out.println("******************************");

        System.out.print("Mesafeyi km olarak giriniz: ");
        km=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        System.out.print("1-Tek Yön\n2-Gidiş-Dönüş\nYolculuk tipini seçiniz: ");
        tip=input.nextInt();

        if(km>0 && yas>0 &&(tip==1 || tip==2)){
            //mesafe başına (km) 0.10 TL
            tutar=km*0.10;

            //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
            //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

            if(yas<12){
               indYas=tutar*0.50;
               indTutar=tutar-indYas;
               indTip= (tip==2) ? (indTutar*0.20) : 0;
               toplamTutar=(indTutar-indTip)*tip;
               System.out.print("Bilet fiyatınız: "+toplamTutar);

            }
            //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            else if(yas<24){
                indYas=tutar*0.10;
                indTutar=tutar-indYas;
                indTip= (tip==2) ? (indTutar*0.20) : 0;
                toplamTutar=(indTutar-indTip)*tip;
                System.out.print("Bilet fiyatınız: "+toplamTutar);
            }
            //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır
            else if(yas<65){
                indTip= (tip==2) ? (tutar*0.20) : 0;
                toplamTutar=(tutar-indTip)*tip;
                System.out.print("Bilet fiyatınız: "+toplamTutar);
            }
            else {
                indYas=tutar*0.30;
                indTutar=tutar-indYas;
                indTip= (tip==2) ? (indTutar*0.20) : 0;
                toplamTutar=(indTutar-indTip)*tip;
                System.out.print("Bilet fiyatınız: "+toplamTutar);
            }

        }
        else{
            System.out.print("!! Hatalı veri girildi. !!");
        }

    }
}
/*
Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.

 */